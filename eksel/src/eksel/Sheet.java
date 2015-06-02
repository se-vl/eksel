package eksel;

import java.util.Objects;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Sheet extends JTable
{
    public Sheet(final Magnifier magnifier)
    {
        super(24, 8);
        setCellSelectionEnabled(true);

        class MyListener implements ListSelectionListener
        {
            @Override
            public void valueChanged(ListSelectionEvent event)
            {
                if (event.getValueIsAdjusting() == false)
                {
                    magnifier.setText(getSelectedText());
                }
            }
        }
        MyListener selectionChanged = new MyListener();

        getSelectionModel().addListSelectionListener(selectionChanged);
        getColumnModel().getSelectionModel()
            .addListSelectionListener(selectionChanged);
    }

    public String getSelectedText()
    {
        Object selectedValue = getValueAt(getSelectedRow(), getSelectedColumn());
        return Objects.toString(selectedValue, "");
    }
}
