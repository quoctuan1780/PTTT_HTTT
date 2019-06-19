package DAL;
import DTO.NhanVienDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NhanVienDAL extends ConnectionDB
{
    public static ArrayList<NhanVienDTO> get_all()
    {
        ArrayList<NhanVienDTO> list = new ArrayList();
        String sql = "SELECT * FROM NHANVIEN";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int manv = rs.getInt("MANV");
                String tennv = rs.getString("TENNV");
                String diachi = rs.getString("DIACHI");
                String gioitinh = rs.getString("GIOITINH");
                String sodt = rs.getString("SODT");
                String chucvu = rs.getString("CHUCVU");
                String tendn = rs.getString("TENDN");
                int maquyen = rs.getInt("MAQUYEN");
                
                NhanVienDTO nv_dto  = new NhanVienDTO(manv, tennv, diachi, sodt, chucvu, tendn, maquyen, gioitinh);
                list.add(nv_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public boolean insert_nv(NhanVienDTO nv)
    {
        String sql = "{call SP_THEMNHANVIEN(?, ?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setString(1, nv.getTennv());
            call_proc.setString(2, nv.getDiachi());
            call_proc.setString(3, nv.getGioitinh());
            call_proc.setString(4, nv.getSodt());
            call_proc.setString(5, nv.getChucvu());
            
            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_nv(int manv)
    {
        String sql = "{call SP_XOANHANVIEN(?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, manv);
            
            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_nv(NhanVienDTO nv)
    {
        String sql = "UPDATE NHANVIEN\n" +
                     "SET TENNV = ?, DIACHI = ?, GIOITINH = ?, SODT = ?\n" +
                     "WHERE MANV = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareCall(sql);
            ps.setString(1, nv.getTennv());
            ps.setString(2, nv.getDiachi());
            ps.setString(3, nv.getGioitinh());
            ps.setString(4, nv.getSodt());
            ps.setInt(5, nv.getManv());
            int rs = ps.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<NhanVienDTO> search(String search)
    {
        ArrayList<NhanVienDTO> list = new ArrayList();
        String sql = "SELECT *\n" +
                     "FROM NHANVIEN\n" +
                     "WHERE MANV = ? OR TENNV LIKE '%' + ? + '%' OR DIACHI LIKE '%' + ? + '%' OR GIOITINH LIKE '%' + ? + '%' OR SODT LIKE '%' + ? + '%'\n" +
                     "OR CHUCVU LIKE '%' + ? + '%' OR TENDN LIKE '%' + ? + '%' OR MAQUYEN = ? ";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            if(check_number(search))
            {
                if (search.length() < 6)
                {
                    ps.setInt(1, Integer.parseInt(search));
                    ps.setString(2, null);
                    ps.setString(3, null);
                    ps.setString(4, null);
                    ps.setString(5, search);
                    ps.setString(6, null);
                    ps.setString(7, null);
                    ps.setInt(8, Integer.parseInt(search));
                }
                else
                {
                    ps.setInt(1, -1);
                    ps.setString(2, null);
                    ps.setString(3, null);
                    ps.setString(4, null);
                    ps.setString(5, search);
                    ps.setString(6, null);
                    ps.setString(7, null);
                    ps.setInt(8, -1);
                }
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
                ps.setInt(8, -1);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int manv = rs.getInt("MANV");
                String tennv = rs.getString("TENNV");
                String diachi = rs.getString("DIACHI");
                String gioitinh = rs.getString("GIOITINH");
                String sodt = rs.getString("SODT");
                String chucvu = rs.getString("CHUCVU");
                String tendn = rs.getString("TENDN");
                int maquyen = rs.getInt("MAQUYEN");
                
                NhanVienDTO nv_dto  = new NhanVienDTO(manv, tennv, diachi, sodt, chucvu, tendn, maquyen, gioitinh);
                list.add(nv_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
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
