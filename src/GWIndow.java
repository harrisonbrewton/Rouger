import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by harrison_brewton on 5/14/15.
 */
public class GWindow extends JPanel implements ActionListener
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Rouger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new GWindow());
        frame.pack();
        frame.setVisible(true);
    }
    private Rectangle gameRectangle;

    private Timer timer;

    private double ratio;

    public GWindow()
    {
        setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());

        gameRectangle = new Rectangle(0, 0, 800, 600);

        timer = new Timer(100, this);
        timer.start();

        ratio = 0;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        double ratioX = gameRectangle.getWidth()/getWidth();
        double ratioY = gameRectangle.getHeight()/getHeight();

        if(ratioX == ratioY)
        {
            ratio = ratioX;
            gameRectangle.setLocation(0, 0);
        }
        else if(ratioX > ratioY)
        {

        }

        repaint();
    }


}
