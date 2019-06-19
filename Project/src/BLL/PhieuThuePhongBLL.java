package BLL;
import DAL.PhieuThuePhongDAL;
import DTO.PhieuThuePhongDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
public class PhieuThuePhongBLL 
{
    public static ArrayList<PhieuThuePhongDTO> get_all()
    {
        return PhieuThuePhongDAL.get_all();
    }
    public static ArrayList<PhieuThuePhongDTO> get_all_ptqh()
    {
        return PhieuThuePhongDAL.get_all_ptqh();
    }
    public String get_trangthai(JTextField mapt, JTextField maphong, JTextField makh)
    {
        String trangthai = "NO";
        if(mapt.getText().equals("") || maphong.getText().equals("") || makh.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin mã nhập chưa đầy đủ");
        else
        {
            PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
            trangthai =  pt_dal.get_trangthai_pt(Integer.parseInt(mapt.getText()), Integer.parseInt(maphong.getText()), Integer.parseInt(makh.getText()));
        }
        return trangthai;
    }
    public boolean insert_pt_hsdt(JTextField maphong, JTextField makh, JDateChooser ngaythue, JDateChooser ngaytra, JTextField slkhach)
    {
        if(maphong.getText().equals("") || makh.getText().equals("") || ngaythue.getDate() == null || ngaytra.getDate() == null || slkhach.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(slkhach.getText()))
            {
                PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
                PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO();
                java.sql.Date nt = new java.sql.Date(ngaythue.getDate().getTime()); 
                java.sql.Date ntt = new java.sql.Date(ngaytra.getDate().getTime()); 
                pt_dto.setMaPhong(Integer.parseInt(maphong.getText()));
                pt_dto.setMaKH(Integer.parseInt(makh.getText()));
                pt_dto.setNgayThue(nt);
                pt_dto.setNgayTra(ntt);
                pt_dto.setSlKhach(Integer.parseInt(slkhach.getText()));
                if (nt.compareTo(ntt) <= 0)
                {
                    return pt_dal.insert_pt_hsdt(pt_dto);
                }
                else JOptionPane.showMessageDialog(null, "Ngày thuê lớn hơn ngày trả");
            }
            else JOptionPane.showMessageDialog(null, "Số lượng khách nhập sai định dạng");
        }
        return false;
    }
    public boolean insert_pt(JTextField maphong, JTextField makh, JDateChooser ngaythue, JDateChooser ngaytra, JTextField slkhach)
    {
        if(maphong.getText().equals("") || makh.getText().equals("") || ngaythue.getDate() == null || ngaytra.getDate() == null || slkhach.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(slkhach.getText()))
            {
                PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
                PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO();
                java.sql.Date nt = new java.sql.Date(ngaythue.getDate().getTime()); 
                java.sql.Date ntt = new java.sql.Date(ngaytra.getDate().getTime()); 
                pt_dto.setMaPhong(Integer.parseInt(maphong.getText()));
                pt_dto.setMaKH(Integer.parseInt(makh.getText()));
                pt_dto.setNgayThue(nt);
                pt_dto.setNgayTra(ntt);
                pt_dto.setSlKhach(Integer.parseInt(slkhach.getText()));
                if (nt.compareTo(ntt) <= 0)
                {
                    return pt_dal.insert_pt(pt_dto);
                }
                else JOptionPane.showMessageDialog(null, "Ngày thuê lớn hơn ngày trả");
            }
            else JOptionPane.showMessageDialog(null, "Số lượng khách nhập sai định dạng");
        }
        return false;
    }
    public boolean delete_pt(JTextField mapt)
    {
        if (mapt.getText().equals("")) JOptionPane.showMessageDialog(null, "Mã phiếu thuê trống");
        else
        {
            PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
            return pt_dal.delete_pt(Integer.parseInt(mapt.getText()));
        }
        return false;
    }
    public boolean update_pt(JTextField mapt, JTextField maphong, JTextField makh, JDateChooser ngaythue, JDateChooser ngaytra, JTextField slkhach)
    {
        if(maphong.getText().equals("") || makh.getText().equals("") || ngaythue.getDate() == null || ngaytra.getDate() == null || slkhach.getText().equals("")
                || mapt.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
            if (check_number(slkhach.getText()))
            {
                if (pt_dal.get_trangthai_pt(Integer.parseInt(mapt.getText()), Integer.parseInt(maphong.getText()), Integer.parseInt(makh.getText())).equals("NO"))
                {
                    PhieuThuePhongDTO pt_dto = new PhieuThuePhongDTO();
                    pt_dto.setMaPT(Integer.parseInt(mapt.getText()));
                    pt_dto.setMaPhong(Integer.parseInt(maphong.getText()));
                    pt_dto.setMaKH(Integer.parseInt(makh.getText()));
                    java.sql.Date nt = new java.sql.Date(ngaythue.getDate().getTime()); 
                    java.sql.Date ntt = new java.sql.Date(ngaytra.getDate().getTime()); 
                    pt_dto.setNgayThue(nt);
                    pt_dto.setNgayTra(ntt);
                    pt_dto.setSlKhach(Integer.parseInt(slkhach.getText()));
                    if (nt.compareTo(ntt) <= 0)
                    {
                        return pt_dal.update_pt(pt_dto);
                    }
                    else JOptionPane.showMessageDialog(null, "Ngày thuê lớn hơn ngày trả");
                }
                else JOptionPane.showMessageDialog(null, "Phiếu thuê này đã thanh toán, không thể cập nhật");
            }
            else JOptionPane.showMessageDialog(null, "Số lượng khách nhập sai định dạng");
        }
        return false;
    }
    public ArrayList<PhieuThuePhongDTO> search(JTextField search)
    {
        PhieuThuePhongDAL pt_dal = new PhieuThuePhongDAL();
        ArrayList<PhieuThuePhongDTO> list = new ArrayList();
        if (search.getText().equals("")) return get_all();
        else list = pt_dal.search(search.getText());
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
