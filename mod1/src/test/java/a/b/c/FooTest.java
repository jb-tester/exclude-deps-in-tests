package a.b.c;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.aspectj.TypePatternClassFilter;
import org.springframework.aop.framework.ProxyConfig;
import org.springframework.expression.TypedValue;

import static org.junit.Assert.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/3/2019.
 * Project: exclude-deps-in-tests
 * *******************************
 */
public class FooTest {


    @Test
    public void testMethod1()  {

        try {
            TypedValue typedValue = new TypedValue("hello!");
            System.out.println("**********************************");
            System.out.println(typedValue.getValue());
            System.out.println("**********************************");
            fail("no 'TypedValue' class should be available in classpath!");

        } catch (final NoClassDefFoundError e) {
            System.out.println("**********************************");
            System.out.println("the following type is not available: ");
            System.out.println(e.getMessage());
            System.out.println("**********************************");
            
        }
    }
    @Test
    public void testMethod2()  {

        try {

            ProxyConfig patternClassFilter = new ProxyConfig();
            fail("no 'proxyConfig' class should be available in classpath!");

        } catch (final NoClassDefFoundError e) {
            System.out.println("**********************************");
            System.out.println("the following type is not available: ");
            System.out.println(e.getMessage());
            System.out.println("**********************************");
            

        }
    }
}
