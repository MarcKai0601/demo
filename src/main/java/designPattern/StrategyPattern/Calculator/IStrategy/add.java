package designPattern.StrategyPattern.Calculator.IStrategy;

public class add implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a + b;
    }

}

