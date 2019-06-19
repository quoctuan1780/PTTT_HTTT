package DAL;


import DTO.KhachHangDTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAL  extends ConnectionDB
{
    private static final String SELECT_ALL = "SELECT * FROM KHACHHANG";
    public static ArrayList<KhachHangDTO> getAllKhachHang(){
        ArrayList<KhachHangDTO> list = new ArrayList<>();
        getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SELECT_ALL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int maKH = rs.getInt("MAKH");
                String tenKH = rs.getString("TENKH");
                String CMND = rs.getString("SO_CMND");
                String gioiTinh = rs.getString("GIOITINH");
                String diaChi = rs.getString("DIACHI");
                String soDT = rs.getString("SODT");
                String quocTich = rs.getString("QUOCTICH");
                KhachHangDTO kh = new KhachHangDTO(maKH, tenKH, diaChi, gioiTinh, soDT, CMND, quocTich);
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean insert_kh(KhachHangDTO kh)
    {
        String sql = "{call SP_THEMKHACHHANG(?, ?, ?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setString(1, kh.getTenKH());
            call_proc.setString(2, kh.getDiaChi());
            call_proc.setString(3, kh.getGioiTinh());
            call_proc.setString(4, kh.getSoDT());
            call_proc.setString(5, kh.getCMND());
            call_proc.setString(6, kh.getQuocTich());
            
            int rs = call_proc.executeUpdate();
            if (rs  > 0)
            {
                getClose();
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_kh(int makh)
    {
        String sql = "DELETE FROM KHACHHANG WHERE MAKH = ?";
        getConnection();
        PreparedStatement ps;
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, makh);
            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_kh(KhachHangDTO kh)
    {
        String sql = "{call SP_UPDATEKHACHHANG(?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, kh.getMaKH());
            call_proc.setString(2, kh.getTenKH());
            call_proc.setString(3, kh.getDiaChi());
            call_proc.setString(4, kh.getGioiTinh());
            call_proc.setString(5, kh.getSoDT());
            call_proc.setString(6, kh.getCMND());
            call_proc.setString(7, kh.getQuocTich());
            
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<KhachHangDTO> search_ttkh(String search)
    {
        ArrayList<KhachHangDTO> list_kh = new ArrayList();
        String sql = "SELECT * FROM KHACHHANG WHERE MAKH = ? OR TENKH LIKE '%' + ? + '%' OR "
                + "DIACHI LIKE '%' + ? + '%' OR GIOITINH LIKE '%' + ? + '%' OR SODT LIKE '%' + ? + '%' OR "
                + "SO_CMND LIKE '%' + ? + '%' OR QUOCTICH LIKE '%' + ? + '%'";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            if(check_number(search))
            {
                ps.setInt(1, Integer.parseInt(search));
                ps.setString(2, search);
                ps.setString(3, search);
                ps.setString(4, search);
                ps.setString(5, search);
                ps.setString(6, search);
                ps.setString(7, search);
            }
            else
            {
                ps.setInt(1, -1);
                ps.setString(2, search);
                ps.setString(3, search);
                ps.setString(4, search);
                ps.setString(5, search);
                ps.setString(6, search);
                ps.setString(7, search);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int makh = rs.getInt("MAKH");
                String tenkh = rs.getString("TENKH");
                String diachi = rs.getString("DIACHI");
                String gioitinh = rs.getString("GIOITINH");
                String sodt = rs.getString("SODT");
                String cmnd = rs.getString("SO_CMND");
                String quoctich = rs.getString("QUOCTICH");
                
                KhachHangDTO kh_dto = new KhachHangDTO(makh, tenkh, diachi, gioitinh, sodt, cmnd, quoctich);
                
                list_kh.add(kh_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);    
        }
        getClose();
        return list_kh;
    }
    public int get_makh(String tenkh, String sodt, String cmnd)
    {
        int makh = 0;
        String sql = "SELECT MAKH FROM KHACHHANG WHERE TENKH = ? AND SODT = ? AND SO_CMND = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, tenkh);
            ps.setString(2, sodt);
            ps.setString(3, cmnd);
            ResultSet rs = ps.executeQuery();
            rs.next();
            makh = rs.getInt("MAKH");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);       
        }
        return makh;
    }
    public boolean check_number(String sData)
    {
        for (int i = 0; i < sData.length(); i++) 
        { 
            if (sData.charAt(i) < '0' || sData.charAt(i) > '9') return false;
            if (i + 1 == sData.length()) return true;
        }
        return false;
    }
}
