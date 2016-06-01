package eksel;

import java.util.Objects;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import observer.Beobachtbar;

public class Sheet extends Beobachtbar
{
    private final JTable _table;

    public Sheet()
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
                    informiereÜberÄnderung();
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

    public int getSelectedRow()
    {
        return _table.getSelectedRow();
    }

    public int getSelectedColumn()
    {
        return _table.getSelectedColumn();
    }

    public String getSelectedColumnName()
    {
        int column = getSelectedColumn();
        return _table.getColumnName(column);
    }

    public String getSelectedText()
    {
        int row = getSelectedRow();
        int column = getSelectedColumn();
        Object selectedValue = _table.getValueAt(row, column);
        return Objects.toString(selectedValue, "");
    }

    public JComponent getSwingComponent()
    {
        return _table;
    }
}
