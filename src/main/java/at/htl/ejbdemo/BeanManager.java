package at.htl.ejbdemo;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class BeanManager implements Serializable {

    @EJB
    private StatefulBean statefulBean;

    public void incAccess() {
        statefulBean.incAccess();
    }

    public int getCountAccess() {
        return statefulBean.getCountAccess();
    }

}


