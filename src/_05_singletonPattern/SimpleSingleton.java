package _05_singletonPattern;

public class SimpleSingleton {

    private static SimpleSingleton uniqueInstance;

    private SimpleSingleton() {}

    public static synchronized SimpleSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SimpleSingleton();
        }

        return uniqueInstance;
    }
}
