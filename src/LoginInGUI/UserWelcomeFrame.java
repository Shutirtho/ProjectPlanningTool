/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginInGUI;

import BudgetSearch.UserBudgetSearchFrame;
import TaskSearch.UserTaskSearchFrame;
import TeamSearch.UserTeamSearchFrame;
import UserGUI.UserList;


public class UserWelcomeFrame extends javax.swing.JFrame {
	public UserList currentUser;

	/**
	 * Creates new form MainFrame
	 */
	public UserWelcomeFrame(UserList cc) {
		initComponents(cc);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents(UserList bb) {

		jMenu5 = new javax.swing.JMenu();
		jMenu6 = new javax.swing.JMenu();
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
		jLabel5 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		userInfoTextArea = new javax.swing.JTextArea();
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

		timelineButton.setBackground(new java.awt.Color(251, 197, 97));
		timelineButton.setText("Search Task");
		timelineButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				timelineButtonActionPerformed(evt);
			}
		});

		budgetButton.setBackground(new java.awt.Color(251, 197, 97));
		budgetButton.setText("Search Budget");
		budgetButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new UserBudgetSearchFrame().runBSF();
			}
		});

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
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
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

		jLabel5.setBackground(new java.awt.Color(226, 245, 240));
		jLabel5.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 0, 51));
		jLabel5.setText("WELCOME!");

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/foot.jpg"))); // NOI18N

		userInfoTextArea.setBackground(new java.awt.Color(255, 247, 152));
		userInfoTextArea.setColumns(20);
		userInfoTextArea.setRows(5);
		userInfoTextArea.setBorder(javax.swing.BorderFactory
				.createTitledBorder(null, "Your Information",
						javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
						javax.swing.border.TitledBorder.DEFAULT_POSITION,
						new java.awt.Font("Consolas", 0, 14),
						new java.awt.Color(255, 51, 102))); // NOI18N
		userInfoTextArea.append("User Name: " + bb.getUser_name());
		userInfoTextArea.append("\n\n");
		userInfoTextArea.append("User Type: " + bb.getUser_type());
		userInfoTextArea.append("\n\n");
		userInfoTextArea.append("User Address: " + bb.getAddress());
		userInfoTextArea.append("\n\n");
		userInfoTextArea.append("User Email: " + bb.getEmail());
		userInfoTextArea.append("\n\n");
		userInfoTextArea.append("User Phone Number: " + bb.getPhone());
		jScrollPane2.setViewportView(userInfoTextArea);

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
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(25,
																				25,
																				25)
																		.addComponent(
																				jLabel5))
														.addComponent(
																jLabel12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																997,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(78,
																				78,
																				78)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				446,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
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
										.addGap(23, 23, 23)
										.addComponent(jLabel5)
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												329,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												162, Short.MAX_VALUE)
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

	/**
	 * @param args
	 *            the command line arguments
	 */
	public void runUserWelcome(UserList a) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger
					.getLogger(UserWelcomeFrame.class.getName()).log(
							java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger
					.getLogger(UserWelcomeFrame.class.getName()).log(
							java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger
					.getLogger(UserWelcomeFrame.class.getName()).log(
							java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger
					.getLogger(UserWelcomeFrame.class.getName()).log(
							java.util.logging.Level.SEVERE, null, ex);
		}
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserWelcomeFrame(a).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton backButton;
	private javax.swing.JButton budgetButton;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JButton searchButton;
	private javax.swing.JButton timelineButton;
	private javax.swing.JTextArea userInfoTextArea;
	// End of variables declaration//GEN-END:variables
}
