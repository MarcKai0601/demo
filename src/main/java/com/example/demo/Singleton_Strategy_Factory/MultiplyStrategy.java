package com.example.demo.Singleton_Strategy_Factory;

//打折策略
public class MultiplyStrategy extends IDiscountStrategy {

    public MultiplyStrategy(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value * discount;
    }
}
