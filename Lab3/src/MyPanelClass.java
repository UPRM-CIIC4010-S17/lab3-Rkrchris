
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
                        int y2 = getHeight() - myInsets.bottom -1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height +1 );
                        
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        g.setColor(Color.CYAN);
                        g.drawRect(x1 +50, y1+50, width -100  , height -100);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x2, y1, x2, y2);
                        
            }
}
