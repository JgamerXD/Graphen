package graphen.gui;


import graphen.Graph;
import graphen.GraphNode;
import graphen.Utils;



import javax.swing.*;


import java.awt.*;
import java.util.Arrays;

/**
 * Created by By_if1_08 on 09.06.2016.
 */
public class DrawGraphComponent extends JComponent{
    Graph graph;
    public static final double NO_CONNECTION = Double.POSITIVE_INFINITY;


    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setTransform(Utils.getTransform(this, 0, 0, 10, 0));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GraphNode[] nodes = graph.getNodes();
        double[][] edges = graph.getEdges();
        /**
         * Draw edges
         */
        for(int j = 0;j<nodes.length;j++)
        {
            for(int i = 0;i<nodes.length;i++)
            {
                if(edges[i][j]!=NO_CONNECTION)
                {
                    g2d.drawLine(nodes[i].getPosX(),nodes[i].getPosY(),nodes[j].getPosX(),nodes[j].getPosY());
                }
            }
        }

        /**
         * Draw nodes
         */
        for(GraphNode n:nodes) {
            g2d.fillOval(n.getPosX(),n.getPosY(),5,5);
        }
    }
}
