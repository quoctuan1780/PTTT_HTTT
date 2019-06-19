package DTO;

import java.sql.Date;

public class ThongTinDatPhongTruocDTO 
{
    private int maphong;
    private String tenKH;
    private String quocTich;
    private String CMND;
    private String diaChi;
    private String soDT;
    private String gioiTinh;
    private Date ngdk_o;

    public ThongTinDatPhongTruocDTO (int maphong, String tenKH, String diaChi, String gioiTinh, String soDT, String CMND, String quocTich, Date ngay_o) 
    {
        this.maphong = maphong;
        this.tenKH = tenKH;
        this.quocTich = quocTich;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.ngdk_o = ngay_o;
    }

    public ThongTinDatPhongTruocDTO () {
    }
    
    public int get_maphong()
    {
        return maphong;
    }
    
    public void set_maphong(int maphong)
    {
        this.maphong = maphong;
    }
    
    public Date get_ngay_o()
    {
        return ngdk_o;
    }
    
    public void set_ngay_o(Date ngay_o)
    {
        ngdk_o = ngay_o;
    }
    
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
 
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public Object[] toArray(){
        return new Object[]{maphong, tenKH, diaChi, gioiTinh, soDT, CMND, quocTich, ngdk_o};
    }
}
