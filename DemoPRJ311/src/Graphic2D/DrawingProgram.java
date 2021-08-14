package Graphic2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *  * Course CIS 117
 * Author: Luis Juarez
 * Title: Drawing Program
 * Date: 4/10/2016
 * Purpose: GUI drawing program
 */
public class DrawingProgram {

    public static void main(String[] args) {
        JFrame frame = new DrawingFrame();
        frame.setTitle("Drawing Program");
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Circle
{
    private int size;
    private Point center;
    private Color color;

    Circle(int iSize, Point location, Color C)
    {
        setSize(iSize);
        setLocation(location);
        setColor(C);
    }

    void setSize(int iSize) {
        if (iSize > 1) {
            size = iSize;
        } else {
            size = 1;
        }
    }

    void setLocation(Point Pcenter) {
        center = Pcenter;
    }

    void setColor(Color Ccolor) {
        color = Ccolor;
    }

    int getSize()
    {
        return size;
    }

    Point getCenter()
    {
        return center;
    }

    Color getColor()
    {
        return color;
    }


    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getCenter().x,getCenter().y,getSize(),getSize());
    }
}

class DrawingPanel extends JPanel implements MouseMotionListener
{
    private int circleDiameter;
    private Color circleColor;
    private Circle drawingCircle;
    private ArrayList <Circle> circleArrayList = new ArrayList<Circle>();


    DrawingPanel(Color co, int si)
    {
        setCircleColor(co);
       setCircleDiameter(si);

        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Iterator<Circle> circleIterator = circleArrayList.iterator();

        Circle drawCircle;

        while( circleIterator.hasNext() )
        {
            drawCircle = (Circle) circleIterator.next();
            drawCircle.draw(g);
        }
    }

    void setCircleDiameter(int tempSize)
    {
        circleDiameter = tempSize;
    }

    void setCircleColor(Color tempColor)
    {
        circleColor = tempColor;
    }

    int getCircleSize()
    {
        return circleDiameter;
    }

    Color getCircleColor()
    {
        return circleColor;
    }

void clear() {
    //clear panel
    JOptionPane.showMessageDialog(null, "Please restart the program for a new panel");

}

    @Override
    public void mouseDragged(MouseEvent e) {
        if ( e.isMetaDown() )
        {
            Circle newCircle = new Circle( getCircleSize(), e.getPoint(),
                    this.getBackground() );
            circleArrayList.add( newCircle );
        }
        else {
            Circle newCircle = new Circle( getCircleSize(), e.getPoint(),
                    this.getCircleColor() );
            circleArrayList.add( newCircle );
        }

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class DrawingFrame extends JFrame implements ActionListener
{
    final int SMALL = 4;
    final int MEDIUM = 8;
    final int LARGE = 10;

    private DrawingPanel drawPanel = new DrawingPanel(Color.black, SMALL);
    Container con = getContentPane();
    BorderLayout layout = new BorderLayout();
    JMenuBar mainMenuBar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Size");
    JMenu menu3 = new JMenu("Color");
    JMenu menu4 = new JMenu("Help");
    JMenuItem clear = new JMenuItem("Clear");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem small = new JMenuItem("Small");
    JMenuItem medium = new JMenuItem("Medium");
    JMenuItem large = new JMenuItem("Large");
    JMenuItem blackMenu = new JMenuItem("Black");
    JMenuItem greenMenu = new JMenuItem("Green");
    JMenuItem yellowMenu = new JMenuItem("Yellow");
    JMenuItem redMenu = new JMenuItem("Red");
    JMenuItem blueMenu = new JMenuItem("Blue");
    JMenuItem about = new JMenuItem("About");





    DrawingFrame()
    {
        con.setLayout(layout);
        drawPanel = new DrawingPanel( Color.BLACK, SMALL );
        drawPanel.setBackground( Color.WHITE );
        drawPanel.setVisible(true);
        setJMenuBar(mainMenuBar);
        mainMenuBar.add(menu1);
        mainMenuBar.add(menu2);
        mainMenuBar.add(menu3);
        mainMenuBar.add(menu4);
        menu1.add(clear);
        menu1.add(exit);
        menu2.add(small);
        menu2.add(medium);
        menu2.add(large);
        menu3.add(blackMenu);
        menu3.add(greenMenu);
        menu3.add(yellowMenu);
        menu3.add(redMenu);
        menu3.add(blueMenu);
        menu4.add(about);
        menu1.setMnemonic('F');
        menu2.setMnemonic('z');
        menu3.setMnemonic('o');
        menu4.setMnemonic('H');
        clear.setMnemonic('C');
        exit.setMnemonic('x');

        exit.addActionListener(this);
        clear.addActionListener(this);
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);
        blackMenu.addActionListener(this);
        greenMenu.addActionListener(this);
        yellowMenu.addActionListener(this);
        redMenu.addActionListener(this);
        blueMenu.addActionListener(this);
        about.addActionListener(this);
        redMenu.addActionListener(this);
        this.add(drawPanel);
        drawPanel.setPreferredSize(new Dimension(600,600));

    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String arg = e.getActionCommand();
        if(arg.equals("Exit") )
        {
            System.exit(0);
        }
        if(arg.equals("About") )
        {
            JOptionPane.showMessageDialog(null, "Drawing Program by Luis Juarez");
        }
        if(arg.equals("Clear"))
        {
           drawPanel.clear();
        }
        if(arg.equals("Red"))
        {
            drawPanel.setCircleColor(Color.red);
        }
        if(arg.equals("Black"))
        {
            drawPanel.setCircleColor(Color.black);
        }
        if(arg.equals("Yellow"))
        {
            drawPanel.setCircleColor(Color.yellow);
        }
        if(arg.equals("Green"))
        {
            drawPanel.setCircleColor(Color.green);
        }
        if(arg.equals("Blue"))
        {
            drawPanel.setCircleColor(Color.blue);
        }
        if(arg.equals("Small"))
        {
            drawPanel.setCircleDiameter(SMALL);
        }
        if(arg.equals("Medium"))
        {
            drawPanel.setCircleDiameter(MEDIUM);
        }
        if(arg.equals("Large"))
        {
            drawPanel.setCircleDiameter(LARGE);
        }
    }
}