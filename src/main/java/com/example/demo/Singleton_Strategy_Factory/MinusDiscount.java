package com.example.demo.Singleton_Strategy_Factory;

//減價策略
public class MinusDiscount extends IDiscountStrategy {

    public MinusDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value - discount;
    }
}
