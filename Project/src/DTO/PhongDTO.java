package DTO;

public class PhongDTO {
    private int maPhong;
    private String loaiPhong;
    private long gia;
    private int soLuong;
    private String tinhTrang;

    public PhongDTO(int maPhong, String loaiPhong, int gia, int soLuong, String tinhTrang) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.gia = gia;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }
    public PhongDTO()
    {
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public Object[] toArray(){
        return new Object[]{maPhong, loaiPhong, gia, soLuong, tinhTrang};
    }
}
