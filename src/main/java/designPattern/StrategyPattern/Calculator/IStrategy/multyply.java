package designPattern.StrategyPattern.Calculator.IStrategy;

public class multyply implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a * b;
    }
}
