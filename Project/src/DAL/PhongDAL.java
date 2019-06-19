package DAL;

import static DAL.ConnectionDB.*;
import DTO.PhongDTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhongDAL {
    private static final String SELECT_ALL = "SELECT * FROM PHONG ORDER BY MAPHONG";
    public static ArrayList<PhongDTO>getAllPhong(){
        ArrayList<PhongDTO> list = new ArrayList<>();
        getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(SELECT_ALL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int maPhong = rs.getInt("MAPHONG");
                String loaiPhong = rs.getString("LOAIPHONG");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SLKHACH");
                String tinhTrang = rs.getString("TINHTRANG");
                PhongDTO phong = new PhongDTO(maPhong, loaiPhong, gia, soLuong, tinhTrang);
                list.add(phong);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean insert_phong(PhongDTO ph)
    {
        String sql = "{call SP_THEMPHONG(?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setString(1, ph.getLoaiPhong());
            call_proc.setLong(2, ph.getGia());
            call_proc.setInt(3, ph.getSoLuong());
            
            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_phong(int maphong)
    {
        String sql = "{call SP_XOAPHONG(?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, maphong);

            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_phong(PhongDTO ph)
    {
        String sql = "{call SP_UPDATEPHONG(?,   ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, ph.getMaPhong());
            call_proc.setString(2, ph.getLoaiPhong());
            call_proc.setLong(3, ph.getGia());
            call_proc.setInt(4, ph.getSoLuong());
            
            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<PhongDTO> search_room(String text)
    {
        ArrayList<PhongDTO> list_room = new ArrayList();
        String sql = "SELECT *\n" +
                     "FROM PHONG\n" +
                     "WHERE MAPHONG = ? OR LOAIPHONG LIKE '%' + ? + '%' OR GIA = ?  OR SLKHACH = ? OR TINHTRANG LIKE '%' + ? + '%'";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            if (check_number(text))
            {
                ps.setInt(1, Integer.parseInt(text));
                ps.setString(2, text);
                ps.setLong(3, Long.parseLong(text));
                ps.setInt(4, Integer.parseInt(text));
                ps.setString(5, text);
            }
            else
            {
                ps.setInt(1, -1);
                ps.setString(2, text);
                ps.setLong(3, -1);
                ps.setInt(4, -1);
                ps.setString(5, text);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int maPhong = rs.getInt("MAPHONG");
                String loaiPhong = rs.getString("LOAIPHONG");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SLKHACH");
                String tinhTrang = rs.getString("TINHTRANG");
                
                PhongDTO phong = new PhongDTO(maPhong, loaiPhong, gia, soLuong, tinhTrang);
                
                list_room.add(phong);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(PhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_room;
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
