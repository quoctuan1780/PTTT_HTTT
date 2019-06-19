package DAL;

import DTO.PhongDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatPhongDAL extends ConnectionDB
{
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
            Logger.getLogger(DatPhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
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
            Logger.getLogger(DatPhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_room;
    }
    public String get_tinhtrang(int maphong)
    {
        String tt = null;
        String sql = "SELECT TINHTRANG FROM PHONG WHERE MAPHONG = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, maphong);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tt = rs.getString(1);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DatPhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return tt;
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
