package DAL;
import DTO.ChiTietSuDungDVDTO;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChiTietSuDungDVDAL extends ConnectionDB
{
    public ArrayList<ChiTietSuDungDVDTO> get_mapt(int mapt)
    {
        ArrayList<ChiTietSuDungDVDTO> list = new ArrayList();
        String sql = "SELECT * FROM SDDV WHERE MAPT = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mapt);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int ma_pt = rs.getInt("MAPT");
                int madv = rs.getInt("MADV");
                Date ngaysd = rs.getDate("NGAYSD");
                int sl = rs.getInt("SOLUONG");
                ChiTietSuDungDVDTO ctdv_dto = new ChiTietSuDungDVDTO(ma_pt, madv, ngaysd, sl);
                
                list.add(ctdv_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void get_dv(ArrayList<String> list_index, ArrayList<String> list_name)
    {
        String sql = "SELECT * FROM DICHVU";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int madv = rs.getInt("MADV");
                String tendv = rs.getString("TENDV");
                
                list_index.add(Integer.toString(madv));
                list_name.add(tendv);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean insert_sddv(ChiTietSuDungDVDTO ct)
    {
        String sql = "INSERT INTO SDDV VALUES (?, ?, ?, ?)";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ct.getMapt());
            ps.setInt(2, ct.getMadv());
            ps.setDate(3, ct.getNgaysd());
            ps.setInt(4, ct.getSoluong());
            
            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_sddv(int mapt, int madv)
    {
        String sql = "DELETE FROM SDDV WHERE MAPT = ? AND MADV = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mapt);
            ps.setInt(2, madv);
            
            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_sddv(ChiTietSuDungDVDTO ct)
    {
        String sql = "UPDATE SDDV SET NGAYSD = ?, SOLUONG = ? WHERE MAPT = ? AND MADV = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setDate(1, ct.getNgaysd());
            ps.setInt(2, ct.getSoluong());
            ps.setInt(3, ct.getMapt());
            ps.setInt(4, ct.getMadv());

            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<ChiTietSuDungDVDTO> search_sddv(int mapt, int madv)
    {
        ArrayList<ChiTietSuDungDVDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM SDDV WHERE MAPT = ? AND MADV = ?";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mapt);
            ps.setInt(2, madv);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int ma_pt = rs.getInt("MAPT");
                int ma_dv = rs.getInt("MADV");
                Date ngaysd = rs.getDate("NGAYSD");
                int sl = rs.getInt("SOLUONG");
                ChiTietSuDungDVDTO ctdv_dto = new ChiTietSuDungDVDTO(ma_pt, ma_dv, ngaysd, sl);
                
                list.add(ctdv_dto);
            } 
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ChiTietSuDungDVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
}
