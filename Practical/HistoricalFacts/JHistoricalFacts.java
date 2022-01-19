package HistoricalFacts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    public JButton button;

    public String[] historicalFacts;
    public JLabel[] labels;
    int currentIndex;

    public JHistoricalFacts() {
        frame = new JFrame();
        frame.setTitle("JHistoricalFacts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new GridLayout(6, 1));

        button = new JButton("Button");
        button.addActionListener(this);
        frame.add(button);

        historicalFacts = new String[] {
                "During World War II, a Great Dane named Juliana was awarded the Blue Cross Medal. She extinguished an incendiary bomb by peeing on it!",
                "Alexander the Great was accidentally buried alive. Scientists believe Alexander suffered from a neurological disorder called Guillain-Barré Syndrome. They believe that when he died he was actually just paralyzed and mentally aware!",
                "There were female Gladiators in Ancient Rome! A female gladiator was called a Gladiatrix, or Gladiatrices. They were extremely rare, unlike their male counterparts.",
                "The world’s most successful pirate in history was a lady named Ching Shih. She was a prostitute in China until the Commander of the Red Flag Fleet bought and married her. But, her husband considered her his equal and she became an active pirate commander in the fleet.",
                "You may know them as the bunch of heroes that broke box office records with their movies. But, The Avengers was also a group of Jewish assassins who hunted Nazi war criminals after World War II. They poisoned 2,283 German prisoners of war!",
                "From 1912 to 1948, the Olympic Games held competitions in the fine arts. Medals were given for literature, architecture, sculpture, painting, and music. Obviously, the art created was required to be Olympic-themed.",
                "Famous conqueror, Napoleon Bonaparte, was once attacked by a horde of bunnies! He had requested that a rabbit hunt be arranged for himself and his men. When the rabbits were released from their cages, the bunnies charged toward Bonaparte and his men in an unstoppable onslaught.",
                "Cleopatra wasn’t actually Egyptian! As far as historians can tell, Egypt’s famous femme fatal was actually Greek!. She was a descendant of Alexander the Great’s Macedonian general Ptolemy.",
                "Ketchup was sold in the 1830s as medicine. In 1834, it was sold as a cure for an upset stomach by an Ohio physician named John Cook. It wasn’t popularized as a condiment until the late 19th century!",
                "Did you know Abraham Lincoln is in the wrestling hall of fame? The 6’4″ president had only one loss among his around 300 contests. He earned a reputation for this in New Salem, Illinois, as an elite fighter."
        };

        labels = new JLabel[5];
        for(int i = 0; i < labels.length; ++i)
        {
            labels[i] = new JLabel(historicalFacts[i]);
            frame.add(labels[i]);
        }
        currentIndex = 0;

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            ChangeFact();
        }
    }

    private void ChangeFact()
    {
        currentIndex = (currentIndex + 1) % historicalFacts.length;
        for(int i = 0; i < labels.length; ++i)
        {
            labels[i].setText(historicalFacts[(currentIndex + i) % historicalFacts.length]);
        }
    }

    public static void main(String[] args) {
        JHistoricalFacts instance = new JHistoricalFacts();
    }

}