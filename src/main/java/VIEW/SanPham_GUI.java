/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import javax.swing.text.*;

import CONTROL.SanPhamDichVu_DAO;
import MODEL.SanPham;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Admin
 */
public class SanPham_GUI extends javax.swing.JPanel {

	/**
	 * Creates new form DichVu_GUI
	 */
	public SanPham_GUI() {
		initComponents();
		updateHeader();
		loadSanPhamToTable();
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
		
		

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new RoundedPanel(20);
        lbXoa = new javax.swing.JLabel();
        btnCapNhat = new RoundedPanel(20);
        lbCapNhat = new javax.swing.JLabel();
        btnThemDichVu = new RoundedPanel(20);
        lbThemDichVu = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();

        String[] columns = {"Mã sản phẩm", "Tên sản phẩm", "Danh mục", "Giá tiền", "Số lượng"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        tbSanPham = new JTable(model);
        jScrollPane1.setViewportView(tbSanPham);
        
        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Sản phẩm");

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbXoa.setForeground(new java.awt.Color(255, 255, 255));
        lbXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoa.setText("Xóa");
        lbXoa.setIconTextGap(10);

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbXoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setBackground(new java.awt.Color(245, 109, 40));
        btnCapNhat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        lbCapNhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCapNhat.setText("Cập nhật");
        lbCapNhat.setIconTextGap(10);

        javax.swing.GroupLayout btnCapNhatLayout = new javax.swing.GroupLayout(btnCapNhat);
        btnCapNhat.setLayout(btnCapNhatLayout);
        btnCapNhatLayout.setHorizontalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCapNhatLayout.setVerticalGroup(
            btnCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnThemDichVu.setBackground(new java.awt.Color(25, 159, 254));
        btnThemDichVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbThemDichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThemDichVu.setForeground(new java.awt.Color(255, 255, 255));
        lbThemDichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThemDichVu.setText("Thêm sản phẩm");
        lbThemDichVu.setIconTextGap(10);

        javax.swing.GroupLayout btnThemDichVuLayout = new javax.swing.GroupLayout(btnThemDichVu);
        btnThemDichVu.setLayout(btnThemDichVuLayout);
        btnThemDichVuLayout.setHorizontalGroup(
            btnThemDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemDichVuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbThemDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        btnThemDichVuLayout.setVerticalGroup(
            btnThemDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemDichVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThemDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính", "Đơn giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbSanPham.setRowHeight(40);
        jScrollPane1.setViewportView(tbSanPham);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
        btnThemDichVu.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		showAddSanPhamDialog();
        	}
        });
        
        btnCapNhat.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		int selectRow = tbSanPham.getSelectedRow();
        		if (selectRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    return;
                }
        		String maSanPham = tbSanPham.getValueAt(selectRow, 0).toString();

                // Lấy sản phẩm từ database thông qua DAO
                SanPhamDichVu_DAO dao = new SanPhamDichVu_DAO();
                SanPham sanPham = dao.getSanPhamByMa(maSanPham);

                if (sanPham == null) {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm để cập nhật!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Gọi phương thức hiển thị dialog cập nhật
                showUpdateSanPhamDialog(sanPham);
        	}
        });
        btnXoa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tbSanPham.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Lấy mã sản phẩm từ dòng được chọn
                String maSanPham = tbSanPham.getValueAt(selectedRow, 0).toString();

                // Xác nhận trước khi xóa
                int confirm = JOptionPane.showConfirmDialog(null, 
                    "Bạn có chắc chắn muốn xóa sản phẩm '" + maSanPham + "' không?", 
                    "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    SanPhamDichVu_DAO dao = new SanPhamDichVu_DAO();
                    if (dao.deleteSPham(maSanPham)) {
                        JOptionPane.showMessageDialog(null, "Xóa sản phẩm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        loadSanPhamToTable(); // Cập nhật lại bảng
                    } else {
                        JOptionPane.showMessageDialog(null, "Xóa sản phẩm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
    }// </editor-fold>//GEN-END:initComponents

	private void updateHeader() {
		JTableHeader header = tbSanPham.getTableHeader();
		header.setFont(new Font("Times new Romans", Font.BOLD, 16));

	}


	// Hàm đổ dữ liệu từ database vào JTable cho DichVu
	
	public void loadSanPhamToTable() {
	    SanPhamDichVu_DAO sanPhamDao = new SanPhamDichVu_DAO();
	    List<SanPham> listSanPham;
	    try {
	        listSanPham = sanPhamDao.getAllSanPham();
	    } catch (Exception e) {
	        // Không hiển thị thông báo, chỉ trả về nếu có lỗi
	        return;
	    }

	    DefaultTableModel model;
	    try {
	        model = (DefaultTableModel) tbSanPham.getModel();
	        model.setRowCount(0); // Xóa toàn bộ dòng hiện có
	    } catch (Exception e) {
	        // Không hiển thị thông báo, chỉ trả về nếu có lỗix
	        return;
	    }
	    // Thêm dữ liệu mới vào bảng
	    for (SanPham sanPham : listSanPham) {
	        Object[] row = {
	            sanPham.getMaSanPham(),
	            sanPham.getTenSanPham(),
	            sanPham.getDanhMuc(),
	            sanPham.getGiaTien(),
	            sanPham.getSoLuong()
	        };
	        model.addRow(row);
	    }
	}
	private boolean validData(String maSanPham, String tenSanPham, String danhMuc, double giaTien, int soLuong, boolean isAddMode) {
	    // Kiểm tra mã sản phẩm (chỉ áp dụng khi thêm mới)
	    if (isAddMode && (maSanPham == null || maSanPham.trim().isEmpty())) {
	        JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }

	    // Kiểm tra tên sản phẩm
	    if (tenSanPham == null || tenSanPham.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Tên sản phẩm không được để trống!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }

	    // Kiểm tra danh mục
	    if (danhMuc == null || danhMuc.trim().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Danh mục không được để trống!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }

	    // Kiểm tra giá tiền
	    if (giaTien <= 0) {
	        JOptionPane.showMessageDialog(null, "Giá tiền phải lớn hơn 0!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }

	    // Kiểm tra số lượng
	    if (soLuong < 0) {
	        JOptionPane.showMessageDialog(null, "Số lượng không được âm!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }

	    return true; // Dữ liệu hợp lệ
	}
	private void showAddSanPhamDialog() {
	    final JDialog addDialog = new JDialog(new JDialog((Frame) null, "Thêm dịch vụ", true));
	    addDialog.setSize(400, 300); // Giảm kích thước vì ít trường hơn
	    addDialog.setLayout(new GridBagLayout());
	    addDialog.setLocationRelativeTo(null);

	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(5, 5, 5, 5);
	    gbc.anchor = GridBagConstraints.WEST;

	    // Tạo các nhãn và trường nhập liệu cho sản phẩm
	    JLabel lblMaSanPham = new JLabel("Mã Sản Phẩm:");
	    JLabel lblTenSanPham = new JLabel("Tên Sản Phẩm:");
	    JLabel lblDanhMuc = new JLabel("Danh Mục:");
	    JLabel lblGiaTien = new JLabel("Giá Tiền:");
	    JLabel lblSoLuong = new JLabel("Số Lượng:");

	    // Định dạng font cho nhãn
	    lblMaSanPham.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblTenSanPham.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblGiaTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblSoLuong.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    // Tạo các trường nhập liệu
	    JTextField txtMaSanPham = new JTextField(20);
	    JTextField txtTenSanPham = new JTextField(20);
	    JTextField txtDanhMuc = new JTextField(20);
	    JTextField txtGiaTien = new JTextField(20);
	    JTextField txtSoLuong = new JTextField(20);

	    // Tạo các nút
	    JButton btnXacNhan = new JButton("Xác Nhận");
	    btnXacNhan.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnXacNhan.setBackground(new java.awt.Color(25, 159, 254));
	    btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
	    btnXacNhan.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    JButton btnHuy = new JButton("Hủy");
	    btnHuy.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnHuy.setBackground(new java.awt.Color(255, 0, 0));
	    btnHuy.setForeground(new java.awt.Color(255, 255, 255));
	    btnHuy.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    // Đặt vị trí các thành phần trên dialog
	    gbc.gridx = 0; gbc.gridy = 0; addDialog.add(lblMaSanPham, gbc);
	    gbc.gridx = 1; addDialog.add(txtMaSanPham, gbc);
	    gbc.gridx = 0; gbc.gridy = 1; addDialog.add(lblTenSanPham, gbc);
	    gbc.gridx = 1; addDialog.add(txtTenSanPham, gbc);
	    gbc.gridx = 0; gbc.gridy = 2; addDialog.add(lblDanhMuc, gbc);
	    gbc.gridx = 1; addDialog.add(txtDanhMuc, gbc);
	    gbc.gridx = 0; gbc.gridy = 3; addDialog.add(lblGiaTien, gbc);
	    gbc.gridx = 1; addDialog.add(txtGiaTien, gbc);
	    gbc.gridx = 0; gbc.gridy = 4; addDialog.add(lblSoLuong, gbc);
	    gbc.gridx = 1; addDialog.add(txtSoLuong, gbc);

	    gbc.gridx = 0; gbc.gridy = 5; addDialog.add(btnXacNhan, gbc);
	    gbc.gridx = 1; addDialog.add(btnHuy, gbc);

	    // Xử lý sự kiện nút "Xác Nhận"
	    btnXacNhan.addActionListener(e -> {
	    	try {
	            String maSanPham = txtMaSanPham.getText().trim();
	            String tenSanPham = txtTenSanPham.getText().trim();
	            String danhMuc = txtDanhMuc.getText().trim();
	            double giaTien = Double.parseDouble(txtGiaTien.getText().trim());
	            int soLuong = Integer.parseInt(txtSoLuong.getText().trim());

	            // Gọi hàm kiểm tra dữ liệu
	            if (!validData(maSanPham, tenSanPham, danhMuc, giaTien, soLuong, true)) {
	                return; // Dừng lại nếu dữ liệu không hợp lệ
	            }

	            // Tạo đối tượng SanPham
	            SanPham sanPham = new SanPham(maSanPham, tenSanPham, danhMuc, giaTien, soLuong);
	            SanPhamDichVu_DAO sanPhamDAO = new SanPhamDichVu_DAO();

	            // Thêm sản phẩm vào cơ sở dữ liệu
	            if (sanPhamDAO.addSPham(sanPham)) {
	                JOptionPane.showMessageDialog(addDialog, "Thêm sản phẩm thành công!");
	                loadSanPhamToTable(); // Làm mới bảng sau khi thêm
	                addDialog.dispose();
	            } else {
	                JOptionPane.showMessageDialog(addDialog, "Thêm sản phẩm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(addDialog, "Giá tiền và số lượng phải là số hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(addDialog, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
	            ex.printStackTrace();
	        }
	    });

	    // Xử lý sự kiện nút "Hủy"
	    btnHuy.addActionListener(e -> addDialog.dispose());

	    addDialog.setVisible(true);
	}
	private void showUpdateSanPhamDialog(SanPham sanPhamUpdate) {
	    final JDialog updateDialog = new JDialog(new JDialog((Frame) null, "Cập nhật dịch vụ", true));
	    updateDialog.setSize(400, 300);
	    updateDialog.setLayout(new GridBagLayout());
	    updateDialog.setLocationRelativeTo(null);

	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(5, 5, 5, 5);
	    gbc.anchor = GridBagConstraints.WEST;

	    JLabel lblMaSanPham = new JLabel("Mã Sản Phẩm:");
	    JLabel lblTenSanPham = new JLabel("Tên Sản Phẩm:");
	    JLabel lblDanhMuc = new JLabel("Danh Mục:");
	    JLabel lblGiaTien = new JLabel("Giá Tiền:");
	    JLabel lblSoLuong = new JLabel("Số Lượng:");

	    lblMaSanPham.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblTenSanPham.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblGiaTien.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    lblSoLuong.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    JTextField txtMaSanPham = new JTextField(20);
	    txtMaSanPham.setText(sanPhamUpdate.getMaSanPham());
	    txtMaSanPham.setEditable(false); // không cho sửa mã

	    JTextField txtTenSanPham = new JTextField(20);
	    txtTenSanPham.setText(sanPhamUpdate.getTenSanPham());

	    JTextField txtDanhMuc = new JTextField(20);
	    txtDanhMuc.setText(sanPhamUpdate.getDanhMuc());

	    JTextField txtGiaTien = new JTextField(20);
	    txtGiaTien.setText(String.valueOf(sanPhamUpdate.getGiaTien()));

	    JTextField txtSoLuong = new JTextField(20);
	    txtSoLuong.setText(String.valueOf(sanPhamUpdate.getSoLuong()));

	    JButton btnCapNhat = new JButton("Cập Nhật");
	    btnCapNhat.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnCapNhat.setBackground(new java.awt.Color(25, 159, 254));
	    btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
	    btnCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    JButton btnHuy = new JButton("Hủy");
	    btnHuy.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnHuy.setBackground(new java.awt.Color(255, 0, 0));
	    btnHuy.setForeground(new java.awt.Color(255, 255, 255));
	    btnHuy.setFont(new Font("Times New Roman", Font.BOLD, 15));

	    gbc.gridx = 0; gbc.gridy = 0; updateDialog.add(lblMaSanPham, gbc);
	    gbc.gridx = 1; updateDialog.add(txtMaSanPham, gbc);
	    gbc.gridx = 0; gbc.gridy = 1; updateDialog.add(lblTenSanPham, gbc);
	    gbc.gridx = 1; updateDialog.add(txtTenSanPham, gbc);
	    gbc.gridx = 0; gbc.gridy = 2; updateDialog.add(lblDanhMuc, gbc);
	    gbc.gridx = 1; updateDialog.add(txtDanhMuc, gbc);
	    gbc.gridx = 0; gbc.gridy = 3; updateDialog.add(lblGiaTien, gbc);
	    gbc.gridx = 1; updateDialog.add(txtGiaTien, gbc);
	    gbc.gridx = 0; gbc.gridy = 4; updateDialog.add(lblSoLuong, gbc);
	    gbc.gridx = 1; updateDialog.add(txtSoLuong, gbc);

	    gbc.gridx = 0; gbc.gridy = 5; updateDialog.add(btnCapNhat, gbc);
	    gbc.gridx = 1; updateDialog.add(btnHuy, gbc);

	    btnCapNhat.addActionListener(e -> {
	    	try {
	            String maSanPham = txtMaSanPham.getText().trim(); // Không cần kiểm tra vì không chỉnh sửa
	            String tenSanPham = txtTenSanPham.getText().trim();
	            String danhMuc = txtDanhMuc.getText().trim();
	            double giaTien = Double.parseDouble(txtGiaTien.getText().trim());
	            int soLuong = Integer.parseInt(txtSoLuong.getText().trim());

	            // Gọi hàm kiểm tra dữ liệu (không kiểm tra maSanPham trong chế độ cập nhật)
	            if (!validData(null, tenSanPham, danhMuc, giaTien, soLuong, false)) {
	                return; // Dừng lại nếu dữ liệu không hợp lệ
	            }

	            // Cập nhật dữ liệu
	            sanPhamUpdate.setTenSanPham(tenSanPham);
	            sanPhamUpdate.setDanhMuc(danhMuc);
	            sanPhamUpdate.setGiaTien(giaTien);
	            sanPhamUpdate.setSoLuong(soLuong);

	            SanPhamDichVu_DAO sanPhamDAO = new SanPhamDichVu_DAO();

	            if (sanPhamDAO.updateSPham(sanPhamUpdate)) {
	                JOptionPane.showMessageDialog(updateDialog, "Cập nhật sản phẩm thành công!");
	                loadSanPhamToTable();
	                updateDialog.dispose();
	            } else {
	                JOptionPane.showMessageDialog(updateDialog, "Cập nhật thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(updateDialog, "Giá tiền và số lượng phải là số hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(updateDialog, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
	            ex.printStackTrace();
	        }
	    });

	    btnHuy.addActionListener(e -> updateDialog.dispose());

	    updateDialog.setVisible(true);
	}

	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCapNhat;
    private javax.swing.JPanel btnThemDichVu;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JLabel lbCapNhat;
    private javax.swing.JLabel lbThemDichVu;
    private javax.swing.JLabel lbXoa;
    // End of variables declaration//GEN-END:variables
}
