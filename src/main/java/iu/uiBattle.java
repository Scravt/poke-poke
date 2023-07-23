package iu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uiBattle extends JFrame {

    private JButton ataque1;
    private JButton ataque3;
    private JButton ataque2;
    private JButton ataque4;
    private JProgressBar barravidaPoke2;
    private JProgressBar barraVidaPoke1;
    private JLabel numeroVidaPoke2;
    private JPanel Poke2;
    private JPanel Poke1;
    private JLabel numeroVidaPoke1;
    private JPanel bg;
    private JButton retirada;
    private JTextArea history;
    private JLabel imgPoke2;
    private JLabel imgPoke1;

    public uiBattle() {
        ataque1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ataque1");

            }
        });
        ataque2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ataque2");

            }
        });
        ataque3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ataque3");

            }
        });
        ataque4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ataque4");

            }
        });
        retirada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("se retiro");

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
