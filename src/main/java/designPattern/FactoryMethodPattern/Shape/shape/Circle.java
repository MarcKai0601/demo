package designPattern.FactoryMethodPattern.Shape.shape;

// 具體產品1：圓形
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
