package BookQuote;

import javax.swing.*;
import java.awt.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JBookQuote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("First quote of the book");
        JLabel label2 = new JLabel("Second quote of the book");

        frame.add(label);
        frame.add(label2);

    }
}