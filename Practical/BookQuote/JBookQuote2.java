package BookQuote;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    public JButton button;
    public JLabel title;
    public JLabel quote;

    public JBookQuote2()
    {
        frame = new JFrame();
        frame.setTitle("JBookQuote2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new FlowLayout());

        button = new JButton("Button");
        button.addActionListener(this);
        frame.add(button);

        title = new JLabel("Thinking Fast And Slow");
        title.setVisible(false);
        frame.add(title);

        quote = new JLabel("Not sure what the quote is");
        quote.setVisible(false);
        frame.add(quote);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            title.setVisible(true);
            quote.setVisible(true);
        }
    }

    public static void main(String[] args) {
        JBookQuote2 instance = new JBookQuote2();
    }
}