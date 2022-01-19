package FrameDisableButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;
    public JButton button;
    public int count;
    public JLabel stopLabel;

    public JFrameDisableButton2() {
        frame = new JFrame();
        frame.setTitle("JFrameDisableButton2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new FlowLayout());

        button = new JButton("Button");
        button.addActionListener(this);
        frame.add(button);
        count = 0;

        stopLabel = new JLabel("That's enough!");
        stopLabel.setVisible(false);
        frame.add(stopLabel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            ++count;
            {
                if(count == 8)
                {
                    stopLabel.setVisible(true);
                    button.setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton2 instance = new JFrameDisableButton2();
    }
}