public class film {
    private String id;
    private String tieuDe;
    private String theLoai;
    private Double ranKing;
    private String daoDien;

    // public film(String id, String tieude, String theloai, Double ranking) {
    //     this.id = id;
    //     this.tieude = tieude;
    //     this.theloai = theloai;
    //     this.ranking = ranking;
    // }

    public film() {
        super();
    }
    public String getdaodien() {
        return this.daoDien;
    }
    public void setdaoDien(String daoDien) {
        this.daoDien = daoDien;}



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTieuDe() {
        return this.tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTheLoai() {
        return this.theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Double getRanKing() {
        return this.ranKing;
    }

    public void setRanKing(Double ranKing) {
        this.ranKing = ranKing;
    }
    //thông tin film
    @Override
    public String toString() {
        return 
            " id='" + getId() + "'" +
            ", tieuDe='" + getTieuDe() + "'" +
            ", theLoai='" + getTheLoai() + "'" +
            ", ranKing='" + getRanKing() + "'" +
            ", daoDien='" + getdaodien() + "'" 
           ;
    }

    
}
