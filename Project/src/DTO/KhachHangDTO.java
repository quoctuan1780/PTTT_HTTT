package DTO;

public class KhachHangDTO {
    private int maKH;
    private String tenKH;
    private String quocTich;
    private String CMND;
    private String diaChi;
    private String soDT;
    private String gioiTinh;

    public KhachHangDTO(int maKH, String tenKH, String diaChi, String gioiTinh,
            String soDT, String CMND, String quocTich) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.quocTich = quocTich;
        this.CMND = CMND;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
    }

    public KhachHangDTO() {
    }
    
    

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
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
        return new Object[]{maKH,tenKH,diaChi,gioiTinh,soDT,CMND,quocTich};
    }
}
