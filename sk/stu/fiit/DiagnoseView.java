/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

/**
 *
 * @author Admin
 */
public final class DiagnoseView extends javax.swing.JFrame {
    
    private final DiagnoseController controller = new DiagnoseController();

    /**
     * Creates new form DiagnoseView
     */
    public DiagnoseView() {
        initComponents();
        displayDiagnose();
    }
    
    public void displayDiagnose(){
        osTF.setText(controller.getOS());
        userTF.setText(controller.getUser());
        javaTF.setText(controller.getJavaVersion());
        userDirTA.setText(controller.getDir());
        userDirSizeTF.setText(controller.getDirSize());
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
        jLabel1 = new javax.swing.JLabel();
        javaTF = new javax.swing.JTextField();
        osTF = new javax.swing.JTextField();
        userTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        completeMemTF = new javax.swing.JTextField();
        userDirSizeTF = new javax.swing.JTextField();
        freeMemTF = new javax.swing.JTextField();
        memTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userDirTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Meno, verzia a architektúra OS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 30));

        javaTF.setEditable(false);
        jPanel1.add(javaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 390, -1));

        osTF.setEditable(false);
        jPanel1.add(osTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 390, -1));

        userTF.setEditable(false);
        jPanel1.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 390, -1));

        jLabel2.setText("Verzia Javy");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 30));

        jLabel3.setText("Meno používateľa");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 30));

        jLabel4.setText("Názov používateľského adresára");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, 30));

        jLabel5.setText("Veľkosť používateľského adresára");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 30));

        jLabel6.setText("Voľná pamäť v JVM pre-alloc");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 30));

        jLabel7.setText("Celková dostupná pamäť pre JVM");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, 30));

        jLabel8.setText("Dostupná pamäť pre JVM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 30));

        completeMemTF.setEditable(false);
        jPanel1.add(completeMemTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 390, -1));

        userDirSizeTF.setEditable(false);
        jPanel1.add(userDirSizeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 390, -1));

        freeMemTF.setEditable(false);
        jPanel1.add(freeMemTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 390, -1));

        memTF.setEditable(false);
        jPanel1.add(memTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 390, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("JAVA Diagnoser");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 16, 520, 60));

        userDirTA.setColumns(20);
        userDirTA.setRows(5);
        jScrollPane1.setViewportView(userDirTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 390, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DiagnoseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnoseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnoseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnoseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnoseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField completeMemTF;
    private javax.swing.JTextField freeMemTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField javaTF;
    private javax.swing.JTextField memTF;
    private javax.swing.JTextField osTF;
    private javax.swing.JTextField userDirSizeTF;
    private javax.swing.JTextArea userDirTA;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
