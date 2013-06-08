/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granm;
import javax.swing.JFrame;
import javax.swing.UIManager;
import ventanas.*;

/**
 *
 * @author brutalchrist
 */
public class GranM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            //Just print stacktrace here since it's an example.
            ex.printStackTrace();
        }
        principal p = new principal();
        p.setVisible(true);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
