package at.htl.ejbdemo.cdi;

import javax.enterprise.inject.Vetoed;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Vetoed
public class KontakteProvider implements KontakteHandler {

    @Logging
    public List<String> getKontaktNamen() {
        System.out.println("== getKontakteNamen ==");
        List<String> names = new ArrayList<>();
        names.add("Susi");
        names.add("Hansi");
        names.add("Maxi");
        names.add(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return names;
    }

}



