package designPattern.StrategyPattern.Calculator.IStrategy;

public class minus implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a - b;
    }
}
