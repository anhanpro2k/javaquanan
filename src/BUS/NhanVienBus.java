package BUS;

import java.util.List;
import DTO.NhanVienDTO;
import DAO.NhanVienDAO;
import java.util.ArrayList;

public class NhanVienBus {

    public static ArrayList<NhanVienDTO> dsnv;
    public NhanVienDAO nhanvienDAO = new NhanVienDAO();
    public static NhanVienDTO nhanVienDangNhap;

    public void getList() {
        if (dsnv == null) {
            dsnv = new ArrayList();
            dsnv = nhanvienDAO.getList();
        }
    }

    public void addNV(NhanVienDTO nv) {
        nhanvienDAO.addnv(nv);
        dsnv=null;
    }

    public NhanVienDTO getNhanVienByMaTaiKhoan(int maTaiKhoan) {
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getMaTK() == maTaiKhoan) {
                return nhanVien;
            }
        }
        return null;
    }

    public String getTenNhanVienByMaNhanVien(int maNhanVien) {
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getMaNV() == maNhanVien) {
                return nhanVien.getTenNV();
            }
        }
        return null;
    }
    
    public ArrayList<NhanVienDTO> timNhanVienTheoMaNV(String maNhanVien) {
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (Integer.toString(nhanVien.getMaNV()).contains(maNhanVien)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }

    public ArrayList<NhanVienDTO> timNhanVienTheoTen(String tenNhanVien) {
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for (NhanVienDTO nhanVien : dsnv) {
            if (nhanVien.getTenNV().contains(tenNhanVien)) {
                danhSachNhanVienTimDuoc.add(nhanVien);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public ArrayList<NhanVienDTO>timNhanVienTheoSDT(String sdt){
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for(NhanVienDTO nv : dsnv){
            if(nv.getDienThoai().contains(sdt)){
                danhSachNhanVienTimDuoc.add(nv);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
   public ArrayList<NhanVienDTO>timNhanVienTheoChucVu(String chucvu){
        ChucVuBUS chucVuBUS = new ChucVuBUS();
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for(NhanVienDTO nv : dsnv){
            if(chucVuBUS.getNameByID(nv.getMaCV()).contains(chucvu)){
                danhSachNhanVienTimDuoc.add(nv);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
   
    public ArrayList<NhanVienDTO>timNhanVienTheoTaiKhoan(String taikhoan){
        TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
        ArrayList<NhanVienDTO> danhSachNhanVienTimDuoc = new ArrayList<>();
        for(NhanVienDTO nv : dsnv){
            if(taiKhoanBUS.getNameByID(nv.getMaCV()).contains(taikhoan)){
                danhSachNhanVienTimDuoc.add(nv);
            }
        }
        return danhSachNhanVienTimDuoc;
    }
    
    public void delNV(int MaNV){
        nhanvienDAO.delnv(MaNV);
        dsnv = null;
    }
    
    public void editNV(NhanVienDTO nv){
        nhanvienDAO.editnv(nv);
        dsnv = null;
    }

}
