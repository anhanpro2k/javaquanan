package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DTO.NhanVien;

public class NhanVienDAO {
    
    public static List<NhanVien> getList(){
        List<NhanVien> lstNhanVien= new ArrayList();
        Connection conn=null;
        try {
            conn=MyJDBCConnection.getConnection();
            String strSQL="Select * from nhanvien";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(strSQL);
            NhanVien objNV=null;
            while(rs.next()){
                objNV=new NhanVien();
                objNV.setMaNV(rs.getInt("MaNV"));
                objNV.setMaCV(rs.getInt("MaCV"));
                objNV.setTenNV(rs.getString("TenNV"));
                objNV.setDienThoai(rs.getString("DienThoai"));
                objNV.setMaTK(rs.getInt("MaTK"));
                lstNhanVien.add(objNV);
            }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        finally{
            try{
                if(conn!=null){
                    conn.close();
                }

            }catch(SQLException ex){
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lstNhanVien;
    }
}
