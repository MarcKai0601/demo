package designPattern.Singleton;

public class Test {

    @org.junit.Test
    public void test(){

        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Humberger humberger =(Humberger) SingletonFactory.getHumbergerFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(humberger.getName());

    }

}