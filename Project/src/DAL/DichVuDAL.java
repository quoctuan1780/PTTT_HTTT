package DAL;

import DTO.DichVuDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DichVuDAL  extends ConnectionDB
{
    
    public static ArrayList<DichVuDTO> get_all()
    {
        ArrayList<DichVuDTO> list_server = new ArrayList();
        String sql = "SELECT * FROM DICHVU";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int madv = rs.getInt("MADV");
                String tendv =rs.getString("TENDV");
                long gia = rs.getLong("GIA");
                DichVuDTO dv_dto = new DichVuDTO(madv, tendv, gia);
                list_server.add(dv_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DichVuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list_server;
    }
    public boolean insert_dv(DichVuDTO dv)
    {
        String sql = "{call SP_THEMDV(?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {   
            call_proc = con.prepareCall(sql);
            call_proc.setString(1, dv.getTenDV());
            call_proc.setLong(2, dv.getGiaDv());
            
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DichVuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_dv(int madv)
    {
        String sql = "{call SP_XOADICHVU(?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {   
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, madv);
            
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DichVuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean update_dv(DichVuDTO dv)
    {
        String sql = "UPDATE DICHVU SET TENDV = ?, GIA = ? WHERE MADV = ?";
        PreparedStatement ps;
        getConnection();
        try
        {   
            ps = con.prepareCall(sql);
            ps.setString(1, dv.getTenDV());
            ps.setLong(2, dv.getGiaDv());
            ps.setInt(3, dv.getMaDV());
            
            int rs = ps.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DichVuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<DichVuDTO> searchDichVu(String stringSearch){
        ArrayList<DichVuDTO> list = new ArrayList();
        String sql = "SELECT * FROM DICHVU WHERE MADV = ? OR TENDV LIKE '%' + ? + '%' OR GIA = ?";
        getConnection();
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            if (check_number(stringSearch))
            {
                ps.setInt(1, Integer.parseInt(stringSearch));   
                ps.setString(2, null);
                ps.setLong(3, Long.parseLong(stringSearch));
            }
            else
            {
                ps.setInt(1, -1);
                ps.setString(2, stringSearch);
                ps.setLong(3, -1);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                DichVuDTO dv_dto = new DichVuDTO();
                dv_dto.setMaDV(rs.getInt("MADV"));
                dv_dto.setTenDV(rs.getString("TENDV"));
                dv_dto.setGiaDv(rs.getInt("GIA"));                
                list.add(dv_dto);
            }

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DichVuDAL.class.getName()).log(Level.SEVERE, null, ex);
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
