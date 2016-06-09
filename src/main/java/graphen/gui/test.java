package graphen.gui;

import graphen.Utils;

import javax.swing.*;

/**
 * Created by By_if1_08 on 08.06.2016.
 */
public class test extends JFrame{
    private JPanel mainPanel;
    private JEditorPane editorPane1;
    private JPanel testPanel;
    private JLabel imageLabel;

    private ImageIcon testIcon;

    public test()
    {
        super("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);

        System.out.println(testIcon.getIconWidth() + ", " + testIcon.getIconHeight());


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLabel =new JLabel();
        testIcon = new ImageIcon(Utils.getResourceURL("img/test.png"));
        imageLabel.setIcon(testIcon);
    }
}
