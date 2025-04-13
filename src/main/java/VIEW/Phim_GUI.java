/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import javax.swing.text.*;
import javax.swing.text.DocumentFilter.FilterBypass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.toedter.calendar.JDateChooser;

import CONTROL.Phim_DAO;
import MODEL.Phim;
import MODEL.TrangThaiPhim;


/**
 *
 * @author 8483
 */
public class Phim_GUI extends javax.swing.JPanel {
	/**
	 * Creates new form NhanVien_GUI
	 */
	public Phim_GUI() {
		initComponents();
		updateHeader();
		loadPhimToTable();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlePhim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        btnXoa = new RoundedPanel(20);
        lbXoa = new javax.swing.JLabel();
        btnCapNhat = new RoundedPanel(20);
        lbCapNhat = new javax.swing.JLabel();
        btnThemPhim = new RoundedPanel(20);
        lbThemPhim = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlePhim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titlePhim.setText("Danh sách phim");

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Mã phim", "Tên phim", "Thời lượng", "Thể loại", "Trạng thái phim", "Hình ảnh"}
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNhanVien.setRowHeight(40);
        jScrollPane1.setViewportView(tbNhanVien);

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbXoa.setForeground(new java.awt.Color(255, 255, 255));
        lbXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/delete.png"))); // NOI18N
        lbXoa.setText("Xóa");
        

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addComponent(lbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbXoa)
                .addContainerGap())
        );

        btnCapNhat.setBackground(new java.awt.Color(245, 109, 40));
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        lbCapNhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCapNhat.setText("Cập nhật");

        javax.swing.GroupLayout btnCapNhatLayout = new javax.swing.GroupLayout(btnCapNhat);
        btnCapNhat.setLayout(btnCapNhatLayout);
        btnCapNhatLayout.setHorizontalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        btnCapNhatLayout.setVerticalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCapNhatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCapNhat)
                .addContainerGap())
        );

        btnThemPhim.setBackground(new java.awt.Color(25, 159, 254));
        btnThemPhim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbThemPhim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThemPhim.setForeground(new java.awt.Color(255, 255, 255));
        lbThemPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemPhim.setText("Thêm phim");

        javax.swing.GroupLayout btnThemPhimLayout = new javax.swing.GroupLayout(btnThemPhim);
        btnThemPhim.setLayout(btnThemPhimLayout);
        btnThemPhimLayout.setHorizontalGroup(
            btnThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemPhimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThemPhim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThemPhimLayout.setVerticalGroup(
            btnThemPhimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemPhimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThemPhim)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePhim, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titlePhim)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
       
        btnThemPhim.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showAddPhimDialog();
            }
        });
        
        btnXoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteSelectedPhim();
            }
        });
        btnCapNhat.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		updatePhimDialog();
        	}
		});

    }// </editor-fold>//GEN-END:initComponents

	private void updateHeader() {
		JTableHeader header = tbNhanVien.getTableHeader();
		header.setFont(new Font("Times new Romans", Font.BOLD, 16));
	}
	
	private void loadPhimToTable() {
	    Phim_DAO phimDAO = new Phim_DAO();
	    List<Phim> listPhim = phimDAO.getAllPhim();
	    
	    DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
	    model.setRowCount(0);
	    
	    for (Phim phim : listPhim) {
	        Object[] row = {
	            phim.getMaPhim(),
	            phim.getTenPhim(),
	            phim.getThoiLuong(),
	            phim.getTheLoai(),
	            phim.getTrangThaiPhim().toString(),
	            phim.getHinhAnh()
	        };
	        model.addRow(row);
	    }
	}
	
	private void showAddPhimDialog() {
	    final JDialog addDialog = new JDialog((Frame) null, "Thêm Phim", true);
	    addDialog.setSize(400, 350);
	    addDialog.setLayout(new GridBagLayout());
	    addDialog.setLocationRelativeTo(null);

	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(5, 5, 5, 5);
	    gbc.anchor = GridBagConstraints.WEST;

	    JLabel lblMaPhim = new JLabel("Mã Phim:");
	    JLabel lblTenPhim = new JLabel("Tên Phim:");
	    JLabel lblThoiLuong = new JLabel("Thời Lượng:");
	    JLabel lblTheLoai = new JLabel("Thể Loại:");
	    JLabel lblTrangThai = new JLabel("Trạng Thái:");
	    JLabel lblHinhAnh = new JLabel("Hình Ảnh:");
	    
	    lblMaPhim.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    lblTenPhim.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    lblThoiLuong.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    lblTheLoai.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    lblTrangThai.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    lblHinhAnh.setFont(new Font("Time new Romans", Font.BOLD, 15));

	    JTextField txtMaPhim = new JTextField(20);
	    JTextField txtTenPhim = new JTextField(20);
	    JTextField txtThoiLuong = new JTextField(20);
	    JTextField txtTheLoai = new JTextField(20);
	    
	    JComboBox<TrangThaiPhim> cbTrangThai = new JComboBox<>(TrangThaiPhim.values());

	    JTextField txtHinhAnh = new JTextField(20);

	    JButton btnXacNhan = new JButton("Xác Nhận");
	    btnXacNhan.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnXacNhan.setBackground(new java.awt.Color(25, 159, 254));
	    btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
	    btnXacNhan.setFont(new Font("Time new Romans", Font.BOLD, 15));
	    JButton btnHuy = new JButton("Hủy");
	    btnHuy.setCursor(new Cursor(Cursor.HAND_CURSOR));

	    btnHuy.setBackground(new java.awt.Color(255, 0, 0));
	    btnHuy.setForeground(new java.awt.Color(255, 255, 255));
	    btnHuy.setFont(new Font("Time new Romans", Font.BOLD, 15));

	    gbc.gridx = 0; gbc.gridy = 0; addDialog.add(lblMaPhim, gbc);
	    gbc.gridx = 1; addDialog.add(txtMaPhim, gbc);
	    gbc.gridx = 0; gbc.gridy = 1; addDialog.add(lblTenPhim, gbc);
	    gbc.gridx = 1; addDialog.add(txtTenPhim, gbc);
	    gbc.gridx = 0; gbc.gridy = 2; addDialog.add(lblThoiLuong, gbc);
	    gbc.gridx = 1; addDialog.add(txtThoiLuong, gbc);
	    gbc.gridx = 0; gbc.gridy = 3; addDialog.add(lblTheLoai, gbc);
	    gbc.gridx = 1; addDialog.add(txtTheLoai, gbc);
	    gbc.gridx = 0; gbc.gridy = 4; addDialog.add(lblTrangThai, gbc);
	    gbc.gridx = 1; addDialog.add(cbTrangThai, gbc);
	    gbc.gridx = 0; gbc.gridy = 5; addDialog.add(lblHinhAnh, gbc);
	    gbc.gridx = 1; addDialog.add(txtHinhAnh, gbc);

	    gbc.gridx = 0; gbc.gridy = 6; addDialog.add(btnXacNhan, gbc);
	    gbc.gridx = 1; addDialog.add(btnHuy, gbc);

	    btnXacNhan.addActionListener(e -> {
	        try {
	            String maPhim = txtMaPhim.getText().trim();
	            String tenPhim = txtTenPhim.getText().trim();
	            int thoiLuong = Integer.parseInt(txtThoiLuong.getText().trim());
	            String theLoai = txtTheLoai.getText().trim();
	            TrangThaiPhim trangThai = (TrangThaiPhim) cbTrangThai.getSelectedItem();
	            String hinhAnh = txtHinhAnh.getText().trim();

	            Phim phim = new Phim(maPhim, tenPhim, thoiLuong, theLoai, trangThai, hinhAnh);
	            Phim_DAO phimDAO = new Phim_DAO();

	            if (phimDAO.addPhim(phim)) {
	                JOptionPane.showMessageDialog(addDialog, "Thêm phim thành công!");
	                loadPhimToTable();
	                addDialog.dispose();
	            } else {
	                JOptionPane.showMessageDialog(addDialog, "Thêm phim thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(addDialog, "Thời lượng phải là số nguyên!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        }
	    });

	    btnHuy.addActionListener(e -> addDialog.dispose());

	    addDialog.setVisible(true);
	}
	
	private void deleteSelectedPhim() {
        int selectedRow = tbNhanVien.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phim cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String maPhim = (String) tbNhanVien.getValueAt(selectedRow, 0);
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa phim này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Phim_DAO phimDAO = new Phim_DAO();
            if (phimDAO.deletePhim(maPhim)) {
                JOptionPane.showMessageDialog(this, "Xóa phim thành công!");
                loadPhimToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa phim thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
	
	private void updatePhimDialog() {
	    int selectedRow = tbNhanVien.getSelectedRow();
	    if (selectedRow == -1) {
	        JOptionPane.showMessageDialog(this, "Vui lòng chọn một phim để cập nhật!");
	        return;
	    }

	    String maPhim = tbNhanVien.getValueAt(selectedRow, 0).toString();
	    String tenPhim = tbNhanVien.getValueAt(selectedRow, 1).toString();
	    int thoiLuong = Integer.parseInt(tbNhanVien.getValueAt(selectedRow, 2).toString());
	    String theLoai = tbNhanVien.getValueAt(selectedRow, 3).toString();
	    String trangThaiPhim = tbNhanVien.getValueAt(selectedRow, 4).toString();
	    String hinhAnh = tbNhanVien.getValueAt(selectedRow, 5).toString();

	    JTextField txtTenPhim = new JTextField(tenPhim);
	    txtTenPhim.setPreferredSize(new Dimension(50, 30));
	    JTextField txtThoiLuong = new JTextField(String.valueOf(thoiLuong));
	    txtThoiLuong.setPreferredSize(new Dimension(50, 30));
	    JTextField txtTheLoai = new JTextField(theLoai);
	    txtTheLoai.setPreferredSize(new Dimension(50, 30));
	    JTextField txtHinhAnh = new JTextField(hinhAnh);

	    JComboBox<TrangThaiPhim> cbTrangThai = new JComboBox<>(TrangThaiPhim.values());
	    cbTrangThai.setSelectedItem(TrangThaiPhim.fromString(trangThaiPhim));

	    Font font = new Font("Time new Romans", Font.BOLD, 15);

	    JLabel lblTenPhim = new JLabel("Tên phim:");
	    lblTenPhim.setFont(font);
	    JLabel lblThoiLuong = new JLabel("Thời lượng:");
	    lblThoiLuong.setFont(font);
	    JLabel lblTheLoai = new JLabel("Thể loại:");
	    lblTheLoai.setFont(font);
	    JLabel lblTrangThai = new JLabel("Trạng thái phim:");
	    lblTrangThai.setFont(font);
	    JLabel lblHinhAnh = new JLabel("Hình ảnh:");
	    lblHinhAnh.setFont(font);

	    Object[] message = {
	        lblTenPhim, txtTenPhim,
	        lblThoiLuong, txtThoiLuong,
	        lblTheLoai, txtTheLoai,
	        lblTrangThai, cbTrangThai,
	        lblHinhAnh, txtHinhAnh
	    };

	    int option = JOptionPane.showConfirmDialog(this, message, "Cập nhật phim", JOptionPane.OK_CANCEL_OPTION);
	    if (option == JOptionPane.OK_OPTION) {
	        try {
	            TrangThaiPhim trangThaiEnumMoi = (TrangThaiPhim) cbTrangThai.getSelectedItem();

	            Phim phimMoi = new Phim(maPhim, txtTenPhim.getText(),
	                    Integer.parseInt(txtThoiLuong.getText()), 
	                    txtTheLoai.getText(),
	                    trangThaiEnumMoi, 
	                    txtHinhAnh.getText());

	            Phim_DAO phimDAO = new Phim_DAO();
	            boolean success = phimDAO.updatePhim(phimMoi);

	            if (success) {
	                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
	                loadPhimToTable();
	            } else {
	                JOptionPane.showMessageDialog(this, "Cập nhật thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (IllegalArgumentException e) {
	            JOptionPane.showMessageDialog(this, "Trạng thái phim không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCapNhat;
    private javax.swing.JPanel btnThemPhim;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCapNhat;
    private javax.swing.JLabel lbThemPhim;
    private javax.swing.JLabel lbXoa;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JLabel titlePhim;
    // End of variables declaration//GEN-END:variables
}
