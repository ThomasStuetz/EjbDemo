package at.htl.ejbdemo.cdi;

import javax.enterprise.event.Observes;

public class Consument {

    private void onelementAdded(@Observes String added) {
        System.out.println("==> " + added + " wurde hinzugefügt!");
    }

}
