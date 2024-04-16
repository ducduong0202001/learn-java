package OOP;

public abstract class Animal {

    private String mauLong;
    private String giongLoai;

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getGiongLoai() {
        return giongLoai;
    }

    public void setGiongLoai(String giongLoai) {
        this.giongLoai = giongLoai;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getLoaiThucAn() {
        return loaiThucAn;
    }

    public void setLoaiThucAn(String loaiThucAn) {
        this.loaiThucAn = loaiThucAn;
    }

    private int soChan;
    private String loaiThucAn;

    public void getInfo(String loai) {

    }

    public void getInfo(String loai, int soChan) {

    }

    public void getInfo(String loai, int soChan, String loaiThucAn, String mauLong) {

    }

    abstract void getSound(String soung);
}
