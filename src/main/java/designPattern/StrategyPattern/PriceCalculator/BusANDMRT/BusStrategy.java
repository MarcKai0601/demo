package designPattern.StrategyPattern.PriceCalculator.BusANDMRT;

public class BusStrategy implements BusANDMRT {

    @Override
    public int calculate(int km) {

//        一段票15元
//        十公里內一段票，超過十公里兩段票

        int count = 0 ;

        if( km <= 10 ){
            count = 1 ;
        }else if( km > 10){
            count = 2 ;
        }

        return count * 15 ;

    }
}
