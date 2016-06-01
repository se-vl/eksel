package eksel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Eksel
{
    private final JPanel _panel;

    private final Magnifier _magnifier;
    private final Sheet _sheet;
    private final StatusLine _statusLine;

    public Eksel()
    {
        _panel = new JPanel(new BorderLayout());

        _magnifier = new Magnifier();
        _sheet = new Sheet(_magnifier);
        _statusLine = new StatusLine();

        _panel.add(_magnifier.getSwingComponent(), BorderLayout.NORTH);
        _panel.add(new JScrollPane(_sheet.getSwingComponent()),
                BorderLayout.CENTER);
        _panel.add(_statusLine.getSwingComponent(), BorderLayout.SOUTH);
    }

    public JPanel getPanel()
    {
        return _panel;
    }
}
