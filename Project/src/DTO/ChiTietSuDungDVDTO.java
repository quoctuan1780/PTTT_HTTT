package DTO;

import java.sql.Date;

public class ChiTietSuDungDVDTO 
{
    private int mapt;
    private int madv;
    private Date ngaysd;
    private int soluong;

    public ChiTietSuDungDVDTO() {
    }

    public ChiTietSuDungDVDTO(int mapt, int madv, Date ngaysd, int soluong) {
        this.madv = madv;
        this.mapt = mapt;
        this.ngaysd = ngaysd;
        this.soluong = soluong;
    }

    public int getMadv() {
        return madv;
    }

    public int getMapt() {
        return mapt;
    }

    public Date getNgaysd() {
        return ngaysd;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setMadv(int madv) {
        this.madv = madv;
    }

    public void setMapt(int mapt) {
        this.mapt = mapt;
    }

    public void setNgaysd(Date ngaysd) {
        this.ngaysd = ngaysd;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toArray(){
        return new Object[] {mapt, madv, ngaysd, soluong};
    }
}
