package DAL;
import DTO.HoaDonDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
public class HoaDonDAL  extends ConnectionDB
{
    public static ArrayList<HoaDonDTO> get_all()
    {
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM HOADON ORDER BY NGAYLAP DESC";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int mahs = rs.getInt("MAHD");
                int mapt = rs.getInt("MAPT");
                int manv = rs.getInt("MANV");
                Date nglap = rs.getDate("NGAYLAP");
                long thanhtien = rs.getLong("THANHTIEN");
                String ghichu = rs.getString("GHICHU");
                
                HoaDonDTO hd_dto = new HoaDonDTO(mahs, mapt, manv, nglap, thanhtien, ghichu);
                list.add(hd_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(HoaDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public boolean insert_hd(HoaDonDTO hd)
    {
        String sql = "{call SP_THEMHOADON(?, ?, ?, ?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, hd.getMapt());
            call_proc.setInt(2, hd.getManv());
            call_proc.setDate(3, hd.getNgaylap());
            call_proc.setString(4, hd.getGhichu());
            int rs = call_proc.executeUpdate();
            if (rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(HoaDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public boolean delete_hd(int mahd)
    {
        String sql = "{call SP_XOAHOADON(?)}";
        CallableStatement call_proc;
        getConnection();
        try
        {
            call_proc = con.prepareCall(sql);
            call_proc.setInt(1, mahd);
            int rs = call_proc.executeUpdate();
            if(rs > 0)
            {
                getClose();
                return true;
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(HoaDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return false;
    }
    public ArrayList<HoaDonDTO> search(String search_hd)
    {
        ArrayList<HoaDonDTO> list = new ArrayList();
        String sql = "SELECT *\n" +
                     "FROM HOADON\n" +
                     "WHERE MAHD = ? OR MANV = ? OR MAPT = ? OR YEAR(NGAYLAP) = ? OR MONTH(NGAYLAP) = ? OR DAY(NGAYLAP) = ? OR THANHTIEN = ? OR GHICHU LIKE '%' + ? + '%'";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            if(check_number(search_hd))
            {
                int search = Integer.parseInt(search_hd);
                ps.setInt(1, search);
                ps.setInt(2, search);
                ps.setInt(3, search);
                ps.setInt(4, search);
                ps.setInt(5, search);
                ps.setInt(6, search);
                ps.setInt(7, search);
                ps.setString(8, null);
                
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
                ps.setString(8, search_hd);
            }
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int mahs = rs.getInt("MAHD");
                int mapt = rs.getInt("MAPT");
                int manv = rs.getInt("MANV");
                Date nglap = rs.getDate("NGAYLAP");
                long thanhtien = rs.getLong("THANHTIEN");
                String ghichu = rs.getString("GHICHU");
                
                HoaDonDTO hd_dto = new HoaDonDTO(mahs, mapt, manv, nglap, thanhtien, ghichu);
                list.add(hd_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(HoaDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void Report(int mahd)
    {
        String link = "F:\\PTTK_HTTT\\Report\\HoaDon.jrxml";
        getConnection();
        try
        {
            JasperReport jr = JasperCompileManager.compileReport(link);  
            
            Map<String, Object> params = new HashMap<String, Object>(); 
            params.put("MAHD", mahd);
            JasperPrint print = JasperFillManager.fillReport(jr, params, getConnection());
            
            JasperViewer.viewReport(print);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        getClose();
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
