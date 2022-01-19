package TVDownload;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class JTVDownload implements ActionListener, ItemListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;
    ArrayList<TVShow> tvShowList;
    JComboBox comboBox;
    JButton button;

    public JTVDownload() {
        frame = new JFrame();
        frame.setTitle("JTVDownload");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new FlowLayout());

        tvShowList = new ArrayList<>();
        String[] titles = new String[] {
                "Family Guy",
                "The Simpsons",
                "Squid Game",
                "Spongebob Squarepants",
                "Friends"
        };
        String[] synopsises = new String[] {
                "In a wacky Rhode Island town, a dysfunctional family strive to cope with everyday life as they are thrown from one crazy scenario to another. Sick, twisted and politically incorrect, the animated series features the adventures of the Griffin family. ... Meet the Griffins, a family of 6 living in Rhode Island.",
                "Animated primetime series that follows the exploits of a hapless and semi-dysfunctional nuclear family named the Simpsons, who live in the fictional town of Springfield, whose various inhabitants add to the comedy, angst, satire, and parody of this series. The Simpsons are a dysfunctional family living in Springfield.",
                "The series revolves around Seong Gi-hun, a divorced and indebted chauffeur, who is invited to play a series of children's games for a chance earning a large cash prize. When he accepts the offer, he is taken to an unknown location where he finds himself among 455 other players who are also deeply in debt.",
                "In this lively animated adventure, undersea oddball SpongeBob SquarePants and his starfish friend, Patrick, embark on a quest to clear the name of Mr. Krabs, the owner of the Krusty Krab restaurant, who has been framed for stealing the crown of ocean deity King Neptune. Leaving the familiar confines of Bikini Bottom, SpongeBob and Patrick venture out towards Shell City, where they hope to find Neptune's crown, but numerous obstacles stand (or float) in their way.",
                "Friends is a 90's Comedy TV show, based in Manhattan, about 6 friends who go through just about every life experience imaginable together; love, marriage, divorce, children, heartbreaks, fights, new jobs and job losses and all sorts of drama."
        };

        for(int i = 0; i < titles.length; ++i)
        {
            tvShowList.add(new TVShow(titles[i], synopsises[i]));
        }

        comboBox = new JComboBox(titles);
        comboBox.addItemListener(this);
        frame.add(comboBox);

        button = new JButton("Watch");
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            JOptionPane.showMessageDialog(null, "Watching " + comboBox.getSelectedItem());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String title = (String)e.getItem();
        for(TVShow show: tvShowList)
        {
            if(show.GetName().equals(title))
            {
                JOptionPane.showMessageDialog(null, show.GetSynopsis());
                break;
            }
        }
    }

    public static void main(String[] args) {
        JTVDownload instance = new JTVDownload();
    }
}