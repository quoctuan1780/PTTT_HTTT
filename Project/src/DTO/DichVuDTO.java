package DTO;

public class DichVuDTO 
{
    private int maDV;
    private String tenDV;
    private long giaDv;

    public DichVuDTO(int madv, String tendv, long gia) 
    {
        this.maDV = madv;
        this.tenDV = tendv;
        this.giaDv = gia;
    }

    public DichVuDTO() {
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public long getGiaDv() {
        return giaDv;
    }

    public void setGiaDv(long gia) {
        this.giaDv = gia;
    }
    
    public Object[] toArray(){
        return new Object[]{maDV, tenDV, giaDv};
    }
}
