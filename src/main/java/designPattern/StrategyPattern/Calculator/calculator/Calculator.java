package designPattern.StrategyPattern.Calculator.calculator;

import designPattern.StrategyPattern.Calculator.IStrategy.*;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int now = 0 ;

    private IStrategy strategy ;

    //    策略模式
    public int execute(int a , int b){
        return strategy.caculate(a,b);
    }

    public void reset(){
        this.now = 0 ;
    }

    //    簡單工廠模式
    public Object setStrategy(DoType doType) {
        switch (doType){
            case ADD:
                this.strategy = new IStrategy.add();
                break;
            case MINUS:
                this.strategy = new IStrategy.minus();
                break;
            case DIVIDE:
                this.strategy = new IStrategy.divide();
                break;
            case MULTYPLY:
                this.strategy = new IStrategy.multyply();
                break;
        }
        return null;
    }

    enum DoType{
        ADD , MINUS , DIVIDE , MULTYPLY
    }

    public static void main(String[] args) {

//        // 创建 Calculator 对象
//        Calculator calculator = new Calculator();
//
//        // 设置加法策略
//        calculator.setStrategy(DoType.ADD);
//        calculator.setStrategy(DoType.MINUS);
//        calculator.setStrategy(DoType.DIVIDE);
//        calculator.setStrategy(DoType.MULTYPLY);
//
//        // 执行计算
//        int result = calculator.execute(5, 3);
//
//        // 输出结果
//        System.out.println("Result: " + result);


// 创建 Calculator 对象
        Calculator calculator = new Calculator();

        // 定义所有的策略类型
        Calculator.DoType[] strategyTypes = Calculator.DoType.values();

        // 遍历所有策略类型并执行计算
        for (Calculator.DoType strategyType : strategyTypes) {
            // 设置策略
            calculator.setStrategy(strategyType);

            // 执行计算
            int result = calculator.execute(5, 3);

            // 输出结果
            System.out.println(strategyType + " Result: " + result);
        }

    }
}
