import javax.swing.*;

/**
 * Created by harrison_brewton on 5/14/15.
 */
public class GWindow extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Rouger");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new GWindow());
        frame.pack();
        frame.setVisible(true);
    }

    public GWindow()
    {
        setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
    }
}
