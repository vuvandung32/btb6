public class series {
    private int soTap;
    private  int thoiLuongTb;
    film film; 

    public film getFilm() {
        return this.film;
    }

    public void setFilm(film film) {
        this.film = film;
    }
    public series(){

    }

    public int getSoTap() {
        return this.soTap;
    }

    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    public int getThoiLuongTb() {
        return this.thoiLuongTb;
    }

    public void setThoiLuongTb(int thoiLuongTb) {
        this.thoiLuongTb = thoiLuongTb;
    }



    @Override
    public String toString() {
        return  
         "id='" + getFilm().getId() + "'" +
        "- tieu de='" + getFilm().getTieuDe() + "'" +
        "- the loai='" + getFilm().getTheLoai() + "'" +
        "- Ranking='" + getFilm().getRanKing() + "'" +
            "- soTap='" + getSoTap() + "'" +
            "- thoiLuongTb='" + getThoiLuongTb() + "'" 
          ;
    }

}
