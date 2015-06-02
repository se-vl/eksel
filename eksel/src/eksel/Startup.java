package eksel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Startup implements Runnable
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Startup());
    }

    public void run()
    {
        JFrame frame = new JFrame("Eksel");
        frame.add(new Eksel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
