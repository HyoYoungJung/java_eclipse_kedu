package com.keduit;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BestSellerTest {
	List<BestSellerVO> list = new ArrayList<>();

	public static void main(String[] args) {
		BestSellerTest st = new BestSellerTest();
		st.bestSeller();
	}

	private void bestSeller() {
		int num = 0;
		BestSellerDAO dao = BestSellerDAO.newInstance();
		try {
			for (int i = 1; i <= 50; i++) { // 1~50 페이지까지
				num++;
				Document doc = Jsoup.connect(
						"http://www.yes24.com/24/Category/BestSeller?CategoryNumber=001&sumgb=06&PageNumber=" + i)
						.get();

				Elements thumb = doc.select("table.list td.image div.goodsImgW"); // 썸넬이미지
				Elements title = doc.select("table.list td.goodsTxtInfo p:eq(0) a:eq(0)"); // 책제목: 첫번째p의 첫번째a
				Elements link = doc.select("table.list td.image div.goodsImgW a:nth-child(1)"); // 썸넬링크

				Elements imgSrc = doc.select("table.list td.image div.goodsImgW a:eq(0)>img");
				String adult = "http://image.yes24.com/sysimage/pd_19_s.gif";

//				System.out.println(link.get(0).attr("href"));
//				System.out.println(imgSrc.get(j).attr("src"));

				for (int j = 0; j < thumb.size(); j++) { // 페이지 내 썸넬 수 만큼
					System.out.println("번호: " + num);
					num++;

					Document doc_s = Jsoup.connect("http://www.yes24.com" + link.get(j).attr("href")).get();

					BestSellerVO vo = new BestSellerVO();

					vo.setNo(j);
					vo.setBookName(title.get(j).text());
					System.out.println("책이름: " + title.get(j).text());

					Elements writer, price;
					Element publisher, releaseDate;

					if (imgSrc.get(j).attr("src").equals(adult)) {
						System.out.println("19세 이상 상품 : 본인 인증 후 정보를 조회할 수 있습니다. ");
						System.out.println("----------------------------------------");
						continue;
					} else {
						writer = doc_s.select("div.gd_infoTop span.gd_pubArea span");
						System.out.println("저자: " + writer.get(0).text());

						publisher = doc_s.select("div.gd_infoTop span.gd_pubArea span.gd_pub").get(0);
						System.out.println("출판사: " + publisher.text());

						releaseDate = doc_s.select("div.gd_infoTop span.gd_pubArea span.gd_date").get(0);
						System.out.println("출간일: " + releaseDate.text());

						price = doc_s.select("div.gd_infoTb em.yes_m");
						System.out.println("가격: " + price.get(0).text());

					}
					System.out.println("----------------------------------------");

					vo.setWriter(writer.get(0).text());
					vo.setPublisher(publisher.text());
					vo.setReleaseDate(releaseDate.text());
					vo.setPrice(price.get(0).text());

					dao.BestSellerInsert(vo);
				}
				num = num - 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
