import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private int counter;

    private Singleton() {
        System.out.println("Creating instance \n Counter = " + counter+"\n\n");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void operation(int number) {
        System.out.println("Executing task number : " + counter);
        System.out.println("Testing singleton "+ number);
        for(int i =0;i<number;i++){
            System.out.print("-"+ i);
        }
        counter++;
        System.out.println("\nDone!!! Counter = "+(counter-1));
    }

    public synchronized void synchronizedOperation(int number) {
        System.out.println("Executing task number : " + counter);
        System.out.println("Testing singleton "+ number);
        for(int i =0;i<number;i++){
            System.out.print("-"+ i);
        }
        counter++;
        System.out.println("\nDone!!! Counter = "+(counter-1));
    }
}
