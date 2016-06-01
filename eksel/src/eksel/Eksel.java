package eksel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Eksel
{
    private final JPanel _panel;

    private final Magnifier _magnifier;
    private final Sheet _sheet;
    private final Position _position;

    public Eksel()
    {
        _panel = new JPanel(new BorderLayout());

        _magnifier = new Magnifier();
        _sheet = new Sheet(_magnifier);
        _position = new Position();

        _panel.add(_magnifier.getTextField(), BorderLayout.NORTH);
        _panel.add(new JScrollPane(_sheet.getTable()), BorderLayout.CENTER);
        _panel.add(_position.getTextField(), BorderLayout.SOUTH);
    }

    public JPanel getPanel()
    {
        return _panel;
    }
}
