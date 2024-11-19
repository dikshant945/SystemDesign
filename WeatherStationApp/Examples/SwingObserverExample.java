package WeatherStationApp.Examples;

import javax.security.auth.login.AccountLockedException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go2();
    }

    private void go() {
        jFrame = new JFrame();
        JButton button =new JButton("Should i do it??");

        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListner());
    }

    static class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it is wrong !");
        }
    }

     static class DevilListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Yes Do it");
        }
    }

    private void go2() {
        jFrame = new JFrame();
        JButton button =new JButton("Should i do it??");

        button.addActionListener(event -> System.out.println("Don't do it is wrong "));
        button.addActionListener(event -> System.out.println("Yes Do it"));
    }
}
