/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.AppBUS;
import BUS.ChiTietHoaDonBUS;
import BUS.HoaDonBUS;
import BUS.NhanVienBus;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AttributeSet;

/**
 *
 * @author anhanpro2k
 */
public class HoaDonPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppPanel
     */
    DefaultTableModel tableHoaDonModel;
    DefaultTableModel tableMonModel;
    Vector headerMon;
    Vector headerTableHoaDon;
    private HoaDonBUS hoaDonBUS;
    private AppBUS appBUS;

    private ChiTietHoaDonBUS chiTietBUS;
    private NhanVienBus nhanVienBUS;
    private ArrayList<ChiTietHoaDonDTO> danhSachChiTiet;

    public HoaDonPanel() {
        initComponents();
        hoaDonBUS = new HoaDonBUS();
        chiTietBUS = new ChiTietHoaDonBUS();
        nhanVienBUS = new NhanVienBus();
        appBUS = new AppBUS();
        loadData();
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
        jbtThem = new javax.swing.JLabel();
        jlbXoa = new javax.swing.JLabel();
        jlbIn = new javax.swing.JLabel();
        jtfTimHoaDon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDanhSachHoaDon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDanhSachMon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcbChonLoaiTimKiem = new javax.swing.JComboBox<>();
        jbtTim = new javax.swing.JButton();
        jbtLamMoi = new javax.swing.JButton();
        jlbIn1 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1067, 719));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qu???n L?? H??a ????n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtThemMousePressed(evt);
            }
        });

        jlbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/xoa.png"))); // NOI18N
        jlbXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbXoaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbXoaMousePressed(evt);
            }
        });

        jlbIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/in.png"))); // NOI18N
        jlbIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbInMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbInMousePressed(evt);
            }
        });

        jtfTimHoaDon.setToolTipText("");
        jtfTimHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimHoaDonActionPerformed(evt);
            }
        });
        jtfTimHoaDon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimHoaDonKeyPressed(evt);
            }
        });

        jtbDanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? ????n", "T??n nh??n vi??n", "Th???i Gian", "Ngu???n ????n", "M?? ????n App", "Chi???t Kh???u", "T???ng Ti???n", "Ph?? D???ch V???", "T???ng Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbDanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbDanhSachHoaDonMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDanhSachHoaDon);

        jtbDanhSachMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? m??n", "S??? L?????ng", "????n gi??", "Th??nh Ti???n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbDanhSachMon);

        jLabel2.setText("Danh S??ch M??n");

        jcbChonLoaiTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M?? ????n", "T??n nh??n vi??n", "T??n App" }));
        jcbChonLoaiTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbChonLoaiTimKiemActionPerformed(evt);
            }
        });

        jbtTim.setText("T??m");
        jbtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimActionPerformed(evt);
            }
        });

        jbtLamMoi.setText("L??m m???i");
        jbtLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLamMoiActionPerformed(evt);
            }
        });

        jlbIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-excel.png"))); // NOI18N
        jlbIn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbIn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbIn1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbIn1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jtfTimHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtTim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbChonLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jbtLamMoi))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jlbXoa)
                                .addGap(44, 44, 44)
                                .addComponent(jlbIn)
                                .addGap(40, 40, 40)
                                .addComponent(jlbIn1)
                                .addGap(18, 18, 18))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbIn)
                            .addComponent(jlbIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTimHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbChonLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtTim)
                            .addComponent(jbtLamMoi))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked

    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseEntered
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them-hover.png")));
    }//GEN-LAST:event_jbtThemMouseEntered

    private void jbtThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseExited
        jbtThem.setIcon(new ImageIcon(getClass().getResource("../img/icon/them.png")));
    }//GEN-LAST:event_jbtThemMouseExited

    private void jlbXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseEntered
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa-hover.png")));
    }//GEN-LAST:event_jlbXoaMouseEntered

    private void jlbXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMouseExited
        jlbXoa.setIcon(new ImageIcon(getClass().getResource("../img/icon/xoa.png")));
    }//GEN-LAST:event_jlbXoaMouseExited

    private void jlbInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInMouseEntered
        jlbIn.setIcon(new ImageIcon(getClass().getResource("../img/icon/in-hover.png")));
    }//GEN-LAST:event_jlbInMouseEntered

    private void jlbInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInMouseExited
        jlbIn.setIcon(new ImageIcon(getClass().getResource("../img/icon/in.png")));
    }//GEN-LAST:event_jlbInMouseExited

    private void jtfTimHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimHoaDonActionPerformed

    private void jcbChonLoaiTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbChonLoaiTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbChonLoaiTimKiemActionPerformed

    private void jbtThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMousePressed
        HoaDonThem themHoaDonGUI = new HoaDonThem(this);
        themHoaDonGUI.setVisible(true);
        themHoaDonGUI.setAlwaysOnTop(true);
    }//GEN-LAST:event_jbtThemMousePressed

    private void jlbXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbXoaMousePressed
        if (jtbDanhSachHoaDon.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n h??a ????n c???n x??a");
            return;
        }
        int input = JOptionPane.showConfirmDialog(this, "B???n ch???c ch???n mu???n x??a ????n h??ng n??y?");
        System.out.println(input);
        if (input == 0) {
            HoaDonDTO seletectedHoaDon = HoaDonBUS.danhSachHoaDon.get(jtbDanhSachHoaDon.getSelectedRow());
            hoaDonBUS.xoaHoaDon(seletectedHoaDon);
            JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
            loadData();
        }
    }//GEN-LAST:event_jlbXoaMousePressed

    private void jtbDanhSachHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDanhSachHoaDonMousePressed
        if (jtbDanhSachHoaDon.getSelectedRow() == -1) {
            return;
        }
        tableMonModel = new DefaultTableModel(headerMon, 0);

        int maDonDangChon = Integer.parseInt(jtbDanhSachHoaDon.getValueAt(jtbDanhSachHoaDon.getSelectedRow(), 0).toString());
        System.out.println(maDonDangChon);
        danhSachChiTiet = chiTietBUS.getDanhSachChiTietTuMaHoaDon(maDonDangChon);
        for (ChiTietHoaDonDTO chiTiet : danhSachChiTiet) {
            Vector row = new Vector();
            row.add(chiTiet.getMaMon());
            row.add(chiTiet.getSoLuong());
            row.add(chiTiet.getDonGia());
            row.add(chiTiet.getThanhTien());

            tableMonModel.addRow(row);
        }
        jtbDanhSachMon.setModel(tableMonModel);
    }//GEN-LAST:event_jtbDanhSachHoaDonMousePressed

    private void jtfTimHoaDonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimHoaDonKeyPressed

    }//GEN-LAST:event_jtfTimHoaDonKeyPressed

    private void jbtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimActionPerformed
        if (jtfTimHoaDon.getText().isEmpty()) {
            return;
        }
        switch (jcbChonLoaiTimKiem.getSelectedIndex()) {
            case 0:
                HoaDonDTO hoaDon = hoaDonBUS.timHoaDonTheoMaApp(jtfTimHoaDon.getText());
                ArrayList<HoaDonDTO> danhSachHoaDon = new ArrayList<>();
                danhSachHoaDon.add(hoaDon);
                truyenDuLieuTable(danhSachHoaDon);
                break;
            case 1:
                ArrayList<HoaDonDTO> danhsachHoaDon = hoaDonBUS.timHoaDonTheoDanhSachNhanVien(nhanVienBUS.timNhanVienTheoTen(jtfTimHoaDon.getText()));
                truyenDuLieuTable(danhsachHoaDon);
                break;
            case 2:
                ArrayList<HoaDonDTO> danhsachHoaDon1 = hoaDonBUS.timHoaDonTheoDanhSachApp(appBUS.getDanhSachAppTheoTenApp(jtfTimHoaDon.getText()));
                truyenDuLieuTable(danhsachHoaDon1);
                break;
        }
    }//GEN-LAST:event_jbtTimActionPerformed

    private void jbtLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLamMoiActionPerformed
        loadData();
    }//GEN-LAST:event_jbtLamMoiActionPerformed

    private void jlbInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInMousePressed

    }//GEN-LAST:event_jlbInMousePressed

    private void jlbIn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbIn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbIn1MouseEntered

    private void jlbIn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbIn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbIn1MouseExited

    private void jlbIn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbIn1MousePressed
        exportExcel(jtbDanhSachHoaDon);
    }//GEN-LAST:event_jlbIn1MousePressed

    private void jlbInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbInMouseClicked
        if(jtbDanhSachHoaDon.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Vui l??ng ch???n ho?? ????n c???n in!");
            return;
        }
        else{
            HoaDonDTO row = getRow();
            ChiTietHoaDonBUS chiTietHoaDonBUS  = new ChiTietHoaDonBUS();
            ArrayList<ChiTietHoaDonDTO> dshoadon = chiTietHoaDonBUS.getDanhSachChiTietTuMaHoaDon(row.getMaHD());
            Document document= new Document(PageSize.A4,50,50,50,50);
            try {
                //Tao doi tuong PdfWrite
                PdfWriter.getInstance(document, new FileOutputStream("./service/print.pdf"));
                //Mo file de thuc thi
                document.open();

                //Add title
                Font font1 = new Font(BaseFont.createFont("./service/alegreya-sans/AlegreyaSans-Medium.otf",BaseFont.IDENTITY_H,BaseFont.EMBEDDED));
                font1.setSize(20);
                font1.setStyle(Font.BOLD);
                font1.setColor(BaseColor.RED);
                Paragraph title = new Paragraph("Ho?? ????n",font1);
                title.setSpacingAfter(25);
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);

                //N???i dung
                Font font2 = new Font(BaseFont.createFont("./service/alegreya-sans/AlegreyaSans-Medium.otf",BaseFont.IDENTITY_H,BaseFont.EMBEDDED));
                String detailsString = "M?? ????n:   "+row.getMaHD()
                        + "\nT??n kh??ch h??ng:   "+row.getMaNV()
                        + "\nTh???i gian:    "+row.getNgay()
                        + "\nNgu???n ????n:  "+row.getMaApp()
                        + "\nChi ti???t:";
                Paragraph details = new Paragraph(detailsString,font2);
                document.add(details);

                PdfPTable t= new PdfPTable(4);
                t.setSpacingBefore(25);
                t.setSpacingAfter(25);
                PdfPCell c1= new PdfPCell(new Phrase("M?? m??n",font2));
                t.addCell(c1);
                PdfPCell c2 = new PdfPCell(new Phrase("S??? l?????ng",font2));
                t.addCell(c2);
                PdfPCell c3 = new PdfPCell(new Phrase("Gi??",font2));
                t.addCell(c3);
                PdfPCell c4 = new PdfPCell(new Phrase("Th??nh ti???n",font2));
                t.addCell(c4);
                
                int tongtien = 0;
                for(ChiTietHoaDonDTO hoadon : dshoadon){
                    tongtien+=hoadon.getThanhTien();
                    t.addCell(new Phrase(Integer.toString(hoadon.getMaMon()),font2));
                    t.addCell(new Phrase(Integer.toString(hoadon.getSoLuong()),font2));
                    t.addCell(new Phrase(Integer.toString(hoadon.getDonGia()),font2));
                    t.addCell(new Phrase(Integer.toString(hoadon.getThanhTien()),font2));
                }
                
                document.add(t);

                String footerString = "T???ng ti???n: "+tongtien+"??"
                        + "\n Chi???t xu???t(khuy???n m??i):  "+ row.getChietKhau()+"??"
                        + "\nPh?? d???ch v???: "+row.getPhiDichVu()+"??"
                        + "\nT???ng thu: "+(tongtien+row.getChietKhau()+row.getPhiDichVu())+"??";
                Paragraph footer = new Paragraph(footerString,font2);
                document.add(footer);
                //????ng file
                document.close();
                
                //M??? file pdf
                if(Desktop.isDesktopSupported()){
                    try{
                       File myfile = new File("./service/print.pdf");
                       Desktop.getDesktop().open(myfile);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jlbInMouseClicked

    public HoaDonDTO getRow(){
        HoaDonDTO hoadon = new HoaDonDTO();
        int index = jtbDanhSachHoaDon.getSelectedRow();
        hoadon = HoaDonBUS.danhSachHoaDon.get(index);
        return hoadon;
    }
    
    public void setEvent() {

    }

    public void loadData() {
        headerTableHoaDon = new Vector();
        headerTableHoaDon.add("M?? ????n");
        headerTableHoaDon.add("T??n nh??n vi??n");
        headerTableHoaDon.add("Th???i gian");
        headerTableHoaDon.add("Ngu???n ????n");
        headerTableHoaDon.add("M?? ????n app");
        headerTableHoaDon.add("Chi???t kh???u");
        headerTableHoaDon.add("T???ng ti???n");
        headerTableHoaDon.add("Ph?? d???ch v???");
        headerTableHoaDon.add("T???ng thu");
        tableHoaDonModel = new DefaultTableModel(headerTableHoaDon, 0);
        for (HoaDonDTO hoaDon : HoaDonBUS.danhSachHoaDon) {
            Vector row = new Vector();
            row.add(hoaDon.getMaHD());
            row.add(nhanVienBUS.getTenNhanVienByMaNhanVien(hoaDon.getMaNV()));
            row.add(hoaDon.getNgay());
            row.add(appBUS.getTenAppByMaApp(hoaDon.getMaApp()));
            row.add(hoaDon.getMaDonTrenApp());
            row.add(hoaDon.getChietKhau());
            row.add(hoaDon.getTongTien());
            row.add(hoaDon.getPhiDichVu());
            row.add(hoaDon.getTongThu());

            tableHoaDonModel.addRow(row);
        }
        jtbDanhSachHoaDon.setModel(tableHoaDonModel);

        headerMon = new Vector();
        headerMon.add("M?? m??n");
        headerMon.add("S??? l?????ng");
        headerMon.add("????n gi??");
        headerMon.add("Th??nh ti???n");
        tableMonModel = new DefaultTableModel(headerMon, 0);
    }

    private void truyenDuLieuTable(ArrayList<HoaDonDTO> danhSachHoaDon) {
        tableHoaDonModel = new DefaultTableModel(headerTableHoaDon, 0);
        for (HoaDonDTO hoaDon : danhSachHoaDon) {
            Vector row = new Vector();
            row.add(hoaDon.getMaHD());
            row.add(nhanVienBUS.getTenNhanVienByMaNhanVien(hoaDon.getMaNV()));
            row.add(hoaDon.getNgay());
            row.add(appBUS.getTenAppByMaApp(hoaDon.getMaApp()));
            row.add(hoaDon.getMaDonTrenApp());
            row.add(hoaDon.getChietKhau());
            row.add(hoaDon.getTongTien());
            row.add(hoaDon.getPhiDichVu());
            row.add(hoaDon.getTongThu());

            tableHoaDonModel.addRow(row);
        }
        jtbDanhSachHoaDon.setModel(tableHoaDonModel);

    }

    public void exportExcel(JTable table) {
        JFileChooser chooser = new JFileChooser();
        int i = chooser.showSaveDialog(chooser);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                FileWriter out = new FileWriter(file + ".xls");
                BufferedWriter bwrite = new BufferedWriter(out);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                // ten Cot
                for (int j = 0; j < table.getColumnCount(); j++) {
                    bwrite.write(model.getColumnName(j) + "\t");
                }
                bwrite.write("\n");
                // Lay du lieu dong
                for (int j = 0; j < table.getRowCount(); j++) {
                    for (int k = 0; k < table.getColumnCount(); k++) {
                        bwrite.write(model.getValueAt(j, k) + "\t");
                    }
                    bwrite.write("\n");
                }
                bwrite.close();
                JOptionPane.showMessageDialog(null, "L??u file th??nh c??ng!");
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "L???i khi l??u file!");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtLamMoi;
    private javax.swing.JLabel jbtThem;
    private javax.swing.JButton jbtTim;
    private javax.swing.JComboBox<String> jcbChonLoaiTimKiem;
    private javax.swing.JLabel jlbIn;
    private javax.swing.JLabel jlbIn1;
    private javax.swing.JLabel jlbXoa;
    private javax.swing.JTable jtbDanhSachHoaDon;
    private javax.swing.JTable jtbDanhSachMon;
    private javax.swing.JTextField jtfTimHoaDon;
    // End of variables declaration//GEN-END:variables
}
