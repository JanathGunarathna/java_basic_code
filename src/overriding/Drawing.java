package overriding;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class  Drawing extends JFrame{
    public static void main(String[] args) {
      new Drawing();  
    }
    public Drawing(){
        setSize(400, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawRect(50, 50, 100, 25);
        g.setColor(new Color(0,0,255));
        g.drawOval(200, 50, 50, 50);
        
        g.setColor(Color.GREEN);
        g.fillRect(50, 200, 100, 25); 

        g.setColor(Color.BLUE);
        g.drawString("Hi I Am monstor", 200, 200);
        
    }
    
}
