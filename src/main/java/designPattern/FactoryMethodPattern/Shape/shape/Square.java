package designPattern.FactoryMethodPattern.Shape.shape;

// 具體產品2：正方形
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
