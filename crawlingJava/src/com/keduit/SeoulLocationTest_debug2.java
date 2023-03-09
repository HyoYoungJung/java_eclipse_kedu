package com.keduit;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocationTest_debug2 {
	List<SeoulLocationVO> list = new ArrayList<>();

	public static void main(String[] args) {

		SeoulLocationTest_debug2 st = new SeoulLocationTest_debug2();
		st.SeoulLocation();
	}

	private void SeoulLocation() {
		SeoulLocationDAO dao = SeoulLocationDAO.newInstance();
		SeoulLocationVO vo = new SeoulLocationVO();
		try {
			for (int i = 1; i <= 36; i++) {
				System.out
						.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓페이지" + i + "/36↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
				Document doc = Jsoup.connect("https://korean.visitseoul.net/attractions?curPage=" + i).get();
				Elements thumb = doc.select("ul.article-list li.item div.thumb");
				Elements title = doc.select("ul.article-list li.item div.infor-element span.title");
				Elements comment = doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
				Elements link = doc.select("ul.article-list li.item a");
//      System.out.println(title.get(0).text());
//      System.out.println(title.text());
//      System.out.println(thumb);
//      System.out.println(comment.text());
//      System.out.println(link);

				for (int j = 0; j < thumb.size(); j++) {

					try {
						System.out.println(j + "번호");

						// title 타이틀 글자 수가 20이상 미만인 경우 조건식
						if (title.get(j).text().length() >= 20) {
							System.out.println(title.get(j).text());
							vo.setTitle(title.get(j).text().substring(0, 20));
						} else {
							System.out.println(title.get(j).text());
							vo.setTitle(title.get(j).text());
						}

						// titleInfo
						if (comment.get(j).text().length() >= 200) {
							System.out.println(comment.get(j).text());
							vo.setTitleInfo(comment.get(j).text().substring(0, 200));
						} else {
							System.out.println(comment.get(j).text());
							vo.setTitleInfo(comment.get(j).text());
						}

						Document doc_s = Jsoup.connect("https://korean.visitseoul.net" + link.get(j).attr("href"))
								.get(); // attr("속성") 해당속성들을 불러오는 함수

						try {
							for (int k = 0; k < 10; k++) {
								// 전화번호
								Element phone1 = doc_s.select("div.detail-map-infor:eq(0) dl dt").get(k);
								if (phone1.text().contains("전화")) {
									Element phone = doc_s.select("div.detail-map-infor:eq(0) dl dd").get(k);
									if (phone.text().length() >= 20) {
										System.out.println(phone1.text() + " : " + phone.text());
										vo.setPhone(phone.text().substring(0, 20));
									} else {
										vo.setPhone(phone.text());
										System.out.println(phone1.text() + " : " + phone.text());
									}
								}

								// 이용시간
								Element info1 = doc_s.select("div.detail-map-infor:eq(0) dl dt").get(k);
								if (info1.text().contains("시간")) {
									Element info = doc_s.select("div.detail-map-infor:eq(0) dl dd").get(k);
									if (info.text().length() >= 100) {
										System.out.println(info1.text() + " : " + info.text().substring(0, 100));
										vo.setInfo(info.text().substring(0, 100));
									} else {
										System.out.println(info1.text() + " : " + info.text());
										vo.setInfo(info.text());
									}
								}
							}
						} catch (Exception e) {
							e.printStackTrace();

						}

						// 주소
						Element address1 = doc_s.select("div.detail-map-infor:eq(1) dl dt").get(0);
						Element address = doc_s.select("div.detail-map-infor:eq(1) dl dd").get(0);
						// Address 주소 길이가 50이상 미만인 경우 조건식
						if (address.text().length() >= 50) {
							System.out.println(address1.text() + " : " + address.text());
							vo.setAddress(address.text().substring(0, 50));
						} else {
							System.out.println(address1.text() + " : " + address.text());
							vo.setAddress(address.text());
						}

						// 교통정보
						Element traffic_information1 = doc_s.select("div.detail-map-infor:eq(1) dl dt").get(1);
						Element traffic = doc_s.select("div.detail-map-infor:eq(1) dl dd").get(1);
						// traffi
						if (traffic.text().length() >= 200) {
							System.out.println(traffic_information1.text() + " : " + traffic.text());
							vo.setTraffic(traffic.text().substring(0, 200));
						} else {
							System.out.println(traffic_information1.text() + " : " + traffic.text());
							vo.setTraffic(traffic.text());
						}

						System.out.println("----------------------------------------------------------------------");

						vo.setNo(j);

						dao.SeoulLocationInsert(vo);

					} catch (Exception e) {
						e.printStackTrace();

					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}

// 경원님 코드
