package synchronized_demo;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getUniqueInstance() {
        //先判断对象是否已经存在过实例，没有实例化才进入加锁代码
        if (uniqueInstance == null) {
            //类对象锁
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
