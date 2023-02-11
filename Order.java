
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import net.proteanit.sql.DbUtils;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        SelectSP();
        SelectKH();
        getToday();
    }

     Connection con = MyConnection.getConnection();
     Statement St = null;
     ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Madh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachSP = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Datebl = new javax.swing.JTextField();
        Sua = new javax.swing.JButton();
        DatHangbn = new javax.swing.JButton();
        TaoBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DanhsachKH = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        TenKHbl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Soluongbl = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Hoadon = new javax.swing.JTable();
        Giabl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Thanhtienbl = new javax.swing.JTextField();
        ThemSLbl1 = new javax.swing.JButton();
        Thanhtienbl1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Madh.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Madh.setForeground(new java.awt.Color(255, 0, 102));

        DanhSachSP.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DanhSachSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "TenSP", "Soluong", "Ghichu", "Loai"
            }
        ));
        DanhSachSP.setRowHeight(25);
        DanhSachSP.setSelectionBackground(new java.awt.Color(255, 0, 51));
        DanhSachSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhSachSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanhSachSP);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Số lượng:");

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Danh sách sản phẩm");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Tên khách hàng");

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hệ thống quản lý kho");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quản lý đơn hàng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Datebl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Datebl.setForeground(new java.awt.Color(255, 0, 102));
        Datebl.setText("Date");

        Sua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sua.setText("Xem đơn hàng");
        Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuaMouseClicked(evt);
            }
        });

        DatHangbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DatHangbn.setText("Đặt hàng");
        DatHangbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatHangbnMouseClicked(evt);
            }
        });

        TaoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TaoBtn.setText("Tạo đơn hàng");
        TaoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaoBtnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Mã đặt hàng");

        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        DanhsachKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DanhsachKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaKH", "TenKH", "SDT"
            }
        ));
        DanhsachKH.setRowHeight(25);
        DanhsachKH.setSelectionBackground(new java.awt.Color(255, 0, 51));
        DanhsachKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhsachKHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DanhsachKH);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Danh sách khách hàng");

        TenKHbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TenKHbl.setForeground(new java.awt.Color(255, 0, 102));
        TenKHbl.setText("Tên khách hàng");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Date");

        Soluongbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Soluongbl.setForeground(new java.awt.Color(255, 0, 102));

        Hoadon.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TenSP", "Soluong", "Dongia", "Tong"
            }
        ));
        Hoadon.setRowHeight(25);
        Hoadon.setSelectionBackground(new java.awt.Color(255, 0, 51));
        Hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoadonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Hoadon);

        Giabl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Giabl.setForeground(new java.awt.Color(255, 0, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Giá:");

        Thanhtienbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Thanhtienbl.setForeground(new java.awt.Color(255, 0, 102));
        Thanhtienbl.setText("Thành tiền");

        ThemSLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ThemSLbl1.setText("In đơn hàng");
        ThemSLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThemSLbl1MouseClicked(evt);
            }
        });

        Thanhtienbl1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Thanhtienbl1.setForeground(new java.awt.Color(255, 0, 102));
        Thanhtienbl1.setText("VND");
        Thanhtienbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thanhtienbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(132, 132, 132)
                                .addComponent(Datebl, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TenKHbl, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Madh, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(TaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)))
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Giabl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Soluongbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(DatHangbn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(311, 311, 311))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Thanhtienbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Thanhtienbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ThemSLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Madh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DatHangbn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Giabl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(Soluongbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TenKHbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Datebl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Thanhtienbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thanhtienbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ThemSLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void SelectSP()
    {
       try{
            St = con.createStatement();
            Rs = St.executeQuery("select  * from product ");
            DanhSachSP.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
      public void SelectKH()
    {
        try{
            St = con.createStatement();
            Rs = St.executeQuery("select  * from custommer ");
            DanhsachKH.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
      private void getToday()
      {
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
          LocalDateTime now = LocalDateTime.now();
          Datebl.setText(dtf.format(now));
      }
      private void capnhat()
      {
        int SLmoi =SLcu -Integer.valueOf(Soluongbl.getText());
           try {
              
              String Updatequery ="UPDATE FROM quanlykho.product SET Soluong="+SLmoi+""+"WHERE MaSP ="+Masp;
              Statement Sua = con.createStatement();
              Sua.executeUpdate(Updatequery);
              JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
              SelectSP();
              
           }catch (Exception ex)
           {
               ex.printStackTrace();
           }
      }
    int flag = 0,Thanhtien,Masp,SLcu;
    private void DanhSachSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhSachSPMouseClicked
        DefaultTableModel model = (DefaultTableModel) DanhSachSP.getModel();
        int Myindex = DanhSachSP.getSelectedRow();
       Masp = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
       TenSp = model.getValueAt(Myindex, 1).toString();
       SLcu = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
       flag = 1;
    }//GEN-LAST:event_DanhSachSPMouseClicked
      
      
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void SuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuaMouseClicked
      /*  if (MaSP.getText().isEmpty()|| TenSP.getText().isEmpty()||Soluong.getText().isEmpty()||Datebl.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Thieu thong tin");
        }
        else
        {
            try {

                String Updatequery ="UPDATE FROM quanlykho.product SET TenSP="+TenSP.getText()+"'"+",Soluong="+Soluong.getText()+""+",Ghichu='"+Datebl.getText()+"'"+",Loai='"+Loaidb.getSelectedItem().toString()+"'"+"WHERE MaSP="+MaSP.getText();
                Statement Sua = con.createStatement();
                Sua.executeUpdate(Updatequery);
                JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
                SelectSP();

            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }*/
    }//GEN-LAST:event_SuaMouseClicked
    int i = 1,Dongia,Tong=0;
    String TenSp;
    private void DatHangbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatHangbnMouseClicked
     if (flag == 0|| Soluongbl.getText().isEmpty()||Giabl.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(this, "Chon san pham va nhap so luong");
     }
     else
     {
     Dongia = Integer.valueOf(Giabl.getText());
     Tong = Dongia *Integer.valueOf(Soluongbl.getText());
     Vector v = new Vector();
     v.add(i);
     v.add(TenSp);
     v.add(Soluongbl.getText());
     v.add(Dongia);
     v.add(Tong);
     DefaultTableModel dt = (DefaultTableModel)Hoadon.getModel();   
     dt.addRow(v);
     Thanhtien = Thanhtien + Tong;
     Thanhtienbl.setText(""+Thanhtien);
     i++;
     capnhat();
     }
    }//GEN-LAST:event_DatHangbnMouseClicked

    private void TaoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaoBtnMouseClicked
        if (TenKHbl.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Chon hoa don");
        }
        else
        {
        try {
            PreparedStatement add = con.prepareStatement("INSERT INTO orders VALUES(?, ?, ?, ?)");
            add.setInt(1, Integer.valueOf(Madh.getText()));
            add.setString(2,TenKHbl.getText());
            add.setString(3,Datebl.getText());
            add.setInt(4,Integer.valueOf(Thanhtienbl.getText()));
        
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Them thanh cong");
            con.close();

        } catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_TaoBtnMouseClicked
  
    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void DanhsachKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhsachKHMouseClicked
         DefaultTableModel model = (DefaultTableModel) DanhsachKH.getModel();
        int Myindex = DanhsachKH.getSelectedRow();
        //MaKH.setText(model.getValueAt(Myindex, 0).toString());
        TenKHbl.setText(model.getValueAt(Myindex, 1).toString());
        //SDT.setText(model.getValueAt(Myindex, 2).toString());

    }//GEN-LAST:event_DanhsachKHMouseClicked

    private void HoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoadonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HoadonMouseClicked

    private void ThemSLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThemSLbl1MouseClicked
      try {
          Hoadon.print();
      }catch (Exception ex)
      {
          ex.printStackTrace();
      }
    }//GEN-LAST:event_ThemSLbl1MouseClicked

    private void Thanhtienbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thanhtienbl1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Thanhtienbl1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DanhSachSP;
    private javax.swing.JTable DanhsachKH;
    private javax.swing.JButton DatHangbn;
    private javax.swing.JTextField Datebl;
    private javax.swing.JTextField Giabl;
    private javax.swing.JTable Hoadon;
    private javax.swing.JButton Home;
    private javax.swing.JTextField Madh;
    private javax.swing.JTextField Soluongbl;
    private javax.swing.JButton Sua;
    private javax.swing.JButton TaoBtn;
    private javax.swing.JTextField TenKHbl;
    private javax.swing.JTextField Thanhtienbl;
    private javax.swing.JTextField Thanhtienbl1;
    private javax.swing.JButton ThemSLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
