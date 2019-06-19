package DAL;
import java.sql.*;
import java.util.ArrayList;
import DTO.ThongTinDatPhongTruocDTO;
import DTO.KhachHangDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThongTinDatPhongTruocDAL extends ConnectionDB
{
    public static ArrayList<ThongTinDatPhongTruocDTO> get_all()
    {
        ArrayList<ThongTinDatPhongTruocDTO> list_info = new ArrayList();
        String sql = "SELECT * FROM HS_DATTRUOC";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int maphong = rs.getInt("MAPHONG");
                String tenKH = rs.getString("TENKH");
                String CMND = rs.getString("SO_CMND");
                String gioiTinh = rs.getString("GIOITINH");
                String diaChi = rs.getString("DIACHI");
                String soDT = rs.getString("SODT");
                String quocTich = rs.getString("QUOCTICH");
                Date ngay_o = rs.getDate("NGAY_DUKIEN_O");
                
                ThongTinDatPhongTruocDTO ttdpt = new ThongTinDatPhongTruocDTO(maphong, tenKH, diaChi, gioiTinh, soDT, CMND, quocTich, ngay_o);
                list_info.add(ttdpt);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list_info;
    }
    public boolean insert_ttdpt(ThongTinDatPhongTruocDTO tt)
    {
        String sql = "{call SP_THEMHS_DATTRUOC(?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, tt.get_maphong());
            call_proc.setString(2, tt.getTenKH());
            call_proc.setString(3, tt.getDiaChi());
            call_proc.setString(4, tt.getGioiTinh());
            call_proc.setString(5, tt.getSoDT());
            call_proc.setString(6, tt.getCMND());
            call_proc.setString(7, tt.getQuocTich());
            call_proc.setDate(8, tt.get_ngay_o());
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_ttdpt(ThongTinDatPhongTruocDTO tt)
    {
        String sql = "{call SP_XOAHS_DATTRUOC(?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, tt.get_maphong());
            call_proc.setString(2, tt.getTenKH());
            call_proc.setString(3, tt.getDiaChi());
            call_proc.setString(4, tt.getGioiTinh());
            call_proc.setString(5, tt.getSoDT());
            call_proc.setString(6, tt.getCMND());
            call_proc.setString(7, tt.getQuocTich());
            call_proc.setDate(8, tt.get_ngay_o());
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_ttdpt(ThongTinDatPhongTruocDTO tt)
    {
        String sql = "UPDATE HS_DATTRUOC SET TENKH = ?, DIACHI = ?, GIOITINH = ?, SODT = ?, SO_CMND = ?, QUOCTICH = ?, NGAY_DUKIEN_O = ? WHERE MAPHONG = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, tt.getTenKH());
            ps.setString(2, tt.getDiaChi());
            ps.setString(3, tt.getGioiTinh());
            ps.setString(4, tt.getSoDT());
            ps.setString(5, tt.getCMND());
            ps.setString(6, tt.getQuocTich());
            ps.setDate(7, tt.get_ngay_o());
            ps.setInt(8, tt.get_maphong());
            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<KhachHangDTO> search_ttkh(String ten_kh, String text)
    {
        ArrayList<KhachHangDTO> list_kh = new ArrayList();
        String sql = "SELECT * FROM KHACHHANG WHERE TENKH = ? AND (SODT = ? OR SO_CMND = ?)";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, ten_kh);
            ps.setString(2, text);
            ps.setString(3, text);
            
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
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);       
        }
        return makh;
    }
    public ArrayList<ThongTinDatPhongTruocDTO> search_tths(String text)
    {
        ArrayList<ThongTinDatPhongTruocDTO> list_ttdpt = new ArrayList();
        String sql = "SELECT * FROM HS_DATTRUOC WHERE TENKH LIKE '%' + ? + '%' OR "
                + "GIOITINH LIKE '%' + ? + '%' OR DIACHI LIKE '%' + ? +'%'  OR SODT LIKE '%' + ? + '%' OR "
                + "SO_CMND LIKE '%' + ? + '%' OR QUOCTICH LIKE '%' + ? + '%'";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, text);
            ps.setString(2, text);
            ps.setString(3, text);
            ps.setString(4, text);
            ps.setString(5, text);
            ps.setString(6, text);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int maphong = rs.getInt("MAPHONG");
                String tenkh = rs.getString("TENKH");
                String diachi = rs.getString("DIACHI");
                String gioitinh = rs.getString("GIOITINH");
                String sodt = rs.getString("SODT");
                String cmnd = rs.getString("SO_CMND");
                String quoctich = rs.getString("QUOCTICH");
                Date ngaydukien = rs.getDate("NGAY_DUKIEN_O");
                ThongTinDatPhongTruocDTO ttdpt_dto = new ThongTinDatPhongTruocDTO(maphong, tenkh, diachi, gioitinh, sodt, cmnd, quoctich, ngaydukien);
                
                list_ttdpt.add(ttdpt_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongTinDatPhongTruocDAL.class.getName()).log(Level.SEVERE, null, ex);    
        }
        getClose();
        return list_ttdpt;
    }
}
