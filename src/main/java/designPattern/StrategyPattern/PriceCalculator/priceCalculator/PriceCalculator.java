package designPattern.StrategyPattern.PriceCalculator.priceCalculator;

import designPattern.StrategyPattern.Calculator.IStrategy.IStrategy;
import designPattern.StrategyPattern.PriceCalculator.BusANDMRT.BusANDMRT;
import designPattern.StrategyPattern.PriceCalculator.BusANDMRT.BusStrategy;
import designPattern.StrategyPattern.PriceCalculator.BusANDMRT.MRTStrategy;

public class PriceCalculator {
    BusANDMRT strategy;

    private PriceCalculator(){};

    public PriceCalculator(BusANDMRT strategy){
        this.strategy = strategy;
    }

    public void setStrategy(BusANDMRT strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.calculate(km,strategy);
    }

    public int calculate(int km , BusANDMRT strategy){
        this.strategy = strategy;
        return strategy.calculate(km);
    }

    public static void main(String[] args) {

        // 创建PriceCalculator对象
        PriceCalculator calculator = new PriceCalculator();

        // 创建不同的策略对象
        BusANDMRT strategy1 = new BusStrategy();
        BusANDMRT strategy2 = new MRTStrategy();

        // 设置不同的策略
        calculator.setStrategy(strategy1);

        // 使用默认策略计算
        int result1 = calculator.calculate(10);
        System.out.println("Result with default strategy: " + result1);

        // 设置另一个策略
        calculator.setStrategy(strategy2);

        // 使用新策略计算
        int result2 = calculator.calculate(10);
        System.out.println("Result with new strategy: " + result2);

    }
}
