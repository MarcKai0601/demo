package designPattern.Singleton.singleton;

//用列舉實現，可以避免反實例化。
public enum EnumSingleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("do do !");
    }
}
