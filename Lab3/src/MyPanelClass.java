import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        int centerX = x2/2;
                        int centerY = y2/2;
                        //draw oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(centerX - 55/2, centerY - 55/2, 55, 55);
                        //g.fillOval(73, 73, 55, 55);

                        
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
            }
}