package BLL;
import DAL.DatPhongDAL;
import DTO.PhongDTO;
import java.util.ArrayList;
public class DatPhongBLL 
{
    public static ArrayList<PhongDTO>getAllPhong()
    {
        return DatPhongDAL.getAllPhong();
    }
    public ArrayList<PhongDTO> search_room(String text)
    {
        DatPhongDAL dp = new DatPhongDAL();
        return dp.search_room(text);
    }
    public boolean check_tinhtrang(int maphong)
    {
        DatPhongDAL dp_dal = new DatPhongDAL();
        if(dp_dal.get_tinhtrang(maphong).equals("YES")) return false;
        return true;
    }
}
