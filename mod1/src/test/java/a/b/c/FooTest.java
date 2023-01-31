package a.b.c;

import ognl.ArrayPropertyAccessor;
import org.apache.tools.ant.launch.Launcher;
import org.junit.Test;
import org.springframework.aop.framework.ProxyConfig;
import org.springframework.expression.TypedValue;

import static org.junit.Assert.fail;

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

    @Test
    public void testMethod3() {

        try {

            ArrayPropertyAccessor arrayPropertyAccessor = new ArrayPropertyAccessor();
            fail("no 'ArrayPropertyAccessor' class should be available in classpath!");

        } catch (final NoClassDefFoundError e) {
            System.out.println("**********************************");
            System.out.println("the following type is not available: ");
            System.out.println(e.getMessage());
            System.out.println("**********************************");


        }
    }

    @Test
    public void testMethod4() {

        try {

            Launcher arrayPropertyAccessor = new Launcher();
            fail("no 'Launcher' class should be available in classpath!");

        } catch (final NoClassDefFoundError e) {
            System.out.println("**********************************");
            System.out.println("the following type is not available: ");
            System.out.println(e.getMessage());
            System.out.println("**********************************");


        }
    }
}
