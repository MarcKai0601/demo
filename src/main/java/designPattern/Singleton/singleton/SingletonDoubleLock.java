package designPattern.Singleton.singleton;

//雙重鎖，偶爾會失效但是DCL還是運用最多的模式。
public class SingletonDoubleLock {
    public static SingletonDoubleLock instance;

    SingletonDoubleLock(){}

    public static SingletonDoubleLock getInstance(){

//        第一層判斷為了避免不必要的同步
        if(instance == null){

            synchronized (Singleton.class){
//                第二層判斷為了在null的狀況下建立實例
                if(instance == null){
                    instance = new SingletonDoubleLock();
                }
            }

        }

        return instance;
    }
}
