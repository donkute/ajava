import java.util.*;

class prodcon {
    public static void main(String args[]) throws java.lang.Exception {
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t2.start();
        t1.start();
    }
}

class Producer extends Thread {
    public StringBuffer sb;
    boolean dataproduced = false;

    Producer() {
        sb = new StringBuffer(); 
    }

    public void run() {
        synchronized(this) {
            for(int i = 1; i <= 10; i++) {
                try {
                    sb.append(i + ".");
                    Thread.sleep(100);
                    System.out.print("appending ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dataproduced = true;
            notify();
        }
    }
}

class Consumer extends Thread {
    Producer prod;

    Consumer(Producer prod) {
        this.prod = prod;
    }

    public void run() {
        synchronized (prod) {
            try {
                while (!prod.dataproduced) {
                    prod.wait();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("\nConsumed: " + prod.sb);
        }   
    }
}
