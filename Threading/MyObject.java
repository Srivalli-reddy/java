package Threading;

 class Hi 
{
	
    synchronized void waitHere() {
        System.out.println("Thread is waiting...");
        try {
            wait();
        } catch (Exception e) {}
        System.out.println("Thread is resumed!");
    }

    synchronized void notifyNow() {
        System.out.println("Thread is notifying...");
        notify();
    }
}

public class MyObject   {
    public static void main(String[] args) {
        Hi obj = new Hi();

        Thread t1 = new Thread(() -> obj.waitHere());
        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            obj.notifyNow();
        });

        t1.start();
        t2.start();
    }


}



