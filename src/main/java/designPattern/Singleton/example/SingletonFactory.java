package designPattern.Singleton.example;

public class SingletonFactory {

    public static Factory getColaFactory(){
        return ColaFactory.colaFactory;
    }

    public static Factory getHumbergerFactory(){
        return HumbergerFactory.humbergerFactory;
    }

    // ColaFactory 是 Cola 產品的工廠，實現了 Factory 介面
    private static class ColaFactory implements Factory{

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory(){}

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    // HumbergerFactory 是 Humberger 產品的工廠，實現了 Factory 介面
    private static class HumbergerFactory implements Factory{

        private static HumbergerFactory humbergerFactory = new HumbergerFactory();

        private HumbergerFactory(){}

        @Override
        public Product getProduct() {
            return new Humberger();
        }
    }
}
