package designPattern.Singleton.singleton;


//懶散模式(Lazy)
//懶散模式(Lazy)在呼叫getInstance時才進行初始化
//每次都需要進行同步，效率會很很低

public class Singleton{

    private static Singleton instance;
    //私有的建構式讓別人不能創造
    Singleton (){}

    //因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    //為了讓線程安全添加synchronized在多線程下確保物件唯一性
    public static synchronized Singleton getInstance(){
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}