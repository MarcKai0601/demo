package designPattern.Singleton;

public abstract class Product {
    public String getName(){
        return this.getClass().getSimpleName();
    }
}

