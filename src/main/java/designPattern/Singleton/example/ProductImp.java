package designPattern.Singleton.example;

public class ProductImp implements Product {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


}

