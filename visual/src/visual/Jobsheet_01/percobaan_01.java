/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual.Jobsheet_01;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

/**
 *
 * @author erdia
 */
public class percobaan_01 extends Frame {

    private static final long serialVersionUID = 1L;

    public percobaan_01() {
        setSize(400, 300);
        setTitle("First Frame");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
//        new percobaan_01();
    }

}
