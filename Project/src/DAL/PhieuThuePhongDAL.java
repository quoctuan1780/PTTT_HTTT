package DAL;
import DTO.PhieuThuePhongDTO;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PhieuThuePhongDAL  extends ConnectionDB
{
    public static ArrayList<PhieuThuePhongDTO> get_all()
    {
        ArrayList<PhieuThuePhongDTO> list = new ArrayList();
        String sql = "SELECT * FROM PHIEUTHUE";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int mapt = rs.getInt("MAPT");
                int maphong = rs.getInt("MAPHONG");
                int makh = rs.getInt("MAKH");
                Date ngaythue = rs.getDate("NGAYTHUE");
                Date ngaytra = rs.getDate("NGAYTRA");
                int slkhach = rs.getInt("SLKHACH");
                String trangthai = rs.getString("TRANGTHAI");
                PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO(mapt, maphong, makh, ngaythue, ngaytra, slkhach, trangthai);
                
                list.add(pt_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public boolean insert_pt_hsdt(PhieuThuePhongDTO pt)
    {
        String sql = "{call SP_THEMPHIEUTHUE_HSDT(?, ?, ?, ? ,?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, pt.getMaPhong());
            call_proc.setInt(2, pt.getMaKH());
            call_proc.setDate(3, pt.getNgayThue());
            call_proc.setDate(4, pt.getNgayTra());
            call_proc.setInt(5, pt.getSlKhach());
            int rs = call_proc.executeUpdate();
            if(rs > 0) 
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean insert_pt(PhieuThuePhongDTO pt)
    {
        String sql = "{call SP_THEMPHIEUTHUE(?, ?, ?, ? , ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, pt.getMaPhong());
            call_proc.setInt(2, pt.getMaKH());
            call_proc.setDate(3, pt.getNgayThue());
            call_proc.setDate(4, pt.getNgayTra());
            call_proc.setInt(5, pt.getSlKhach());
            int rs = call_proc.executeUpdate();
            if(rs > 0) 
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_pt(int mapt)
    {
        String sql = "{call SP_XOAPHIEUTHUE(?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, mapt);
            int rs = call_proc.executeUpdate();
            if(rs > 0) 
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_pt(PhieuThuePhongDTO pt)
    {
        String sql = "UPDATE PHIEUTHUE SET NGAYTHUE = ?, NGAYTRA = ?, SLKHACH = ? WHERE MAPT = ? AND MAPHONG = ? AND MAKH = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setDate(1, pt.getNgayThue());
            ps.setDate(2, pt.getNgayTra());
            ps.setInt(3, pt.getSlKhach());
            ps.setInt(4, pt.getMaPT());
            ps.setInt(5, pt.getMaPhong());
            ps.setInt(6, pt.getMaKH());
            
            int rs = ps.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public String get_trangthai_pt(int mapt, int maphong, int makh)
    {
        String tt = "NO";
        String sql = "SELECT TRANGTHAI FROM PHIEUTHUE WHERE MAPT = ? AND MAPHONG = ? AND MAKH = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mapt);
            ps.setInt(2, maphong);
            ps.setInt(3, makh);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            tt = rs.getString("TRANGTHAI");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return tt;
    }
    public static ArrayList<PhieuThuePhongDTO> get_all_ptqh()
    {
        ArrayList<PhieuThuePhongDTO> list = new ArrayList();
        String sql = "SELECT * FROM PHIEUTHUE WHERE DATEDIFF(DAY, NGAYTRA, GETDATE()) > 0 AND TRANGTHAI = 'NO' "
                        + "ORDER BY NGAYTRA DESC";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int mapt = rs.getInt("MAPT");
                int maphong = rs.getInt("MAPHONG");
                int makh = rs.getInt("MAKH");
                Date ngaythue = rs.getDate("NGAYTHUE");
                Date ngaytra = rs.getDate("NGAYTRA");
                int slkhach = rs.getInt("SLKHACH");
                String trangthai = rs.getString("TRANGTHAI");
                PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO(mapt, maphong, makh, ngaythue, ngaytra, slkhach, trangthai);
                
                list.add(pt_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public ArrayList<PhieuThuePhongDTO> search(String search_pt)
    {
        ArrayList<PhieuThuePhongDTO> list = new ArrayList();
        String sql = "SELECT *\n" +
                        "FROM PHIEUTHUE\n" +
                        "WHERE MAPT = ? OR MAPHONG = ? OR MAKH = ? OR YEAR(NGAYTHUE) = ? OR MONTH(NGAYTHUE) = ? OR DAY(NGAYTHUE) = ? \n" +
                         "OR YEAR(NGAYTRA) = ? OR MONTH(NGAYTRA) = ? OR DAY(NGAYTRA) = ? OR SLKHACH = ? OR TRANGTHAI LIKE '%' + ? + '%'";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            if (check_number(search_pt))
            {
                int search = Integer.parseInt(search_pt);
                ps.setInt(1, search);
                ps.setInt(2, search);
                ps.setInt(3, search);
                ps.setInt(4, search);
                ps.setInt(5, search);
                ps.setInt(6, search);
                ps.setInt(7, search);
                ps.setInt(8, search);
                ps.setInt(9, search);
                ps.setInt(10, search);
                ps.setString(11, null);
            }
            else
            {
                int search = -1;
                ps.setInt(1, search);
                ps.setInt(2, search);
                ps.setInt(3, search);
                ps.setInt(4, search);
                ps.setInt(5, search);
                ps.setInt(6, search);
                ps.setInt(7, search);
                ps.setInt(8, search);
                ps.setInt(9, search);
                ps.setInt(10, search);
                ps.setString(11, search_pt);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int mapt = rs.getInt("MAPT");
                int maphong = rs.getInt("MAPHONG");
                int makh = rs.getInt("MAKH");
                Date ngaythue = rs.getDate("NGAYTHUE");
                Date ngaytra = rs.getDate("NGAYTRA");
                int slkhach = rs.getInt("SLKHACH");
                String trangthai = rs.getString("TRANGTHAI");
                PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO(mapt, maphong, makh, ngaythue, ngaytra, slkhach, trangthai);
                
                list.add(pt_dto);
            }
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhieuThuePhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
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
