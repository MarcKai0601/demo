package designPattern.Singleton.example;

public class Test {

    public static void main(String[] args) {

        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Humberger humberger =(Humberger) SingletonFactory.getHumbergerFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(humberger.getName());
    }
}
