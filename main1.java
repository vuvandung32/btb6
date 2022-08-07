import java.util.Arrays;
import java.util.Scanner;

public class main1 {
  public static void main(String[] args) {

    film film1 = new film();
    film1.setId("F11");
    film1.setRanKing(4.1);
    film1.setTheLoai(enum1.DOCUMENTATRY.name());
    film1.setTieuDe("chiến tranh biên giới");

    film film2 = new film();
    film2.setId("F12");
    film2.setRanKing(3.1);
    film2.setTheLoai(enum1.COMEDY.name());
    film2.setTieuDe("bảo vệ gái làng");

    film film3 = new film();
    film3.setId("F13");
    film3.setRanKing(6.5);
    film3.setTheLoai(enum1.HORROR.name());
    film3.setTieuDe("tử tù vùng");

    film film4 = new film();
    film4.setId("F14");
    film4.setRanKing(9.8);
    film4.setTheLoai(enum1.OGY.name());
    film4.setTieuDe("mèo ogy ");

    film film5 = new film();
    film5.setId("F15");
    film5.setRanKing(6.6);
    film5.setTheLoai(enum1.PIKACHU.name());
    film5.setTieuDe("pikachu");

    movie movie1 = new movie();
    movie1.setThoiLuong(25);
    movie1.setFilm(film1);

    movie movie2 = new movie();
    movie2.setThoiLuong(90);
    movie2.setFilm(film2);

    movie movie3 = new movie();
    movie3.setThoiLuong(70);
    movie3.setFilm(film3);

    movie movie4 = new movie();
    movie4.setThoiLuong(55);
    movie4.setFilm(film4);

    movie movie5 = new movie();
    movie5.setThoiLuong(25);
    movie5.setFilm(film5);

    series series1 = new series();
    series1.setSoTap(100);
    series1.setThoiLuongTb(50);
    series1.setFilm(film1);

    series series2 = new series();
    series2.setSoTap(50);
    series2.setThoiLuongTb(55);
    series2.setFilm(film2);

    series series3 = new series();
    series3.setSoTap(99);
    series3.setThoiLuongTb(79);
    series3.setFilm(film3);

    series series4 = new series();
    series4.setSoTap(45);
    series4.setThoiLuongTb(56);
    series4.setFilm(film4);

    series series5 = new series();
    series5.setSoTap(56);
    series5.setThoiLuongTb(46);
    series5.setFilm(film5);

    // set du lieu vao mang
    movie mv[] = new movie[5];
    mv[0] = movie1;
    mv[1] = movie2;
    mv[2]= movie3;
    mv[3]= movie4;
    mv[4]= movie5;
    // set du lieu vao mang
    series sr[] = new series[5];
    sr[0] = series1;
    sr[1] = series2;
    sr[2] = series3;
    sr[3]= series4;
    sr[4]= series5;

    // System.out.println("ds phim");
    // for (movie movie : mv) {
    //   System.out.println(movie.toString());
    // }

    // System.out.println("ds sr phim");
    // for (series series : sr) {
    //   System.out.println(series.toString());
    // }

    // Scanner scanner = new Scanner(System.in);
    // System.out.println( "nhập từ khóa tiêu đề film:");
    // String tenFilm = scanner.nextLine();
    // for (int i=0; i<mv.length;i++ ) {
    //   if(mv[i].film.getTieuDe().contains(tenFilm)){
    //     System.out.println(mv[i].toString());

    //   }

      
    // }

    // System.out.println("nhap series film");
    // String tenSeries = scanner.nextLine();
    // for (series series : sr) {
    //   if(series.film.getTieuDe().contains(tenSeries)){
    //     System.out.println(series.toString());
    //   }

      
    // }

    double thapNhatranKing = mv[0].film.getRanKing();
    for (int i=0 ; i<mv.length; i++) {
      
      if(mv[i].film.getRanKing()<thapNhatranKing){
        thapNhatranKing=mv[i].film.getRanKing();

          System.out.println(mv[i].toString());
      }
      
      
    }


   
    

  }

  enum enum1 {
    HORROR,
    COMEDY,
    DOCUMENTATRY,
    OGY,
    PIKACHU,
  }


}
