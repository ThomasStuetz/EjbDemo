package at.htl.ejbdemo.cdi;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import java.util.List;

@Decorator
@Priority(Interceptor.Priority.APPLICATION + 100)
public class KontakteDecorator implements KontakteHandler {

    @Inject
    @Any
    @Delegate
    private KontakteProvider provider;


    @Override
    public List<String> getKontaktNamen() {
        List<String> namen = provider.getKontaktNamen();
        namen.add("==> DECORATOR >==");
        return namen;
    }
}


