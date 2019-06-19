package DTO;

public class NhanVienDTO 
{
    private int manv;
    private String tennv;
    private String diachi;
    private String sodt;
    private String chucvu;
    private String tendn;
    private int maquyen;
    private String gioitinh;

    public NhanVienDTO() {
    }

    public NhanVienDTO(int manv, String tennv, String diachi, String sodt, String chucvu, String tendn, int maquyen, String gioitinh) {
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.sodt = sodt;
        this.chucvu = chucvu;
        this.tendn = tendn;
        this.maquyen = maquyen;
        this.gioitinh = gioitinh;
    }

    public String getChucvu() {
        return chucvu;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getManv() {
        return manv;
    }

    public int getMaquyen() {
        return maquyen;
    }

    public String getSodt() {
        return sodt;
    }

    public String getTendn() {
        return tendn;
    }

    public String getTennv() {
        return tennv;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public void setMaquyen(int maquyen) {
        this.maquyen = maquyen;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }
    
    public Object[] toArray()
    {
        return new Object[] {manv, tennv, diachi, gioitinh, sodt, chucvu, tendn, maquyen};
    }
}
