import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        //g.setColor(Color.BLACK);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
//                        //draw oval
//                        int centerX = x2/2;
//                        int centerY = y2/2;
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(centerX - 55/2, centerY - 55/2, 55, 55);
//                        //g.fillOval(73, 73, 55, 55);

                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        int border = 5;
//                      //Draw an inner border
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1 + border, y1 + border, width - border*2, height - border*2);
//                        
//                        //top left to bottom right
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //top right to bottom left
//                        g.setColor(Color.CYAN);
//                        g.drawLine(x2, y1, x1, y2);
                        
                        //drawing the flag
                        
                        // red spaces
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1 , width+1, 50);
                        g.fillRect(x1, y1 + 100 , width + 1, 50);
                        g.fillRect(x1, y1 + 200 , width + 1, 50);
                        
                        //blue triangle
                        
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1, y1);
                        triangle.addPoint(width/2, height/2);
                        triangle.addPoint(x1, height +1);
                        triangle.addPoint(x1, y1);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);

                        //white star
                        
                        Polygon star = new Polygon();
                      star.addPoint(width/6, height/2 - 35);
                      star.addPoint(width/6 + 5, height/2 - 20);
                      star.addPoint(width/6 + 25, height/2 -20);
                      star.addPoint(width/6 + 10, height/2 - 7);
                      star.addPoint(width/6 + 20, height/2 + 10 );
                      star.addPoint(width/6, height/2 );
                      star.addPoint(width/6 - 15, height/2 + 10);
                      star.addPoint(width/6 - 10, height/2 - 7);
                      star.addPoint(width/6 - 25, height/2 - 20);
                      star.addPoint(width/6 - 5, height/2 -20);
                      g.setColor(Color.WHITE);
                      g.fillPolygon(star);
                        
                        
            }
}