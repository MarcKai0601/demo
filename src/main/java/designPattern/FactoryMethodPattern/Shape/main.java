package designPattern.FactoryMethodPattern.Shape;

import designPattern.FactoryMethodPattern.Shape.factory.CircleFactory;
import designPattern.FactoryMethodPattern.Shape.factory.ShapeFactory;
import designPattern.FactoryMethodPattern.Shape.factory.SquareFactory;
import designPattern.FactoryMethodPattern.Shape.shape.Shape;

public class main {
    public static void main(String[] args) {
        // 客戶端選擇創建圓形的工廠
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // 客戶端選擇創建正方形的工廠
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
    }
}
