/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserGUI;

import javax.swing.JTable;

import BudgetGUI.BudgetEdtFrame;
import LoginInGUI.LoginIFrame;
import ProjectGUI.ProjectEdtFrame;
import RecordGUI.RecordEdtFrame;
import TeamGUI.TeamEdtFrame;
import TimeLineGUI.TimelineEdtFrame;


/**
 *
 * @author Kevin
 */
public class UserListGUI extends javax.swing.JFrame {

	private JTable jTable1;
	private UserListTableController userListTableController;

	/**
	 * Creates new form MainFrame
	 */
	public UserListGUI() {

		userListTableController = new UserListTableController(this);
		initComponents();
		addJTable();
	}

	public void addJTable() {

		jTable1.getSelectionModel().addListSelectionListener(
				userListTableController);

	}

	public void updateTable() {
		jTable1.setModel(userListTableController.getTableModel());
	}

	// display data on the courseNameTextField
	public void setUserIdTextField(String value) {
		userIDTextField.setText(value);
	}

	// display data on the courseNumberTextField
	public void setPasswordTextField(String value) {
		passwordTextField.setText(value);
	}

	// display data on the courseNumberTextField
	public void setUserNameTextField(String value) {
		userNameTextField.setText(value);
	}

	public void setAddressTextField(String value) {
		addressTextField.setText(value);
	}

	// display data on the endDateTextField
	public void setEmailTextField(String value) {
		emailTextField.setText(value);
	}

	public void setPhoneTextField(String value) {
		phoneTextField.setText(value);
	}


	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		jTable1 = new javax.swing.JTable();
		jMenu5 = new javax.swing.JMenu();
		jMenu6 = new javax.swing.JMenu();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		userManagementButton = new javax.swing.JButton();
		buttonManagementButton = new javax.swing.JButton();
		teamManagementButton = new javax.swing.JButton();
		timelineManagementButton = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		budgetManagementButton = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		userNameTextField = new javax.swing.JTextPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		addressTextField = new javax.swing.JTextPane();
		jScrollPane3 = new javax.swing.JScrollPane();
		passwordTextField = new javax.swing.JTextPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		deleteButton = new javax.swing.JButton();
		jScrollPane4 = new javax.swing.JScrollPane();
		jLabel6 = new javax.swing.JLabel();
		userTypeComboBox = new javax.swing.JComboBox<String>();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		emailTextField = new javax.swing.JTextPane();
		jScrollPane6 = new javax.swing.JScrollPane();
		phoneTextField = new javax.swing.JTextPane();
		jScrollPane7 = new javax.swing.JScrollPane();
		userIDTextField = new javax.swing.JTextPane();
		addButton = new javax.swing.JButton();
		clearButton = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		updateButton = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();

		jMenu5.setText("jMenu5");

		jMenu6.setText("jMenu6");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));

		jPanel1.setPreferredSize(new java.awt.Dimension(615, 120));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/mainlogo.jpg"))); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel2));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jPanel2.setBackground(new java.awt.Color(246, 172, 45));

		userManagementButton.setBackground(new java.awt.Color(251, 197, 97));
		userManagementButton.setText("User Management");
		userManagementButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						userManagementButtonActionPerformed(evt);
					}
				});

		buttonManagementButton.setBackground(new java.awt.Color(251, 197, 97));
		buttonManagementButton.setText("Project Management");
		buttonManagementButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						buttonManagementButtonActionPerformed(evt);
					}
				});

		teamManagementButton.setBackground(new java.awt.Color(251, 197, 97));
		teamManagementButton.setText("Team Management");
		teamManagementButton
		.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new TeamEdtFrame().runTeam();
			}
		});

		timelineManagementButton
				.setBackground(new java.awt.Color(251, 197, 97));
		timelineManagementButton.setText("TimeLine Management");
		timelineManagementButton
		.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new TimelineEdtFrame().runTimeline();
			}
		});

		jButton8.setBackground(new java.awt.Color(251, 197, 97));
		jButton8.setText("Record");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		budgetManagementButton.setBackground(new java.awt.Color(251, 197, 97));
		budgetManagementButton.setText("Budget Management");
		budgetManagementButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						budgetManagementButtonActionPerformed(evt);
					}
				});

		jLabel10.setBackground(new java.awt.Color(246, 172, 145));
		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/scu.png"))); // NOI18N

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addComponent(jLabel10)
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 174,
				Short.MAX_VALUE));

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/back.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new LoginIFrame().runLoginFrame();
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel5,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																userManagementButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																buttonManagementButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																teamManagementButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																budgetManagementButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																timelineManagementButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(114, 114, 114)
										.addComponent(
												userManagementButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												buttonManagementButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												teamManagementButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												timelineManagementButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												budgetManagementButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jButton8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(462, 462, 462)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(229, 229, 229)));

		jPanel4.setBackground(new java.awt.Color(255, 247, 152));

		jScrollPane1.setViewportView(userNameTextField);

		jScrollPane2.setViewportView(addressTextField);

		jScrollPane3.setViewportView(passwordTextField);

		jLabel1.setText("User ID:");

		jLabel3.setText("User Name:");

		jLabel4.setText("Password:");

		jLabel5.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
		jLabel5.setText("User Management");

		clearButton.setText("Clear");
		clearButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearButtonActionPerformed(evt);
			}
		});

		addButton.setText("Add");
		addButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addButtonActionPerformed(evt);
			}
		});

		deleteButton.setText("Delete");
		deleteButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteButtonActionPerformed(evt);
			}
		});

		updateButton.setText("Update");
		updateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateButtonActionPerformed(evt);
			}
		});

		jTable1.setModel(userListTableController.getTableModel());
		jScrollPane4.setViewportView(jTable1);

		jLabel6.setText("User Type:");

		userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(
				new String[] { "Administrator", "Student", "Faculty Advisor", "Partner" }));
		userTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				userTypeComboBoxActionPerformed(evt);
			}
		});

		jLabel7.setText("Address:");

		jLabel8.setText("Email:");

		jLabel9.setText("Phone:");

		jScrollPane5.setViewportView(emailTextField);

		jScrollPane6.setViewportView(phoneTextField);

		jScrollPane7.setViewportView(userIDTextField);

		addButton.setText("Add");
		addButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addButtonActionPerformed(evt);
			}
		});

		clearButton.setText("Clear");
		clearButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearButtonActionPerformed(evt);
			}
		});

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/foot.jpg"))); // NOI18N

		updateButton.setText("Update");
		updateButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel12,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel4Layout.createSequentialGroup()
										.addGap(37, 37, 37)
										.addComponent(jLabel5)
										.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																485,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								jPanel4Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addGroup(
																												jPanel4Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel1)
																														.addGap(27,
																																27,
																																27)
																														.addComponent(
																																jScrollPane7))
																										.addGroup(
																												jPanel4Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel4Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel3)
																																		.addComponent(
																																				jLabel4))
																														.addGap(15,
																																15,
																																15)
																														.addGroup(
																																jPanel4Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				false)
																																		.addComponent(
																																				jScrollPane1)
																																		.addComponent(
																																				jScrollPane3,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				135,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGroup(
																												jPanel4Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel6)
																														.addGap(18,
																																18,
																																18)
																														.addComponent(
																																userTypeComboBox,
																																0,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)))
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addComponent(
																												clearButton)
																										.addGap(59,
																												59,
																												59)
																										.addComponent(
																												deleteButton)
																										.addGap(22,
																												22,
																												22)))
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel7)
																														.addComponent(
																																jLabel8)
																														.addComponent(
																																jLabel9))
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jScrollPane2)
																														.addComponent(
																																jScrollPane5)
																														.addComponent(
																																jScrollPane6,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																135,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addGap(68,
																												68,
																												68)
																										.addComponent(
																												addButton,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												70,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(64,
																												64,
																												64)
																										.addComponent(
																												updateButton,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												70,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addComponent(jLabel5)
										.addGap(33, 33, 33)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jScrollPane7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7))
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addGap(26,
																												26,
																												26)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jScrollPane1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel4Layout
																										.createSequentialGroup()
																										.addGap(18,
																												18,
																												18)
																										.addGroup(
																												jPanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel8)
																														.addComponent(
																																jScrollPane5,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel4Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jScrollPane3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												jLabel4))
																						.addComponent(
																								jScrollPane6,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(75,
																				75,
																				75)
																		.addComponent(
																				jLabel9)))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																userTypeComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																clearButton)
														.addComponent(
																deleteButton)
														.addComponent(addButton)
														.addComponent(
																updateButton))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												180,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(35, 35, 35)
										.addComponent(
												jLabel12,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												50,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														600, Short.MAX_VALUE)
												.addComponent(
														jPanel4,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel4,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void buttonManagementButtonActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonManagementButtonActionPerformed
		// TODO add your handling code here:
		new ProjectEdtFrame().runProject();
	}// GEN-LAST:event_buttonManagementButtonActionPerformed

	private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
		// TODO add your handling code here:
		int row = jTable1.getSelectedRow();
		userListTableController.deleteRow(String.valueOf(row));
	}// GEN-LAST:event_deleteButtonActionPerformed

	private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
		// TODO add your handling code here:
		System.out.println("Start array");
		String[] array = new String[jTable1.getColumnCount()];
		array[0] = userIDTextField.getText();
		array[1] = passwordTextField.getText();
		array[2] = userNameTextField.getText();
		array[3] = (String) userTypeComboBox.getSelectedItem();
		array[4] = addressTextField.getText();
		array[5] = emailTextField.getText();
		array[6] = phoneTextField.getText();
		System.out.println("end array");
		userListTableController.addRow(array);
		System.out.println("hualala");
		jTable1.setRowSelectionInterval(jTable1.getRowCount() - 1,
				jTable1.getRowCount() - 1);
		System.out.println("hehe");
	}// GEN-LAST:event_addButtonActionPerformed

	private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
		// TODO add your handling code here:
		userIDTextField.setText("");
		passwordTextField.setText("");
		userNameTextField.setText("");
		addressTextField.setText("");
		emailTextField.setText("");
		phoneTextField.setText("");
	}// GEN-LAST:event_clearButtonActionPerformed

	private void userManagementButtonActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userManagementButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_userManagementButtonActionPerformed

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
		// TODO add your handling code here:
		new RecordEdtFrame().runRecord();
	}// GEN-LAST:event_jButton8ActionPerformed

	private void budgetManagementButtonActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_budgetManagementButtonActionPerformed
		// TODO add your handling code here:
		new BudgetEdtFrame().runBudget();
	}// GEN-LAST:event_budgetManagementButtonActionPerformed

	private void userTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userTypeComboBoxActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_userTypeComboBoxActionPerformed



	private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed
		// TODO add your handling code here:
		String[] array = new String[jTable1.getColumnCount()];
		array[0] = userIDTextField.getText();
		array[1] = passwordTextField.getText();
		array[2] = userNameTextField.getText();
		array[3] = (String) userTypeComboBox.getSelectedItem();
		array[4] = addressTextField.getText();
		array[5] = emailTextField.getText();
		array[6] = phoneTextField.getText();
		int row = jTable1.getSelectedRow();
		userListTableController.updateRow(String.valueOf(row), array);
	}// GEN-LAST:event_updateButtonActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public void runUser() {

		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UserListGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UserListGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UserListGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UserListGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserListGUI().setVisible(true);
			}
		});
	}
	
	public static void main(String args[]){
		new UserListGUI().runUser();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton addButton;
	private javax.swing.JTextPane addressTextField;
	private javax.swing.JButton budgetManagementButton;
	private javax.swing.JButton buttonManagementButton;
	private javax.swing.JButton clearButton;
	private javax.swing.JButton deleteButton;
	private javax.swing.JTextPane emailTextField;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JTextPane passwordTextField;
	private javax.swing.JTextPane phoneTextField;
	private javax.swing.JButton teamManagementButton;
	private javax.swing.JButton timelineManagementButton;
	private javax.swing.JButton updateButton;
	private javax.swing.JTextPane userIDTextField;
	private javax.swing.JButton userManagementButton;
	private javax.swing.JTextPane userNameTextField;
	private javax.swing.JComboBox<String> userTypeComboBox;
	// End of variables declaration//GEN-END:variables
}