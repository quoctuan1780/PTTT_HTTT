package BLL;
import DAL.DichVuDAL;
import DTO.DichVuDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class DichVuBLL 
{
    public static ArrayList<DichVuDTO> get_all()
    {
        return DichVuDAL.get_all();
    }
    
    public boolean insert_dv(JTextField tendv, JTextField gia)
    {
        if (tendv.getText().equals("") || gia.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin bạn nhập chưa đầy đủ");
        else
        {
            DichVuDAL dv_dal = new DichVuDAL();
            DichVuDTO dv_dto = new DichVuDTO();
            if (check_number(gia.getText()))
            {
                dv_dto.setTenDV(tendv.getText());
                dv_dto.setGiaDv(Integer.parseInt(gia.getText()));
                return dv_dal.insert_dv(dv_dto);
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng giá");
        }
        return false;
    }
    public boolean delete_dv(JTextField madv)
    {
        if (madv.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin bạn nhập chưa đầy đủ");
        else
        {
            DichVuDAL dv_dal = new DichVuDAL();
            return dv_dal.delete_dv(Integer.parseInt(madv.getText()));
        }
        return false;
    }
    public boolean update_dv(JTextField madv, JTextField tendv, JTextField gia)
    {
        if (tendv.getText().equals("") || gia.getText().equals("") || madv.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin bạn nhập chưa đầy đủ");
        else
        {
            if(check_number(gia.getText()))
            {
                DichVuDTO dv_dto = new DichVuDTO();
                DichVuDAL dv_dal = new DichVuDAL();
                dv_dto.setMaDV(Integer.parseInt(madv.getText()));
                dv_dto.setTenDV(tendv.getText());
                dv_dto.setGiaDv(Long.parseLong(gia.getText()));
                return dv_dal.update_dv(dv_dto);
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng giá");
        }
        return false;
    }
    public ArrayList<DichVuDTO> search_dv(JTextField text)
    {
        ArrayList<DichVuDTO> list_server = new ArrayList();
        if (text.getText().equals("")) list_server = get_all();
        else
        {
            DichVuDAL dv_dal = new DichVuDAL();
            list_server = dv_dal.searchDichVu(text.getText());
        }
        return list_server;
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
