/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

/**
 *
 * @author User
 */
public class latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form latihan4
     */
    public latihan4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idnama = new javax.swing.JTextField();
        idabsen = new javax.swing.JTextField();
        idalamat = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        idexit = new javax.swing.JButton();
        idsubmit = new javax.swing.JButton();
        rdbTKJ = new javax.swing.JRadioButton();
        rdbRPL = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("NAMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 60, 14);

        jLabel2.setText("ABSEN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 60, 14);

        ad.setText("KELAS");
        getContentPane().add(ad);
        ad.setBounds(30, 140, 60, 14);

        jLabel4.setText("JURUSAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 80, 14);

        jLabel5.setText("ALAMAT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 90, 14);

        jLabel6.setText("BIODATA SISWA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 10, 250, 14);
        getContentPane().add(idnama);
        idnama.setBounds(160, 40, 120, 30);
        getContentPane().add(idabsen);
        idabsen.setBounds(160, 80, 120, 30);
        getContentPane().add(idalamat);
        idalamat.setBounds(160, 230, 180, 60);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4" }));
        getContentPane().add(combo);
        combo.setBounds(160, 130, 120, 30);

        idexit.setBackground(new java.awt.Color(255, 102, 102));
        idexit.setText("EXIT");
        idexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idexitActionPerformed(evt);
            }
        });
        getContentPane().add(idexit);
        idexit.setBounds(340, 150, 80, 30);

        idsubmit.setBackground(new java.awt.Color(153, 255, 153));
        idsubmit.setText("SUBMIT");
        idsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(idsubmit);
        idsubmit.setBounds(340, 100, 80, 30);

        buttonGroup1.add(rdbTKJ);
        rdbTKJ.setText("TKJ");
        getContentPane().add(rdbTKJ);
        rdbTKJ.setBounds(250, 180, 150, 30);

        buttonGroup1.add(rdbRPL);
        rdbRPL.setText("RPL");
        getContentPane().add(rdbRPL);
        rdbRPL.setBounds(160, 180, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LatihanGUI/bg3.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -50, 500, 640);

        setBounds(0, 0, 458, 374);
    }// </editor-fold>//GEN-END:initComponents

    private void idsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsubmitActionPerformed
        // TODO add your handling code here:
        // deklarasi variabel
        String nm,abs,jur,almt;
        String kelas = combo.getSelectedItem().toString();
        nm = idnama.getText();
        abs = idabsen.getText();
        almt = idalamat.getText();
        //jurusan
        if(rdbRPL.isSelected()){
            jur = "RPL";
            if(combo.getSelectedItem()=="X RPL 1"){
            }
            if(combo.getSelectedItem()=="X RPL 2"){
        }
            if(combo.getSelectedItem()=="X RPL 3"){
            }
            if (combo.getSelectedItem()=="X RPL 4"){
            }
        }else if(rdbTKJ.isSelected()){
            jur = "TKJ";
                jur = "RPL";
            if(combo.getSelectedItem()=="X TKJ 1"){
            }
            if(combo.getSelectedItem()=="X TKJ 2"){
            }
            if(combo.getSelectedItem()=="X TKJ 3"){
            }
            if (combo.getSelectedItem()=="X TKJ 4"){
            }
            }else jur = "";
        
        new latihan5(nm,abs,jur,almt,kelas).setVisible(true);
    
        
            
        
    }//GEN-LAST:event_idsubmitActionPerformed

    private void idexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idexitActionPerformed
        // TODO add your handling code here:
         dispose();
        //System.exit(1);
    }//GEN-LAST:event_idexitActionPerformed

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
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField idabsen;
    private javax.swing.JTextField idalamat;
    private javax.swing.JButton idexit;
    private javax.swing.JTextField idnama;
    private javax.swing.JButton idsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdbRPL;
    private javax.swing.JRadioButton rdbTKJ;
    // End of variables declaration//GEN-END:variables
}
