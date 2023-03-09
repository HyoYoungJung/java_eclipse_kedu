package com.keduit;

import java.io.IOException;
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
			for (int i = 1; i <= 50; i++) { // 1~50 페이지까지 가져오기
				num++;
				Document doc = Jsoup.connect(
						"http://www.yes24.com/24/Category/BestSeller?CategoryNumber=001&sumgb=06&PageNumber=" + i)
						.get();
				Elements thumb = doc.select("table.list td.image div.goodsImgW"); // 썸넬이미지
				Elements title = doc.select("table.list td.goodsTxtInfo p:eq(0) a:eq(0)"); // 첫번째p의 첫번째a
//				Elements comment = doc.select("table.list td.line p.read"); // 책설명
				Elements link = doc.select("table.list td.image div.goodsImgW a:nth-child(1)"); // 썸넬링크

//				System.out.println(link.get(0).attr("href"));

				for (int j = 0; j < thumb.size(); j++) {
					System.out.println("번호: " + num);
					num++;
					try {
						System.out.println("책이름: " + title.get(j).text());
//						System.out.println("도서내용: " + comment.get(j).text());

						Document doc_s = Jsoup.connect("http://www.yes24.com" + link.get(j).attr("href")).get();

						Elements writer = doc_s.select("div.gd_infoTop span.gd_pubArea span");
						Element publisher = doc_s.select("div.gd_infoTop span.gd_pubArea span.gd_pub").get(0);
						Element releaseDate = doc_s.select("div.gd_infoTop span.gd_pubArea span.gd_date").get(0);
						Elements price = doc_s.select("div.gd_infoTb em.yes_m");

						System.out.println("저자: " + writer.get(0).text());
						System.out.println("출판사: " + publisher.text());
						System.out.println("출간일: " + releaseDate.text());
						System.out.println("가격: " + price.get(0).text());
						System.out.println("----------------------------------------");

						BestSellerVO vo = new BestSellerVO();

						vo.setNo(j);
						vo.setBookName(title.get(j).text());
//						vo.setBookInfo(comment.get(j).text());
						vo.setWriter(writer.get(0).text());
						vo.setPublisher(publisher.text());
						vo.setReleaseDate(releaseDate.text());
						vo.setPrice(price.get(0).text());

						dao.BestSellerInsert(vo);

					} catch (IndexOutOfBoundsException e) {
						e.printStackTrace();
					}
				}
				num = num - 1;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
