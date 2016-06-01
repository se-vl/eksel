package eksel;

import java.util.Objects;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Sheet
{
    private final JTable _table;

    public Sheet(final Magnifier magnifier)
    {
        _table = new JTable(24, 8);
        _table.setCellSelectionEnabled(true);

        class MyListener implements ListSelectionListener
        {
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
                if (event.getValueIsAdjusting() == false)
                {
                    magnifier.getTextField()
                        .setText(getSelectedText());
                }
            }
        }
        MyListener selectionChanged = new MyListener();

        _table.getSelectionModel()
            .addListSelectionListener(selectionChanged);

        _table.getColumnModel()
            .getSelectionModel()
            .addListSelectionListener(selectionChanged);
    }

    public JTable getTable()
    {
        return _table;
    }

    public String getSelectedText()
    {
        Object selectedValue = _table.getValueAt(_table.getSelectedRow(), _table.getSelectedColumn());
        return Objects.toString(selectedValue, "");
    }
}
