package at.htl.ejbdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

@Stateful
public class StatefulBean {

    private int countAccess;

    public void incAccess() {
        countAccess++;
    }

    public int getCountAccess() {
        return countAccess;
    }

    @PostConstruct
    private void init() {
        countAccess = 1;
        System.out.println(" ==> Neue Session gestartet");
    }

    @PreDestroy
    private void destroy() {
        System.out.println(" ==> Gesamtanzahl der Zugriffe: " + countAccess);
    }

    @PrePassivate
    private void beforePassivation() {
        System.out.println(" ==> Passivierung beginnt");
    }

    @PostActivate
    private void afterActivation() {
        System.out.println(" ==> Aktivierung durchgeführt");
    }
}


