package FrameDisableButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;
    public JButton button;

    public JFrameDisableButton() {
        frame = new JFrame();
        frame.setTitle("JFrameDisableButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        button = new JButton("Button");
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton instance = new JFrameDisableButton();
    }
}