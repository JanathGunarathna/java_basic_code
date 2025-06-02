
import javax.swing.JFrame;
import javax.swing.JLabel;

public class objects{
    public static void main(String[] args) {
        int number =5;

        //create new windows
        JFrame window = new JFrame();
        window.setTitle("My New Window");
        window.setSize(400, 400);
        window.setVisible(true);// pop-uo new windows

        JLabel lable= new JLabel();

        lable.setText("My lable ");
        window.add(lable);
        
        
    }
}