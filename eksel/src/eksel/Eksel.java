package eksel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import observer.Beobachter;

public class Eksel implements Beobachter
{
    private final JPanel _panel;

    // Das Kontextwerkzeug Eksel besteht aus den folgenden 3 Subwerkzeugen
    private final Magnifier _magnifier;
    private final Sheet _sheet;
    private final StatusLine _statusLine;

    public Eksel()
    {
        _panel = new JPanel(new BorderLayout());

        _magnifier = new Magnifier();
        _sheet = new Sheet();
        _statusLine = new StatusLine();

        _panel.add(_magnifier.getSwingComponent(), BorderLayout.NORTH);
        _panel.add(new JScrollPane(_sheet.getSwingComponent()),
                BorderLayout.CENTER);
        _panel.add(_statusLine.getSwingComponent(), BorderLayout.SOUTH);

        _sheet.registriereBeobachter(this);
    }

    public JPanel getPanel()
    {
        return _panel;
    }

    @Override
    public void reagiereAufÄnderung()
    {
        String newText = _sheet.getSelectedText();
        _magnifier.setText(newText);

        int row = _sheet.getSelectedRow();
        String columnName = _sheet.getSelectedColumnName();
        _statusLine.setText(columnName + row);
    }
}
