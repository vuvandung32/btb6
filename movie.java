public class movie extends film {
    private int thoiLuong;
    film film;


    public movie() {
        
    }
    
    public int getThoiLuong() {
        return this.thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public film getFilm() {
        return this.film;
    }

    public void setFilm(film film) {
        this.film = film;
    }
    //thông tin film
    @Override
    public String toString() {
        return 
            " id='" + getFilm().getId() + "'" +
            "- tieu de='" + getFilm().getTieuDe() + "'" +
            "- the loai='" + getFilm().getTheLoai() + "'" +
            "- Ranking='" + getFilm().getRanKing() + "'" +
            "- thoiLuong='" + getThoiLuong() + "'" 
            ;
    }
    
    
}
