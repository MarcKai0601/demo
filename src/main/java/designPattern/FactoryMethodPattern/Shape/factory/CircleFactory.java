package designPattern.FactoryMethodPattern.Shape.factory;

import designPattern.FactoryMethodPattern.Shape.shape.Circle;
import designPattern.FactoryMethodPattern.Shape.shape.Shape;

// 具體創建者1：創建圓形的工廠
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
