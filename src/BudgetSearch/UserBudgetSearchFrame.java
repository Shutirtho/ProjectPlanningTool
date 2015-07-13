package BudgetSearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JTable;

import LoginInGUI.LoginIFrame;
import TaskSearch.UserTaskSearchFrame;
import TeamSearch.UserTeamSearchFrame;


public class UserBudgetSearchFrame extends javax.swing.JFrame {
	public JTable jTable1;
	public BudgetSearchTableController budgetSearchTableController;

	/**
	 * Creates new form MainFrame
	 */
	public UserBudgetSearchFrame() {
		// teamSearchTableController = new TeamSearchTableController(this);
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		timelineButton = new javax.swing.JButton();
		budgetButton = new javax.swing.JButton();
		searchButton = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		backButton = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		submitButton = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		projectNameTextFiel = new javax.swing.JTextPane();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		projectIDTextField = new javax.swing.JTextPane();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jScrollPane3 = new javax.swing.JScrollPane();
		jScrollPane5 = new javax.swing.JScrollPane();

		jMenuBar1 = new javax.swing.JMenuBar();

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

		timelineButton.setBackground(new java.awt.Color(251, 197, 97));
		timelineButton.setText("Search Task");
		timelineButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				timelineButtonActionPerformed(evt);
			}
		});

		budgetButton.setBackground(new java.awt.Color(251, 197, 97));
		budgetButton.setText("Search Budget");

		searchButton.setBackground(new java.awt.Color(251, 197, 97));
		searchButton.setText("Search Team");
		searchButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchButtonActionPerformed(evt);
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

		backButton.setBackground(new java.awt.Color(251, 197, 97));
		backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/back.png"))); // NOI18N
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
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
																timelineButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																budgetButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																searchButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																backButton,
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
										.addContainerGap(201, Short.MAX_VALUE)
										.addComponent(
												timelineButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(36, 36, 36)
										.addComponent(
												budgetButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(41, 41, 41)
										.addComponent(
												searchButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(46, 46, 46)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(114,
																				114,
																				114)
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				backButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				41,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(229,
																				229,
																				229)))));

		jPanel4.setBackground(new java.awt.Color(255, 247, 152));

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/foot.jpg"))); // NOI18N

		submitButton.setText("Submit");
		submitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitButtonActionPerformed(evt);
			}
		});

		jLabel1.setText("Project Name：");

		jScrollPane2.setViewportView(projectNameTextFiel);

		jLabel3.setText("Project ID:");

		jScrollPane1.setViewportView(projectIDTextField);

		jLabel5.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
		jLabel5.setText("Budget Search");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, }, new String[] {
						"Project Name", "Budget Detail", "Balance", "Total" }));
		jScrollPane4.setViewportView(jTable1);
		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																997,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel4Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel4Layout
																						.createSequentialGroup()
																						.addGap(55,
																								55,
																								55)
																						.addGroup(
																								jPanel4Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												jPanel4Layout
																														.createSequentialGroup()

																														.addGroup(
																																jPanel4Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addGroup(
																																				jPanel4Layout
																																						.createSequentialGroup()
																																						.addGap(68,
																																								68,
																																								68)

																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE))
																																		.addGroup(
																																				jPanel4Layout
																																						.createSequentialGroup()
																																						.addPreferredGap(
																																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addGroup(
																																								jPanel4Layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																										.addComponent(
																																												jScrollPane2,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												202,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGroup(
																																												javax.swing.GroupLayout.Alignment.TRAILING,
																																												jPanel4Layout
																																														.createSequentialGroup()
																																														.addGroup(
																																																jPanel4Layout
																																																		.createParallelGroup(
																																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																																		.addComponent(
																																																				jScrollPane3,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				205,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addComponent(
																																																				jScrollPane1,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				205,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																																		.addComponent(
																																																				jScrollPane5,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																																				205,
																																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																																														.addGap(149,
																																																149,
																																																149))))))
																										.addGroup(
																												jPanel4Layout
																														.createSequentialGroup()
																														.addGroup(
																																jPanel4Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																		.addComponent(
																																				jLabel5)
																																		.addComponent(
																																				jLabel1)
																																		.addGroup(
																																				jPanel4Layout
																																						.createSequentialGroup()
																																						.addGroup(
																																								jPanel4Layout
																																										.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)

																																										.addComponent(
																																												jLabel3))
																																						.addGap(18,
																																								18,
																																								18)))
																														.addGap(0,
																																0,
																																Short.MAX_VALUE))))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel4Layout
																						.createSequentialGroup()
																						.addGap(53,
																								53,
																								53)
																						.addGroup(
																								jPanel4Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jScrollPane4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												488,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												submitButton)))))
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
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
										.addGap(46, 46, 46)
										.addComponent(jLabel5)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)

														.addComponent(
																jScrollPane5,
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
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(submitButton)
										.addGap(48, 48, 48)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												139,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(64, 64, 64)
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
														javax.swing.GroupLayout.PREFERRED_SIZE,
														600, Short.MAX_VALUE))));
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

	private void timelineButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_timelineButtonActionPerformed
		// TODO add your handling code here:
		new UserTaskSearchFrame().runTaSF();
	}// GEN-LAST:event_timelineButtonActionPerformed

	private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchButtonActionPerformed
		// TODO add your handling code here:
		new UserTeamSearchFrame().runTSF();
	}// GEN-LAST:event_searchButtonActionPerformed

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
		// TODO add your handling code here:
		new LoginIFrame().runLoginFrame();
	}// GEN-LAST:event_backButtonActionPerformed

	private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitButtonActionPerformed
		// TODO add your handling code here:
		String inputProjectName = projectNameTextFiel.getText();
		int inputProjectId = -1;
		if (projectIDTextField.getText().equals("") == false)
			inputProjectId = Integer.valueOf(projectIDTextField.getText());

		budgetSearchTableController = new BudgetSearchTableController(this,
				inputProjectName, inputProjectId);

		jTable1.setModel(budgetSearchTableController.getTableModel());

	}// GEN-LAST:event_submitButtonActionPerformed

	private void taskSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_taskSearchButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_taskSearchButtonActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public void runBSF() {
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
			java.util.logging.Logger.getLogger(
					UserBudgetSearchFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					UserBudgetSearchFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					UserBudgetSearchFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					UserBudgetSearchFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserBudgetSearchFrame().setVisible(true);
			}
		});
	}

	public static void main(String args[]) {
		new UserBudgetSearchFrame().runBSF();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backButton;
	private javax.swing.JButton budgetButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;

	private javax.swing.JLabel jLabel5;

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
	private javax.swing.JTextPane projectIDTextField;
	private javax.swing.JTextPane projectNameTextFiel;
	private javax.swing.JButton searchButton;
	private javax.swing.JButton submitButton;
	private javax.swing.JButton timelineButton;
	// End of variables declaration//GEN-END:variables
}
