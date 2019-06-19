package DTO;

import java.sql.Date;

public class PhieuThuePhongDTO 
{
    
    private int maPT;
    private int maPhong;
    private int maKH;
    private Date ngayThue;
    private Date ngayTra;
    private int slkhach;
    private String trangthai;

    public PhieuThuePhongDTO(int maPT, int maPhong, int maKH, Date ngayThue, Date ngayTra, int slkhach, String trangthai) {
        this.maPT = maPT;
        this.maPhong = maPhong;
        this.maKH = maKH;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.slkhach = slkhach;
        this.trangthai = trangthai;
    }

    public PhieuThuePhongDTO() {
    }

    public int getMaPT() {
        return maPT;
    }

    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }
    
    public String getTrangThai()
    {
        return this.trangthai;
    }
    
    public void setTrangThai(String trangthai)
    {
        this.trangthai = trangthai;
    }
    
    public int getSlKhach()
    {
        return this.slkhach;
    }
    
    public void setSlKhach(int sl)
    {
        this.slkhach = sl;
    }
    
    public Object[] toArray(){
        return new Object[]{maPT, maPhong, maKH, ngayThue, ngayTra, slkhach, trangthai};
    }
}
