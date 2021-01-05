public class Main {

    public static void main(String[] args) {
        // Single Thread example
        System.out.println("Single-Threaded example\n\n");

        for(int i =0;i<10;i++) {
            Singleton singleton = Singleton.getInstance();
            int finalI = i;
            singleton.operation(finalI);
        }

        // Multi-Threads synchronized example
        /*System.out.println("\n\nMulti-Threaded synchronized example\n\n");
        for(int i =9;i<20;i++) {
            int finalI = i;
            (new Thread(()->{
                Singleton singleton = Singleton.getInstance();
                singleton.synchronizedOperation(finalI);
            })).start();
        }*/

        // Multi-Threads Asynchronous example
        System.out.println("\n\nMulti-Threaded Asynchronous example\n\n");
        for(int i =9;i<20;i++) {
            int finalI = i;
            (new Thread(()->{
                Singleton singleton = Singleton.getInstance();
                singleton.operation(finalI);
            })).start();
        }


    }
}
