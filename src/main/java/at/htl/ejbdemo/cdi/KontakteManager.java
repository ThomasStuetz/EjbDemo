package at.htl.ejbdemo.cdi;

import javax.inject.Inject;
import java.util.List;

public class KontakteManager {

    //private final KontakteProvider kontakteProvider;
    @Inject
    private KontakteProvider kontakteProvider;

    public KontakteManager() {
        kontakteProvider = new KontakteProvider();
    }

    public List<String> getKontakteNamen() {
        return kontakteProvider.getKontaktNamen();
    }
}




