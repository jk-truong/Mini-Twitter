/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Josh
 */
public class AdminControlPanel extends javax.swing.JFrame {
   String name;
   Group root;

   /**
    * Creates new form GUI
    */
   public AdminControlPanel() {
      initComponents();
   }


   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
   private void initComponents() {
      rightPanel = new JPanel();
      addUserButton = new JButton();
      addGroupButton = new JButton();
      userViewButton = new JButton();
      showTotalButton = new JButton();
      showGroupTotalButton = new JButton();
      showMessageTotalButton = new JButton();
      showPositivePercentageButton = new JButton();
      userName = new JTextField();
      groupName = new JTextField();
      nameTextField = new JTextField();
      groupTextField = new JTextField();
      creationTimeTextField = new JTextField();
      jTextFieldUser = new JTextField();
      jTextFieldGroup = new JTextField();
      leftPanel = new JPanel();
      jScrollPane1 = new JScrollPane();
      jTree1 = new JTree();

      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      addUserButton.setText("Add User");
      addUserButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            addUserButtonActionPerformed(evt);
         }
      });

      addGroupButton.setText("Add Group");
      addGroupButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            addGroupButtonActionPerformed(evt);
         }
      });

      userViewButton.setText("Open User View");
      userViewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            userViewButtonActionPerformed(evt);
         }
      });

      showTotalButton.setText("Show User Total");

      showGroupTotalButton.setText("Show Messages Total");

      showMessageTotalButton.setText("Show Group Total");

      showPositivePercentageButton.setText("Show Positive Percentage");

      userName.setEditable(false);
      userName.setText("User Name: ");

      groupName.setEditable(false);
      groupName.setText("Group Name: ");

      jTextFieldUser.setEditable(false);
      jTextFieldUser.setText("Enter User Name:");

      jTextFieldGroup.setEditable(false);
      jTextFieldGroup.setText("Enter Group Name:");


      GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
      rightPanel.setLayout(rightPanelLayout);
      rightPanelLayout.setHorizontalGroup(
              rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addGroup(rightPanelLayout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                      .addComponent(userViewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                      .addGroup(rightPanelLayout.createSequentialGroup()
                                              .addComponent(showTotalButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                              .addComponent(showMessageTotalButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
                                      .addComponent(userName)
                                      .addComponent(groupName)
                                      .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                              .addComponent(showGroupTotalButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                              .addComponent(showPositivePercentageButton, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
                                      .addGroup(rightPanelLayout.createSequentialGroup()
                                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                      .addComponent(jTextFieldUser)
                                                      .addComponent(jTextFieldGroup))
                                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(groupTextField, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                      .addComponent(nameTextField))
                                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(addUserButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(addGroupButton, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                              .addContainerGap())
      );
      rightPanelLayout.setVerticalGroup(
              rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addGroup(rightPanelLayout.createSequentialGroup()
                              .addGap(12, 12, 12)
                              .addComponent(userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(groupName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                      .addComponent(addUserButton)
                                      .addComponent(jTextFieldUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                      .addComponent(jTextFieldGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(groupTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(addGroupButton))
                              .addGap(102, 102, 102)
                              .addComponent(userViewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                      .addComponent(showTotalButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(showMessageTotalButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                              .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                      .addComponent(showPositivePercentageButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(showGroupTotalButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                              .addGap(406, 406, 406))
      );

      /* Create a new tree structure with root. */
      DefaultMutableTreeNode top = new DefaultMutableTreeNode("Root");
      root = new Group("Root");

      jTree1.setModel(new DefaultTreeModel(top));
      jTree1.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
      jTree1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            jTree1MouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(jTree1);

      GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
      leftPanel.setLayout(leftPanelLayout);
      leftPanelLayout.setHorizontalGroup(
              leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
      );
      leftPanelLayout.setVerticalGroup(
              leftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addComponent(jScrollPane1)
      );

      GroupLayout layout = new GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addContainerGap())
      );
      layout.setVerticalGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                      .addComponent(leftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                      .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE))
                              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>

   /* This gets selected node text and displays it into jtext fields */
   private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {
      DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
      if (selectedNode.isLeaf()) {
         userName.setText("User Name: " + selectedNode.getUserObject().toString());

      } else {
         userName.setText("User Name: ");
      }
      if (selectedNode.getParent() != null) {
         groupName.setText("Group Name: " + selectedNode.getParent().toString());
      } else {
         groupName.setText("Group Name: ");
      }
   }

   /* This opens the User Panel */
   private void userViewButtonActionPerformed(java.awt.event.ActionEvent evt) {
      UserControlPanel userControlPanel = new UserControlPanel();
      userControlPanel.setVisible(true);

      // TODO: grab selected object from tree and send it to this panel
   }

   /* Adds user */
   private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
      name = nameTextField.getText();
      nameTextField.setText("");
      if (name.isEmpty()){
         System.out.println("Name cannot be empty");
      } else {
         DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
         User user = new User(name);
         DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(name);
         selectedNode.add(newNode);
      }

      // reload jTree model
      DefaultTreeModel model = (DefaultTreeModel)jTree1.getModel();
      model.reload();
      System.out.println();
   }

   /* Adds group */
   private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
      name = groupTextField.getText();
      groupTextField.setText("");
      if (name.isEmpty()){
         System.out.println("Name cannot be empty");
      } else {
         DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
         createNode(selectedNode);
      }

      // reload jtree model
      DefaultTreeModel model = (DefaultTreeModel)jTree1.getModel();
      model.reload();
   }

   private void createNode(DefaultMutableTreeNode top) {
      DefaultMutableTreeNode user;
      DefaultMutableTreeNode group;

      group = new DefaultMutableTreeNode(name);
      top.add(group);

   }


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
         java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminControlPanel().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify
   private javax.swing.JButton addGroupButton;
   private javax.swing.JButton addUserButton;
   private javax.swing.JTextField groupName;
   private javax.swing.JTextField groupTextField;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField jTextFieldUser;
   private javax.swing.JTextField jTextFieldGroup;
   public javax.swing.JTree jTree1;
   private javax.swing.JPanel leftPanel;
   private javax.swing.JTextField nameTextField;
   private javax.swing.JPanel rightPanel;
   private javax.swing.JButton showGroupTotalButton;
   private javax.swing.JButton showMessageTotalButton;
   private javax.swing.JButton showPositivePercentageButton;
   private javax.swing.JButton showTotalButton;
   private javax.swing.JTextField userName;
   private javax.swing.JButton userViewButton;
   private javax.swing.JTextField creationTimeTextField;
   // End of variables declaration
}
