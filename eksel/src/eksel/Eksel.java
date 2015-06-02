package eksel;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Eksel extends JPanel
{
    private final Magnifier _magnifier;
    private final Sheet _sheet;
    private final Position _position;

    public Eksel()
    {
        _magnifier = new Magnifier();
        _sheet = new Sheet(_magnifier);
        _position = new Position();

        setLayout(new BorderLayout());

        add(_magnifier, BorderLayout.NORTH);
        add(new JScrollPane(_sheet), BorderLayout.CENTER);
        add(_position, BorderLayout.SOUTH);
    }
}
