/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import static ventanas.principal.FOString;

/**
 *
 * @author brutalchrist
 */
public class nuevo extends javax.swing.JFrame {
    private int contX = 1;
    private boolean operadorFlag = false;
    public boolean completo = false;
    public String FOString = new String();
    public ArrayList<Double> FODouble = new ArrayList<Double>();
    public ArrayList<Double[]> RestriccionesDouble = new ArrayList<Double[]>();
    
    nuevaRestriccion n;
    /**
     * Creates new form inicio
     */
    public nuevo() {
        initComponents();
        nuevaRestriccion.setEnabled(false);
        FO.getInputMap().put(KeyStroke.getKeyStroke("BACK_SPACE"), "none");
        FO.requestFocus();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public boolean isComplete(){
        return completo;
    }
    
    public boolean isMax(){
        boolean enviar = false;
        if(maximizarRadio.isSelected())
            enviar = true;
        return enviar;
    }
    
    public String getFOString(){
        return FO.getText().toString();
    }
    
    public Double[] getFoDouble(){
        Double [] enviar = FODouble.toArray(new Double[FODouble.size()]);
        
        return enviar;
    }
    
    public ArrayList<Double> getFOList(){
        return FODouble;
    }
    
    public int getNumVariables(){
        return contX-1;
    }
    
    public String[] getRestricciones(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRestricciones.getModel();
        String[] enviar = new String[modelo.getRowCount()];
        
        
        for (int i = 0 ; i < modelo.getRowCount() ; i++){
            enviar[i] = modelo.getValueAt(i, 0).toString();
        }
        
        return enviar;
    }
    
    public ArrayList<Double[]> getRestriccionesDouble(){
        return RestriccionesDouble;
    }
    
    public String[] getOperadores(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRestricciones.getModel();
        String[] enviar = new String[modelo.getRowCount()];
        
        for(int i=0; i<modelo.getRowCount(); i++)
            enviar[i] = modelo.getValueAt(i, 1).toString();
        
        return enviar;
    }
    
    public String[] getLds(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRestricciones.getModel();
        String[] enviar = new String[modelo.getRowCount()];
        
        
        for(int i=0; i<modelo.getRowCount(); i++)
            enviar[i] = modelo.getValueAt(i, 2).toString();
        
        return enviar;
    }
    
    public Double[] getLdsDouble(){
        DefaultTableModel modelo = (DefaultTableModel) tablaRestricciones.getModel();
        Double[] enviar = new Double[modelo.getRowCount()];
        
        
        for(int i=0; i<modelo.getRowCount(); i++)
            enviar[i] = Double.parseDouble(modelo.getValueAt(i, 2).toString());
        
        return enviar;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nVariables = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRestricciones = new javax.swing.JTable();
        nuevaRestriccion = new javax.swing.JButton();
        xi = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        maximizarRadio = new javax.swing.JRadioButton();
        minimizarRadio = new javax.swing.JRadioButton();

        setTitle("Nuevo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        FO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FOKeyTyped(evt);
            }
        });

        jLabel1.setText("FO:");

        nVariables.setEditable(false);
        nVariables.setText("0");
        nVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVariablesActionPerformed(evt);
            }
        });

        jLabel3.setText("N° V");

        tablaRestricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restriccion", "Operador", "LD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRestricciones);

        nuevaRestriccion.setText("+");
        nuevaRestriccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaRestriccionActionPerformed(evt);
            }
        });

        xi.setText("X1");
        xi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xiActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        aceptar.setText("Comenzar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        buttonGroup1.add(maximizarRadio);
        maximizarRadio.setText("Maximizar");

        buttonGroup1.add(minimizarRadio);
        minimizarRadio.setSelected(true);
        minimizarRadio.setText("Minimizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maximizarRadio)
                        .addGap(18, 18, 18)
                        .addComponent(minimizarRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(borrar))
                            .addComponent(nVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevaRestriccion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximizarRadio)
                    .addComponent(minimizarRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xi)
                    .addComponent(borrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaRestriccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FOKeyTyped
        if(!operadorFlag){
            if(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.'){ 
                FOString = FOString+evt.getKeyChar();
            }
            else{
                evt.consume();
            }
            operadorFlag = false;
        }
        else{
            if(evt.getKeyChar() == '+' || evt.getKeyChar() == '-'){ 
                operadorFlag = false;
                FOString = FOString+evt.getKeyChar();
            }
            else{
                evt.consume();
            }
        }
    }//GEN-LAST:event_FOKeyTyped

    private void nuevaRestriccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaRestriccionActionPerformed
        n = new nuevaRestriccion(contX-1);
        n.setVisible(true);
    }//GEN-LAST:event_nuevaRestriccionActionPerformed

    private void nVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVariablesActionPerformed

    private void xiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xiActionPerformed
        if(!operadorFlag){
            FODouble.add(Double.parseDouble(FOString));
            FOString = "";
            FO.setText(FO.getText()+"x"+contX);
            contX++;
            xi.setText("X"+contX);
            operadorFlag = true;
            nVariables.setText(String.valueOf(contX-1));
        }
        nuevaRestriccion.setEnabled(true);
        FO.requestFocus();
    }//GEN-LAST:event_xiActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        FODouble.clear();
        FOString = "";
        FO.setText("");
        contX=1;
        operadorFlag = false;
        xi.setText("X"+contX);
        nVariables.setText(String.valueOf(contX-1));
        nuevaRestriccion.setEnabled(false);
        FO.requestFocus();
    }//GEN-LAST:event_borrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(n != null){
            if(n.isComplete()){
                String rest = "";
                DefaultTableModel modelo = new DefaultTableModel();
                
                FO.setEnabled(false);
                xi.setEnabled(false);
                borrar.setEnabled(false);
                
                modelo = (DefaultTableModel) tablaRestricciones.getModel();
                
                for(int i=0; i<n.getRestriccion().length; i++){
                    if(i == 0){
                        rest = n.getRestriccion()[i] + "x" + (i+1);
                    }
                    else{
                        if(n.getRestriccion()[i] >= 0){
                            rest = rest + "+" + n.getRestriccion()[i] + "x" + (i+1);
                        }
                        else{
                            rest = rest + n.getRestriccion()[i] + "x" + (i+1);
                        }
                    }
                }
                
                String[] fila = {rest, n.getOperadorString(), String.valueOf(n.getLd())};
                modelo.addRow(fila);
                
                RestriccionesDouble.add(n.getRestriccion());
                
                tablaRestricciones.setModel(modelo);
            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        completo = true;
        this.setVisible(false);
    }//GEN-LAST:event_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FO;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton borrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maximizarRadio;
    private javax.swing.JRadioButton minimizarRadio;
    private javax.swing.JTextField nVariables;
    private javax.swing.JButton nuevaRestriccion;
    private javax.swing.JTable tablaRestricciones;
    private javax.swing.JButton xi;
    // End of variables declaration//GEN-END:variables
}
