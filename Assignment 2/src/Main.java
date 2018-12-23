/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author mide_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MakeFile mf = new MakeFile();

        //Create file name and write it to .txt file.
        String fileName = "PatientsFile.txt";
        mf.writeFile(fileName);

        //runs the GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI gui = new GUI();
                JFrame frame = new JFrame("Medical Imaging Files Of Patients");

                //put frame on center of the screen
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int height = screenSize.height;
                int width = screenSize.width;
                frame.setSize(width/2, height/2);
                //set frame center
                frame.setLocationRelativeTo(null);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(gui);
                frame.setSize(400, 600);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}