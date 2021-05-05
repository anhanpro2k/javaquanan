/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhanVienBus;
import BUS.TaiKhoanBUS;
import DTO.NhanVienDTO;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhanpro2k
 */
public class NhanVienPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppPanel
     */
    public NhanVienPanel() {
        initComponents();
        hienThiDanhSachNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbXoa = new javax.swing.JLabel();
        jlbSua = new javax.swing.JLabel();
        jbtThem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/xoa.png"))); // NOI18N
        jlbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbXoaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbXoaMouseExited(evt);
            }
        });

        jlbSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/sua.png"))); // NOI18N
        jlbSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbSuaMouseExited(evt);
            }
        });

        jbtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/them.png"))); // NOI18N
        jbtThem.setPreferredSize(new java.awt.Dimension(148, 49));
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtThemMouseExited(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên", "Mã Nhân Viên" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Làm mới");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbSua)
                                .addGap(28, 28, 28)
                                .addComponent(jlbXoa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2)))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jlbXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseEntered
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa-hover.png")));
    }//GEN-LAST:event_jlbXoaMouseEntered

    private void jlbXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseExited
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa.png")));
    }//GEN-LAST:event_jlbXoaMouseExited

    private void jlbSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseEntered
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua-hover.png")));
    }//GEN-LAST:event_jlbSuaMouseEntered

    private void jlbSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseExited
        jlbSua.setIcon(new ImageIcon(getClass().getResource("../img/icon/sua.png")));
    }//GEN-LAST:event_jlbSuaMouseExited

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        AddNhanVien addNV = new AddNhanVien();
        addNV.setLocationRelativeTo(null);
        addNV.setVisible(true);
        AddNhanVien.hienthidanhsachchucvu();
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            getRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
            getRow();
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jlbXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseClicked
        NhanVienBus nvbus = new NhanVienBus();
        TaiKhoanBUS tkbus = new TaiKhoanBUS();
        if(jTable1.getSelectedRow() != -1){
            int input = JOptionPane.showConfirmDialog(this,"Bạn có chắc chắc xoá nhân viên này?");
            if(input == 0){
                NhanVienDTO nv = getRow();
                nvbus.delNV(nv.getMaNV());
                tkbus.delTaiKhoan(nv.getMaTK());
                hienThiDanhSachNhanVien();
                JOptionPane.showMessageDialog(this,"Đã xoá thành công!");
            }
        }
        else{
           JOptionPane.showMessageDialog(this,"Vui lòng chọn nhân viên để xoá!");
           return;
        }
    }//GEN-LAST:event_jlbXoaMouseClicked

    private void jlbSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaMouseClicked
        if(jTable1.getSelectedRow() != -1){
          EditNhanVien edit = new EditNhanVien();
        }
        else{
            JOptionPane.showMessageDialog(this,"Vui lòng chọn nhân viên để thực hiện chức năng!");
        }
        
    }//GEN-LAST:event_jlbSuaMouseClicked

    public static void hienThiDanhSachNhanVien(){
        NhanVienBus nhanVienBus = new NhanVienBus();
        if(NhanVienBus.dsnv==null){
            nhanVienBus.getList();
        }
        String colTieuDe[]=new String[]{"Mã Nhân Viên","Mã Chức Vụ","Tên Nhân Viên","Điện Thoại","Mã Tài Khoản"};
        DefaultTableModel model=new DefaultTableModel(colTieuDe,0);
        Object[]row;
        for(NhanVienDTO nv:NhanVienBus.dsnv){
            row=new Object[5];
            row[0]=nv.getMaNV();
            row[1]=nv.getMaCV();
            row[2]=nv.getTenNV();
            row[3]=nv.getDienThoai();
            row[4]=nv.getMaTK();
            model.addRow(row);
        }
        jTable1.setModel(model);
    }
    
    public static NhanVienDTO getRow(){
        int selectedRow = jTable1.getSelectedRow();
        NhanVienDTO row = NhanVienBus.dsnv.get(selectedRow);
        return row;
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JLabel jlbSua;
    private javax.swing.JLabel jlbXoa;
    // End of variables declaration//GEN-END:variables
}
