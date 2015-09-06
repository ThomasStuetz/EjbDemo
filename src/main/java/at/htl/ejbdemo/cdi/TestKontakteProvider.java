package at.htl.ejbdemo.cdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Vetoed;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Vetoed
public class TestKontakteProvider extends KontakteProvider {

    private List<String> namen = new ArrayList<>();

    @Inject  @Any
    private Event<String> event;

    @PostConstruct
    private void init() {
        add("Franzi");
        add("Berti");
        add("Fanny");
    }

    private void add(String name) {
        namen.add(name);
        event.fire(name);
    }

    @Override
    public List<String> getKontaktNamen() {
        return namen;
    }
}


