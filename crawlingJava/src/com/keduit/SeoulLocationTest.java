package com.keduit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocationTest {
	List<SeoulLocationVO> list = new ArrayList<>();

	public static void main(String[] args) {
		SeoulLocationTest st = new SeoulLocationTest();
		st.seoulLocation();

	}

	private void seoulLocation() {

		SeoulLocationDAO dao = SeoulLocationDAO.newInstance();

		try {
			for (int i = 1; i <= 36; i++) { // 1~36 페이지까지 가져오기 위한 포문

				Document doc = Jsoup.connect("https://korean.visitseoul.net/attractions?curPage=" + i).get();
				Elements thumb = doc.select("ul.article-list li.item div.thumb");
				Elements title = doc.select("ul.article-list li.item div.infor-element span.title");
				Elements comment = doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
				Elements link = doc.select("ul.article-list li.item a");

//			System.out.println(thumb);
//			System.out.println(comment);
//			System.out.println(link);
//			System.out.println(title.get(0).text());

				for (int j = 0; j < thumb.size(); j++) {

					try {
						System.out.println("번호" + j);
						System.out.println(title.get(j).text());
						System.out.println(comment.get(j).text());

						Document doc_s = Jsoup.connect("https://korean.visitseoul.net" + link.get(j).attr("href"))
								.get();
						Element address = doc_s.select("div.detail-map-infor:eq(1) dl dd").get(0);
						Element phone = doc_s.select("div.detail-map-infor:eq(0) dl dd").get(0);

						// 이용시간 교통정보 가져오기 (div 클래스 = detail-map-infor가 2개라 eq(0 or 1)번으로 몇번째건지 선택해줌)
						Element info = doc_s.select("div.detail-map-infor:eq(0) dl dd").get(4);
						Element traffic = doc_s.select("div.detail-map-infor:eq(1) dl dd").get(1);
						// * 이용시간이 모든 페이지에 있는 것이 아니라 오류 발생함
						// 해결① 전체에 트라이캐치 씌움
						// 해결② 마지막에 .get으로 안가져오고 아예 이렇게
						// Element time = doc_s.select("div.border dl:eq(4) dd")로 쓰면
						// try-catch없이도 항목이 없는 부분은 건너뛰고 진행됨.

						System.out.println("주소: " + address.text());
						System.out.println("전화번호: " + phone.text());

						System.out.println("이용시간: " + info.text());
						System.out.println("교통정보: " + traffic.text());
						System.out.println("----------------------------------------");

						SeoulLocationVO vo = new SeoulLocationVO();

						vo.setNo(j);
						vo.setTitle(title.get(j).text());
						vo.setTitleInfo(comment.get(j).text());
						vo.setAddress(address.text());
						vo.setInfo(info.text());
						vo.setPhone(phone.text());
						vo.setTraffic(traffic.text());

						dao.SeoulLocationInsert(vo); // 웹 크롤링해서 가져온 것 화면에 뿌리고, 한건 한건 집어넣어라

					} catch (IndexOutOfBoundsException e) {
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
