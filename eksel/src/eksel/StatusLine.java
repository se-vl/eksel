package eksel;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class StatusLine
{
    private final JTextField _textField;

    public StatusLine()
    {
        _textField = new JTextField(3);
        _textField.setText("A12");
        _textField.setEditable(false);
    }

    public void setText(String newText)
    {
        _textField.setText(newText);
    }

    public JComponent getSwingComponent()
    {
        return _textField;
    }
}
