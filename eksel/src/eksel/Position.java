package eksel;

import javax.swing.JTextField;

public class Position
{
    private final JTextField _textField;

    public Position()
    {
        _textField = new JTextField(3);
        _textField.setText("A12");
        _textField.setEditable(false);
    }

    public JTextField getTextField()
    {
        return _textField;
    }
}
