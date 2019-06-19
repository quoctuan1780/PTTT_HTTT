package DAL;
import DTO.DangNhapDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DangNhapDAL extends ConnectionDB
{
    public int get_maquyen(String tendn)
    {
        int ma = 0;
        String sql = "SELECT MAQUYEN FROM NHANVIEN WHERE TENDN = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, tendn);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ma = rs.getInt("MAQUYEN");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DangNhapDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ma;
    }
    public boolean check_dn(String tendn, String matkhau)
    {
        ArrayList<DangNhapDTO> list = new ArrayList();
        String sql = "SELECT * FROM DANGNHAP WHERE TENDN = ? AND MATKHAU = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, tendn);
            ps.setString(2, matkhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String username = rs.getString("TENDN");
                String pass = rs.getString("MATKHAU");
                DangNhapDTO dn_dto = new DangNhapDTO(username, pass);
                list.add(dn_dto);
            }
            if(!list.isEmpty()) return true;
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DangNhapDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
