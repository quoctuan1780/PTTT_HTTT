package DAL;
import static DAL.ConnectionDB.getClose;
import static DAL.ConnectionDB.getConnection;
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

public class ThongKeDoanhThuDAL extends ConnectionDB
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
                java.sql.Date nglap = rs.getDate("NGAYLAP");
                long thanhtien = rs.getLong("THANHTIEN");
                String ghichu = rs.getString("GHICHU");
                
                HoaDonDTO hd_dto = new HoaDonDTO(mahs, mapt, manv, nglap, thanhtien, ghichu);
                list.add(hd_dto);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongKeDoanhThuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public static ArrayList<String> get_nam()
    {
        ArrayList<String> list = new ArrayList();
        String sql = "SELECT DISTINCT YEAR(NGAYLAP) FROM HOADON ORDER BY YEAR(NGAYLAP) ASC";
        PreparedStatement ps;
        getConnection();
        try
        {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int nam = rs.getInt(1);
                list.add(Integer.toString(nam));
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ThongKeDoanhThuDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        getClose();
        return list;
    }
    public void Report_Thang(java.util.Date ngaybd, java.util.Date ngaykt, String nguoilap)
    {
        java.util.Date ngaylap = new java.util.Date();
        String link = "F:\\PTTK_HTTT\\Report\\DanhThuTheoThang.jrxml";
        getConnection();
        try
        {
            JasperReport jr = JasperCompileManager.compileReport(link);  
            
            Map<String, Object> params = new HashMap<String, Object>(); 
            params.put("BDDT", ngaybd);
            params.put("KTDT", ngaykt);
            params.put("NGUOILAP", nguoilap);
            params.put("NGAYLAP", ngaylap);
            JasperPrint print = JasperFillManager.fillReport(jr, params, getConnection());
            
            JasperViewer.viewReport(print);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        getClose();
    }
    public void Report_Nam(int ngaybd, int ngaykt, String nguoilap)
    {
        java.util.Date ngaylap = new java.util.Date();
        String link = "F:\\PTTK_HTTT\\Report\\DoanhThuTheoNam.jrxml";
        getConnection();
        try
        {
            JasperReport jr = JasperCompileManager.compileReport(link);  
            
            Map<String, Object> params = new HashMap<String, Object>(); 
            params.put("BDDT", ngaybd);
            params.put("KTDT", ngaykt);
            params.put("NGUOILAP", nguoilap);
            params.put("NGAYLAP", ngaylap);
            JasperPrint print = JasperFillManager.fillReport(jr, params, getConnection());
            
            JasperViewer.viewReport(print);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        getClose();
    }
    public void Report_LoaiPhong(int ngayhd, String nguoilap)
    {
        java.util.Date ngaylap = new java.util.Date();
        String link = "F:\\PTTK_HTTT\\Report\\DoanhThuTheoLoaiPhong.jrxml";
        getConnection();
        try
        {
            JasperReport jr = JasperCompileManager.compileReport(link);  
            
            Map<String, Object> params = new HashMap<String, Object>(); 
            params.put("NGUOILAP", nguoilap);
            params.put("NGAYLAP", ngaylap);
            params.put("NGHD", ngayhd);
            JasperPrint print = JasperFillManager.fillReport(jr, params, getConnection());
            
            JasperViewer.viewReport(print);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        getClose();
    }
}
