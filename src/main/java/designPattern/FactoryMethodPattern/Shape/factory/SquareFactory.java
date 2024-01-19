package designPattern.FactoryMethodPattern.Shape.factory;

import designPattern.FactoryMethodPattern.Shape.shape.Shape;
import designPattern.FactoryMethodPattern.Shape.shape.Square;

// 具體創建者2：創建正方形的工廠
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
