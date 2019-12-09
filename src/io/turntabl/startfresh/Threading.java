package io.turntabl.startfresh;
class Counter{
    int count;

    public synchronized void increment(){ // By introducing the synchronization,
        // it tells each thread to whiles the other executes
        count++;// count = count + 1
    }
}

public class Threading {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();
        Thread t1 = new Thread(()-> {
                for (int i=1; i<=1000; i++){
                   c.increment();
                }

        });
//        t1.start();
//        t1.join(); // the main waits till the thred finishes
        // without t1.join main outputs 0

        Thread t2 = new Thread(() -> {
           for(int i=1; i<=1000; i++){
               c.increment();
           }
        });

        Thread t3 = new Thread(()-> {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        );

   /*     Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i=1; i<=1000; i++){
                   c.increment();
               }
            }
        });
        //creating a thread raw. not using lambda expression
    */
        t3.start();
        t1.start();
        t2.start();

        t3.join();
        t1.join();
        t2.join();
        System.out.println("count is now " + c.count);
    }
}
