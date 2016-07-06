package graphen.gui;


import graphen.Graph;
import graphen.GraphNode;
import graphen.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/**
 * Created by By_if1_08 on 09.06.2016.
 */
public class DrawGraphComponent extends JComponent implements MouseListener,MouseMotionListener, MouseWheelListener{
    public Graph graph;
    float sc = 100.0f;
    float lastX = 0, lastY = 0;
    float cx = 0, cy = 0;

    public DrawGraphComponent() {
        addMouseWheelListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setTransform(Utils.getTransform(this, cx, cy, sc, 0));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(graph == null)
            return;

        GraphNode[] nodes = graph.getNodes();
        double[][] edges = graph.getEdges();
        /**
         * Draw edges
         */
        for (int j = 0; j < nodes.length; j++) {
            for (int i = 0; i < nodes.length; i++) {
                if (edges[i][j] != Graph.NO_CONNECTION) {
                    g2d.drawLine(nodes[i].getPosX(), nodes[i].getPosY(), nodes[j].getPosX(), nodes[j].getPosY());
                }
            }
        }


        /**
         * Draw nodes
         */
        for(GraphNode n:nodes) {
            g2d.fillOval((int) n.getPosX()-2, (int) n.getPosY()-2, 4, 4);
        }

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        sc -= (Math.log10(sc)+1)*e.getUnitsToScroll()/5;
        sc = Utils.clamp(sc,0.11f,100.0f);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        lastX = e.getX();
        lastY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        cx += (lastX - e.getX())/sc;
        cy += (lastY - e.getY())/sc;
        lastX = e.getX();
        lastY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
