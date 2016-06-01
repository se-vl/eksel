package eksel;

import java.awt.Font;

import javax.swing.JTextField;

public class Magnifier
{
    private final JTextField _textField;

    public Magnifier()
    {
        _textField = new JTextField(40);
        _textField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));
        _textField.setEditable(false);
    }

    public JTextField getTextField()
    {
        return _textField;
    }
}
