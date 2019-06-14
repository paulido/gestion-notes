/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.DaoFactory;
import DAO.EtudiantDAO;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import models.Etudiant;
import models.Filiere;
import models.Matiere;

/**
 *
 * @author DIGITAL
 */
public class FrameHome extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    private DaoFactory daoFactory = null;
    private static String dbname = "seainfo20162017l3s6";
    private static String username = "idopaul";
    private static String password = "12231381";
    public DefaultTableModel model;
    public ArrayList<Etudiant> listEtudiant = null;
    public ArrayList<Matiere> listMatiere = null;
    public FrameHome() {
        this.daoFactory = new DaoFactory(dbname, username, password);
        initComponents();
        addRowToJtable();
        this.setExtendedState((getExtendedState()| JFrame.MAXIMIZED_BOTH));
        
  
    }

    public void addRowToJtable()
    {
        DaoFactory daoFactory = new DaoFactory(dbname, username, password);
        EtudiantDAO etudiantDao = daoFactory.getEtudiantDAO();
        listEtudiant = new ArrayList();
        listEtudiant = etudiantDao.getAll();
        model = (DefaultTableModel) tblList.getModel();
        Filiere filiere = new Filiere("Informatique");
        Etudiant etd = new Etudiant("Ido", "Paul", "31/12/1995", "Tiodie", "M",  "1420310A",filiere, "L3s6" );
//        for( int i = 0; i<=3; i++)
//        {
//            list.add(etd);
//        }
        Object rowData[] = new Object[7];
        int j = 1;
        for(int i = 0; i < listEtudiant.size(); i++)
        {
            rowData[0] = j;
            rowData[1] = listEtudiant.get(i).getNom();
            rowData[2] = listEtudiant.get(i).getPrenom();
            rowData[3] = listEtudiant.get(i).getDate();
            rowData[4] = listEtudiant.get(i).getLieu();
            rowData[5] = listEtudiant.get(i).getSexe();
            rowData[6] = listEtudiant.get(i).getMatricule();
            model.addRow(rowData);
            j++;
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        jSeparator1 = new javax.swing.JSeparator();
        comboNiv = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbFil = new javax.swing.JLabel();
        lbUfr = new javax.swing.JLabel();
        btDisp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboNiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1S1", "L1S2", "L2S3", "L2S4", "L3S5", "L3S6" }));
        comboNiv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNivItemStateChanged(evt);
            }
        });

        jLabel1.setText("Niveau");

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nom", "Prenom", "Date Naissnace", "Lieu Naissance", "Sexe", "Matricule"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        lbFil.setText("Filiere");

        lbUfr.setText("UFR/SEA");

        btDisp.setText("Afficher");
        btDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDispActionPerformed(evt);
            }
        });

        jMenu1.setText("Parametre");

        jMenuItem1.setText("Configuration par defaut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Quiter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Fiche");

        jMenu6.setText("Saisie");

        jMenuItem3.setText("Nouvel Etudiant");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setText("Nouvel Enseignant");
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Nouvelle Matiere");
        jMenu6.add(jMenuItem5);

        jMenu2.add(jMenu6);

        jMenu7.setText("Consultation");
        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Note");

        jMenuItem6.setText("Saisie Note");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Deliberer");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboNiv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbUfr, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btDisp)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFil)
                            .addComponent(lbUfr))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FrameEtudiant fe = new FrameEtudiant();
        fe.setAlwaysOnTop(true);
        fe.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrameConfig fc = new FrameConfig();
        fc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void comboNivItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNivItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboNivItemStateChanged

    private void btDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDispActionPerformed
        // TODO add your handling code here:
            
        model.setRowCount(0);
//        dbname = "seainfo20162017" + comboNiv.getSelectedItem().toString();
//        DaoFactory daoFactory = new DaoFactory(dbname, username, password);
//        EtudiantDAO etudiantDao = daoFactory.getEtudiantDAO();
//        list = new ArrayList();
//        list = etudiantDao.getAll();
try
{
    
    DaoFactory daoFact = new DaoFactory("", username, password);
    Connection con = daoFact.getConnection();
    Statement stmt = con.createStatement();
//   String sql = "create database idopaul";
//   stmt.execute(sql);
//   con.close();
//   stmt.close();
   DaoFactory daoFactory = new DaoFactory("idopaul", username, password);
    //String sql;
//    sql = "select database idopaul";
//    stmt.execute(sql);
    con = daoFactory.getConnection();
    Statement stmt2 = con.createStatement();
    String sql = "Create table idopaul.clients(Num_cli number,nom_cli varchar(80),pre_cli varchar(80),adr_cli varchar(20),tel_cli number,ville_cli varchar(20))";
    stmt2.executeUpdate(sql);

}
    catch(Exception e)
{
    
}
          
            
    }//GEN-LAST:event_btDispActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        FrameLogin LoginForm = new FrameLogin(daoFactory);
        LoginForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        FrameDelib fdelib = new FrameDelib(daoFactory);
        fdelib.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHome().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDisp;
    private javax.swing.JComboBox<String> comboNiv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbFil;
    private javax.swing.JLabel lbUfr;
    private javax.swing.JTable tblList;
    // End of variables declaration//GEN-END:variables
}
