
package practicapresencial_201709166;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jacky.bean.CuentaHabiente;

public class RegistroGrafico extends javax.swing.JFrame {
   public static int numero=10;
    public static void NumRandom() {

        numero = (int) (Math.random() * 411111) + 1;
        System.out.println("random" + numero);
    }
    public RegistroGrafico() {
        initComponents();
        setLocation(310, 125);
        setResizable(false);
        setTitle("Registro");
        NumRandom();
        TxtNumCuenta.setText(""+numero);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    public int k;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtApe = new javax.swing.JTextField();
        TxtFecha = new javax.swing.JTextField();
        TxtDPI = new javax.swing.JTextField();
        TxtProcedencia = new javax.swing.JTextField();
        TxtMonto = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtContra11 = new javax.swing.JTextField();
        TxtNumCuenta = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        BtnLogin = new javax.swing.JButton();
        TxtContra1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtNumCuenta11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registro Cuenta Habientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        jLabel4.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        jLabel5.setText("DPI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, -1));

        jLabel6.setText("Lugar de Procedencia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel7.setText("Monto Inicial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));

        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, -1, -1));

        jLabel10.setText("Número de Cuenta");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));
        getContentPane().add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 51, 137, -1));
        getContentPane().add(TxtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 83, 137, -1));
        getContentPane().add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 116, 137, -1));
        getContentPane().add(TxtDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 154, 137, -1));
        getContentPane().add(TxtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 137, -1));
        getContentPane().add(TxtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 211, 137, -1));
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 237, 137, -1));
        getContentPane().add(TxtContra11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 137, -1));
        getContentPane().add(TxtNumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 296, 137, -1));

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        BtnLogin.setText("Iniciar Sesión");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));
        getContentPane().add(TxtContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 264, 137, -1));

        jLabel11.setText("Número de Cuenta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel12.setText("Contraseña");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        TxtNumCuenta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumCuenta11ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNumCuenta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 137, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        
        llenarCuentaHabiente();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
llenarCuentaHabiente(); 
        for (int i = 0; i < PracticaPresencial_201709166.getListaCuentaHabiente().length; i++) {
    if (PracticaPresencial_201709166.getListaCuentaHabiente()[i]!=null) {
        if (TxtContra11.getText().equalsIgnoreCase(PracticaPresencial_201709166.getListaCuentaHabiente()[i].getContraseña())&&
                TxtNumCuenta11.getText().equals(TxtNumCuenta.getText())) {
               JOptionPane.showMessageDialog(null, "BIENVENIDO " + PracticaPresencial_201709166.getListaCuentaHabiente()[0].getNombre()+" "+ PracticaPresencial_201709166.getListaCuentaHabiente()[0].getApellido());
                dispose();
                    RetirosTransfe usuarioadmin=new RetirosTransfe();
                    usuarioadmin.setVisible(true);
                    usuarioadmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;
        }
    }else{
                
                   JOptionPane.showMessageDialog(null, "NO HAY NADIE REGHISTRADI " );

    }
}
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void TxtNumCuenta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumCuenta11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumCuenta11ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGrafico().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JTextField TxtApe;
    private javax.swing.JTextField TxtContra1;
    private javax.swing.JTextField TxtContra11;
    private javax.swing.JTextField TxtDPI;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtMonto;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtNumCuenta;
    private javax.swing.JTextField TxtNumCuenta11;
    private javax.swing.JTextField TxtProcedencia;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
// JTextField TxtNumCuenta = new JTextField(""+numero);
 public void llenarCuentaHabiente() {
        int posicion = BuscarVacio();
        if (posicion > -1) {
            PracticaPresencial_201709166.listaCuentaHabiente[posicion] = new CuentaHabiente(TxtName.getText(),TxtApe.getText(), TxtFecha.getText(), Integer.valueOf(TxtDPI.getText()),TxtProcedencia.getText(),Integer.valueOf(TxtMonto.getText()),Integer.valueOf(TxtTelefono.getText()),TxtContra11.getText(),Integer.valueOf(TxtNumCuenta.getText()), false);
               JOptionPane.showMessageDialog(null, "Registrado " + PracticaPresencial_201709166.getListaCuentaHabiente()[0].getNombre()+" Numero de Cuenta "+ PracticaPresencial_201709166.getListaCuentaHabiente()[0].getNumero()+" Contraseña "+PracticaPresencial_201709166.getListaCuentaHabiente()[0].getContraseña());

        } else {
            JOptionPane.showInputDialog("YUa no exiten psicion");
        }
//Proyecto1_201709166.listaRemesas[e]=new Remesas(numero,Integer.valueOf(TxtIDRemitente.getText()),Integer.valueOf(TxtIDBeneficiario.getText()),TxtPais.getText(),TxtFecha.getText(),TxtHora.getText(),Integer.valueOf(TxtMonto.getText()));

        //solo para comprabar que si se guardo
        System.out.println("lista" + PracticaPresencial_201709166.getListaCuentaHabiente()[0].getMonto());
        System.out.println("lista" + PracticaPresencial_201709166.getListaCuentaHabiente()[0].getNombre());
        System.out.println("lista" + PracticaPresencial_201709166.getListaCuentaHabiente()[1].getNombre());

    }
 
 public int BuscarVacio() {
        int resp = -1;
        for (int i = 0; i < PracticaPresencial_201709166.listaCuentaHabiente.length; i++) {
            if (PracticaPresencial_201709166.listaCuentaHabiente[i].vacio == true) {
                resp = i;
                break;
            }
        }
        return resp;
    }


}
