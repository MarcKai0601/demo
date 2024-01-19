package designPattern.FactoryMethodPattern.Shape.factory;

import designPattern.FactoryMethodPattern.Shape.shape.Circle;
import designPattern.FactoryMethodPattern.Shape.shape.Shape;
import designPattern.FactoryMethodPattern.Shape.shape.Square;

// 創建者（工廠）接口
public interface ShapeFactory {
    Shape createShape();
}

