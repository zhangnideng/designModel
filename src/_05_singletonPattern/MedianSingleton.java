package _05_singletonPattern;

public class MedianSingleton {
    private volatile static MedianSingleton uniqueInstance;

    private MedianSingleton() {}

    public static MedianSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized (MedianSingleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new MedianSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
