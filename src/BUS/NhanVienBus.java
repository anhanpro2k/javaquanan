package BUS;

import java.util.List;
import DTO.NhanVienDTO;
import DAO.NhanVienDAO;
import java.util.ArrayList;

public class NhanVienBus{
    public static List<NhanVienDTO> dsnv;
    public void getList(){
        NhanVienDAO data=new NhanVienDAO();
        if(dsnv==null){
            dsnv=new ArrayList();
            dsnv=data.getList();
        }
        
    }
}