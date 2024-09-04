package designPattern.Singleton.singleton;

// 積極模式or餓漢模式
// 積極模式在宣告靜態物件的時候就已經初始化

import lombok.Getter;

public class SingleObject {

    //獲取唯一可用的對象
    //創建 SingleObject 的一個對象
    @Getter
    private static SingleObject instance = new SingleObject();

    //讓構造函數為 private，這樣該類就不會被實例化
    private SingleObject(){}

//    //獲取唯一可用的對象
//    public static SingleObject getInstance(){
//        return instance;
//    }
//用lombok實現了所以不用寫


}
