package graphen.gui;

import graphen.Graph;
import graphen.GraphNode;
import graphen.Utils;

import javax.swing.*;

/**
 * Created by By_if1_08 on 08.06.2016.
 */
public class test extends JFrame{
    private JPanel mainPanel;
    private DrawGraphComponent graphdraw;
    private JLabel imageLabel;

    Graph testGraph;

    private ImageIcon testIcon;

    public test()
    {
        super("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);



        testGraph = new Graph(3);
        GraphNode n1 = new GraphNode("Hallo"), n2=new GraphNode("Hi"),n3 = new GraphNode("Hey");

        n1.setPosY(1);
        n1.setPosX(1);
        n2.setPosY(2);
        n2.setPosX(2);
        n3.setPosY(3);
        n3.setPosX(3);

        testGraph.addNode(n1);
        testGraph.addNode(n2);
        testGraph.addNode(n3);

        testGraph.addEdges(n1, n2, 2);
        testGraph.addEdges(n2, n3, 2);

        graphdraw.graph=testGraph;


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        graphdraw = new DrawGraphComponent();

        /*imageLabel =new JLabel();
        testIcon = new ImageIcon(Utils.getResourceURL("img/test.png"));
        imageLabel.setIcon(testIcon);*/
    }
}
