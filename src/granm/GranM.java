/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.UIManager;
import ventanas.*;

/**
 *
 * @author brutalchrist
 */
public class GranM {
    //agregar otra ,ifjdsf
    public static boolean splash = false;
    public static SplashScreen loadingScreen;
    public static Rectangle2D.Double loadingTextArea;
    public static Rectangle2D.Double loadingProgressArea;
    public static Graphics2D loadingGraphics;
    public static Font myfont;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            //Just print stacktrace here since it's an example.
            ex.printStackTrace();
        }

        loadingMethod();
        mainMethod();

        if (loadingScreen != null) {
            loadingScreen.close();
        }
    }

    public static void loadingMethod() {
        loadingScreen = SplashScreen.getSplashScreen();
        if (loadingScreen != null) {
            Dimension dim = loadingScreen.getSize();
            int ht = dim.height;
            int wd = dim.width;
            
            loadingTextArea = new Rectangle2D.Double(325, ht * 0.7, wd * 0.4, 30);
            loadingProgressArea = new Rectangle2D.Double(325, ht*0.62, 430, 25);
            
            // create the Graphics environment for drawing status info
            loadingGraphics = loadingScreen.createGraphics();
            myfont = new Font("Times New Roman", Font.BOLD, 18);
            loadingGraphics.setFont(myfont);


        }
    }

    public static void loadingText(String string) {
        if (loadingScreen != null) {
            loadingGraphics.setPaint(Color.WHITE); 
            loadingGraphics.drawString(string, (int) loadingTextArea.getX(), (int) loadingTextArea.getY() + 20);

            loadingScreen.update();
        }
    }

    public static void loadingProgress(int prog) {
        if (loadingScreen != null) {
            //Color for the background of progressArea
            loadingGraphics.setPaint(new Color(0, 0, 0, 0));
            loadingGraphics.fill(loadingProgressArea);
            //Color for the border of progressArea
            loadingGraphics.setPaint(Color.WHITE);
            loadingGraphics.draw(loadingProgressArea);

            int x = (int) loadingProgressArea.getMinX();
            int y = (int) loadingProgressArea.getMinY();

            int width = (int) loadingProgressArea.getWidth();
            int height = (int) loadingProgressArea.getHeight();
            
            loadingGraphics.setPaint(new GradientPaint(325, 0, new Color(0, 2, 76), width+325, 0, new Color(58, 174, 249)));
            loadingGraphics.fillRect(x+4, y+4, prog-8, height-6);

            loadingScreen.update();
        }
    }

    public static void mainMethod() {
        if(splash){
            for (int i = 1; i <= 430; i=i+8) {
                loadingText("Cargando interfaz");
                loadingProgress(i);
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal p = new principal();
                p.setVisible(true);
                p.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
}