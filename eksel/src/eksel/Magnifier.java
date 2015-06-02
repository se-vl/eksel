package eksel;

import java.awt.Font;

import javax.swing.JTextField;

public class Magnifier extends JTextField
{
    public Magnifier()
    {
        super(40);
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));
        setEditable(false);
    }
}
