/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 07-06-2013, 09:53:55 AM
 */
package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author TCA_LC417_PC01
 */
public class principal extends javax.swing.JFrame {

    public static nuevo n;
    public static boolean primeroFlag = true;
    public static int numVar = 0;
    public static int numColumnas = 0;
    public static String FOString = null;
    public static String[] restriccionesString = null;
    public static String[] operadores = null;
    public static String[] ldString = null;
    public static Double[] FODouble = null;
    public static Double[] ldDouble = null;
    public static Double[] ldDoubleM = null;
    public static Double M = 1000000000.0; //¿No será mucho?
    public static ArrayList<Double[]> restriccionesDouble = new ArrayList<Double[]>();
    public static ArrayList<Double[]> restriccionesDoubleM = new ArrayList<Double[]>();
    public static ArrayList<Double> FOList = new ArrayList<Double>();
    public static ArrayList<Integer> Ss = new ArrayList<Integer>();
    public static ArrayList<Integer> As = new ArrayList<Integer>();
    public static ArrayList<Integer> es = new ArrayList<Integer>();
    public static Double[][] matriz = null;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        pbProgreso = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelMatris = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Awesome Business Software");
        setPreferredSize(new java.awt.Dimension(1000, 580));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(pbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        panelMatris.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelMatrisLayout = new javax.swing.GroupLayout(panelMatris);
        panelMatris.setLayout(panelMatrisLayout);
        panelMatrisLayout.setHorizontalGroup(
            panelMatrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        panelMatrisLayout.setVerticalGroup(
            panelMatrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelMatris);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.setEnabled(false);

        btnSiguiente.setText("Siguiente paso");
        btnSiguiente.setEnabled(false);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    abrirNuevo();
}//GEN-LAST:event_jButton1ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    abrirNuevo();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (n != null && primeroFlag) {
            if (n.isComplete()) {
                FOString = n.getFOString();
                FODouble = n.getFoDouble();
                FOList = n.getFOList();
                numVar = n.getNumVariables();
                restriccionesString = n.getRestricciones();
                restriccionesDouble = n.getRestriccionesDouble();
                operadores = n.getOperadores();
                ldString = n.getLds();
                ldDouble = n.getLdsDouble();
                ldDoubleM = n.getLdsDouble();

                primeroFlag = false;

                igualarRestricciones();
                FOporM();
                restriccionesPorM();
                generarNuevaFO();
                cargarMatriz();

                new Thread(new hilo()).start();
                //JOptionPane.showMessageDialog(this, m);
            }
        }
    }//GEN-LAST:event_formWindowGainedFocus

    public void igualarRestricciones() {
        for (int i = 0; i < operadores.length; i++) {
            switch (operadores[i]) {
                case "≤":
                    restriccionesString[i] = restriccionesString[i] + "+S" + (i + 1);
                    Ss.add(i + 1);
                    if (numColumnas < (numVar + 1)) {
                        numColumnas = (numVar + 1);
                    }
                    break;
                case "≥":
                    restriccionesString[i] = restriccionesString[i] + "-e" + (i + 1) + "+A" + (i + 1);
                    es.add(i + 1);
                    As.add(i + 1);
                    if (numColumnas < (numVar + 2)) {
                        numColumnas = (numVar + 2);
                    }
                    break;
                case "=":
                    restriccionesString[i] = restriccionesString[i] + "+A" + (i + 1);
                    As.add(i + 1);
                    if (numColumnas < (numVar + 1)) {
                        numColumnas = (numVar + 1);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void FOporM() {
        Iterator iter = As.iterator();
        while (iter.hasNext()) {
            FOString = FOString + "+MA" + iter.next();
            if (n.isMax()) {
                FOList.add(-M);
            } else {
                FOList.add(M);
            }
        }

        /*
         *TODO: Despejar Z dependiendo si es min o max 
         */

    }

    public void restriccionesPorM() {
        String nuevo;
        int aux;

        Iterator iter = As.iterator();
        while (iter.hasNext()) {
            nuevo = "";
            aux = Integer.valueOf(iter.next().toString()) - 1;

            for (int i = 0; i < restriccionesString[aux].length(); i++) {
                if (restriccionesString[aux].charAt(i) == 'x' || restriccionesString[aux].charAt(i) == 'A'
                        || restriccionesString[aux].charAt(i) == 'e') {
                    nuevo = nuevo + "M" + restriccionesString[aux].charAt(i);
                } else {
                    nuevo = nuevo + restriccionesString[aux].charAt(i);
                }
            }
            //Multiplica restricion por M
            Double[] o = restriccionesDouble.get(aux);
            for (int i = 0; i < o.length; i++) {
                o[i] = o[i] * M;
            }

            restriccionesDouble.set(aux, o);
            //Multiplica ld por M
            ldDoubleM[aux] = ldDoubleM[aux] * M;

            restriccionesString[aux] = nuevo;
            ldString[aux] = ldString[aux] + "M";
        }
    }

    public void generarNuevaFO() {
        Double[] nuevoFO = new Double[FODouble.length + 1];
        Double nuevoLd = 0.0;
        Double sumA = 0.0;

        //Valor de Z, cambiar después
        nuevoFO[0] = 1.0;

        for (int i = 0; i < FODouble.length; i++) {
            Iterator iter = As.iterator();
            while (iter.hasNext()) {
                int indice = Integer.valueOf(iter.next().toString()) - 1;

                sumA = sumA + restriccionesDouble.get(indice)[i];
            }
            nuevoFO[i + 1] = FODouble[i] + sumA;
            sumA = 0.0;
        }

        Iterator iter2 = As.iterator();
        while (iter2.hasNext()) {
            nuevoLd = nuevoLd + ldDoubleM[Integer.valueOf(iter2.next().toString()) - 1];
        }

        //se agrega Z a la matriz LD
        matriz = new Double[restriccionesString.length + 1][getNumColumnas() - 3];

        for (int i = 0; i < (restriccionesString.length + 1); i++) {
            for (int j = 0; j < (getNumColumnas() - 3); j++) {
                matriz[i][j] = 0.0;
            }
        }

        for (int i = 0; i < nuevoFO.length - 1; i++) {
            matriz[0][i] = nuevoFO[i + 1];
        }

        matriz[0][getNumColumnas() - 4] = nuevoLd;

        //dejamos las restriciones sin M
        Iterator iter = As.iterator();
        while (iter.hasNext()) {
            int aux = Integer.valueOf(iter.next().toString()) - 1;
            Double[] o = restriccionesDouble.get(aux);
            for (int i = 0; i < o.length; i++) {
                o[i] = o[i] / M;
            }

            restriccionesDouble.set(aux, o);
        }
    }

    public void cargarMatriz() {
        int contR = 1;
        int iaux = 0;

        //carga Xi y ld
        for (Double[] r : restriccionesDouble) {
            for (int i = 0; i < r.length; i++) {
                matriz[contR][i] = r[i];
                iaux = i;
            }
            //ld
            matriz[contR][getNumColumnas() - 4] = ldDouble[contR - 1];
            contR++;
        }

        //carga Ai
        Iterator iter = As.iterator();
        while (iter.hasNext()) {
            int a = Integer.parseInt(iter.next().toString());
            matriz[a][iaux + a] = 1.0;
        }

        mostrarMatriz();
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < restriccionesString.length + 1; i++) {
            for (int j = 0; j < getNumColumnas() - 3; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public static class hilo implements Runnable {

        public void run() {
            cargarTabla();
        }

        public static void cargarTabla() {
            int numFilas = restriccionesString.length + 2;
            int numCols = getNumColumnas();
            int contLabel = 0;

            pbProgreso.setValue(0);
            pbProgreso.setStringPainted(true);

            JLabel[] label = new JLabel[numCols];

            for (int i = 0; i < numCols; i++) {
                label[i] = new JLabel("");
                label[i].setFont(new Font("", Font.BOLD, 14));
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);
            panelMatris.setLayout(new GridLayout(numFilas, numCols));

            label[0].setText("R");
            contLabel++;
            panelMatris.add(label[0]);
            label[1].setText("V");
            contLabel++;
            panelMatris.add(label[1]);
            label[2].setText("Z");
            contLabel++;
            panelMatris.add(label[2]);
            pbProgreso.setValue(pbProgreso.getValue() + 10);
            pbProgreso.repaint();
            for (int i = 0; i < numVar; i++) {
                label[i + 3].setText("X" + (i + 1));
                panelMatris.add(label[i + 3]);
                contLabel++;
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);

            Iterator iter = As.iterator();
            while (iter.hasNext()) {
                label[contLabel].setText("A" + iter.next());
                panelMatris.add(label[contLabel]);
                contLabel++;
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);

            iter = es.iterator();
            while (iter.hasNext()) {
                label[contLabel].setText("e" + iter.next());
                panelMatris.add(label[contLabel]);
                contLabel++;
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);

            iter = Ss.iterator();
            while (iter.hasNext()) {
                label[contLabel].setText("S" + iter.next());
                panelMatris.add(label[contLabel]);
                contLabel++;
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);

            label[contLabel].setText("LD");
            panelMatris.add(label[contLabel]);


            for (int i = 0; i < (numFilas - 1); i++) {
                for (int k = 3; k < numCols; k++) {
                    panelMatris.add(new JTextArea(String.valueOf(matriz[i][k-3])));
                }
            }
            pbProgreso.setValue(pbProgreso.getValue() + 10);

            panelMatris.updateUI();

            //System.out.println("numCols: " + numCols);
            //System.out.println("numFilas: " + numFilas);
        }
    }

    public static int getNumColumnas() {
        int enviar = 0;

        Iterator iter = As.iterator();
        while (iter.hasNext()) {
            iter.next();
            enviar++;
        }

        iter = es.iterator();
        while (iter.hasNext()) {
            iter.next();
            enviar++;
        }

        iter = Ss.iterator();
        while (iter.hasNext()) {
            iter.next();
            enviar++;
        }
        enviar = enviar + numVar;

        //R, V, Z, ld
        enviar = enviar + 4;

        return enviar;
    }

    public void abrirNuevo() {
        primeroFlag = true;
        n = new nuevo();
        n.setVisible(true);
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel panelMatris;
    public static javax.swing.JProgressBar pbProgreso;
    // End of variables declaration//GEN-END:variables
}
