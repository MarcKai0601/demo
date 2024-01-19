package designPattern.FactoryMethodPattern.FrenchFries;

public class main {

    public static void main(String[] args) {
        Factory friesFac = new FrenchFriesFactory();
        Product fries = friesFac.getProduct();
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽的");

        fries.describe();//我是有鹽巴薯條
        myfries.describe();//我是無鹽的薯條
    }
}
