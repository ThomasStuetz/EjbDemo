package at.htl.ejbdemo.cdi;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logging
@Priority(Interceptor.Priority.APPLICATION + 200)
public class LoggingInterceptor {

    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        String name = context.getMethod().getName();
        System.out.println("==> " + name);

        Object result = context.proceed();

        System.out.println("<== " + name);

        return result;
    }
}
