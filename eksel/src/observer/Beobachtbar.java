package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Beobachtbar
{
    private List<Beobachter> _alleBeobachter;

    protected Beobachtbar()
    {
        _alleBeobachter = new ArrayList<Beobachter>();
    }

    public void registriereBeobachter(Beobachter neuerBeobachter)
    {
        System.out.println(neuerBeobachter + " hat sich gerade registriert!");
        _alleBeobachter.add(neuerBeobachter);
    }

    protected void informiereÜberÄnderung()
    {
        for (Beobachter beobachter : _alleBeobachter)
        {
            beobachter.reagiereAufÄnderung();
        }
    }
}
