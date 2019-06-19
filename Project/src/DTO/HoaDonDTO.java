package DTO;

import java.sql.Date;

public class HoaDonDTO 
{
    private int mahd;
    private int mapt;
    private int manv;
    private Date ngaylap;
    private long thanhtien;
    private String ghichu;

    public HoaDonDTO() {
    }

    public HoaDonDTO(int mahd, int mapt, int manv, Date ngaylap, long thanhtien, String ghichu) {
        this.mahd = mahd;
        this.mapt = mapt;
        this.manv = manv;
        this.ngaylap = ngaylap;
        this.thanhtien = thanhtien;
        this.ghichu = ghichu;
    }
    
    
    public int getMahd() {
        return mahd;
    }

    public int getMapt() {
        return mapt;
    }

    public int getManv() {
        return manv;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public long getThanhtien() {
        return thanhtien;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public void setMapt(int mapt) {
        this.mapt = mapt;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public void setThanhtien(long thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    public Object[] toArray(){
        return new Object[]{mahd, mapt, manv, ngaylap, thanhtien, ghichu};
    }
}
