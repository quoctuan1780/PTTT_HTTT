package BLL;
import DAL.DangNhapDAL;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DangNhapBLL 
{
    public int get_maquyen(JTextField tendn)
    {
        DangNhapDAL dn_dal = new DangNhapDAL();
        return dn_dal.get_maquyen(tendn.getText());
    }
    public boolean check_dn(JTextField tendn, JPasswordField matkhau)
    {
        DangNhapDAL dn_dal = new DangNhapDAL();
        if(tendn.getText().equals("") || matkhau.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Tên tài khoản hoặc mật khẩu chưa nhập");
        else return dn_dal.check_dn(tendn.getText(), matkhau.getText());
        return false;
    }
    
}
