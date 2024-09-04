package designPattern.StrategyPattern.Calculator.IStrategy;

public interface IStrategy {

    int caculate(int a, int b);

    class add implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a + b;
        }
    }

    class minus implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a - b;
        }
    }

    class multyply implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a * b;
        }
    }

    class divide implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a / b;
        }
    }
}