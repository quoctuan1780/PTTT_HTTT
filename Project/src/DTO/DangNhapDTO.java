
package DTO;

public class DangNhapDTO {
    private String tenDangNhap;
    private String matKhau;

    public DangNhapDTO(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public DangNhapDTO() {
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public Object[] toArray(){
        return new Object[]{matKhau,tenDangNhap};
    }

    @Override
    public String toString() {
        return "Username: " + tenDangNhap + "\t, Password: " + matKhau;
    }
    
    
}
