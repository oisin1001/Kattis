// java program to demonstrate
// use of semaphores Locks
import java.util.concurrent.*;

//A shared resource/class.
class Shared
{
    static int count = 0;
}

class MyThread extends Thread
{
    Semaphore a, b, c, d;
    String threadName;
    public MyThread(Semaphore a, Semaphore b, Semaphore c, Semaphore d, String threadName)
    {
        super(threadName);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // run by thread A
        switch (this.getName()) {
            case "P1":
                System.out.println("Starting " + threadName);
                try {
                    //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                a.release();
                break;
            case "P2":
                System.out.println("Starting " + threadName);
                try {
                    a.acquire();
                    //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                a.release();
                b.release();
                break;
            case "P3":
                System.out.println("Starting " + threadName);
                try {
                    a.acquire();
                   //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                a.release();
                c.release();
                break;
            case "P4":
                System.out.println("Starting " + threadName);
                try {
                    b.acquire();
                    //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                d.release();
                b.release();
                break;
            case "P5":
                System.out.println("Starting " + threadName);
                try {
                    b.acquire();
                    c.acquire();
                    //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                b.release();
                c.release();
                break;
            case "P6":
                System.out.println("Starting " + threadName);
                try {
                    c.acquire();
                    d.acquire();
                    //System.out.println(threadName + " gets a permit.");

                    // Now, accessing the shared resource.
                    // other waiting threads will wait, until this
                    // thread release the lock
                    for (int i = 0; i < 5; i++) {
                        // Now, allowing a context switch -- if possible.
                        // for thread B to execute
                        Thread.sleep(10);
                    }
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }

                System.out.println(threadName + " releases the permit.");
                c.release();
                d.release();
                break;
        }
    }
}

// Driver class
public class SemaphoreDemo  {
    public static void main(String args[]) throws InterruptedException
    {
        // creating a Semaphore object
        // with number of permits 1
        Semaphore a = new Semaphore(0);
        Semaphore b = new Semaphore(0);
        Semaphore c = new Semaphore(0);
        Semaphore d = new Semaphore(0);

        // creating two threads with name A and B
        // Note that thread A will increment the count
        // and thread B will decrement the count
        MyThread mt1 = new MyThread(a, b, c, d, "P1");
        MyThread mt2 = new MyThread(a, b, c, d, "P2");
        MyThread mt3 = new MyThread(a, b, c, d, "P3");
        MyThread mt4 = new MyThread(a, b, c, d, "P4");
        MyThread mt5 = new MyThread(a, b, c, d, "P5");
        MyThread mt6 = new MyThread(a, b, c, d, "P6");

        // stating threads A and B
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
        mt6.start();

        // waiting for threads A and B
        mt1.join();
        mt2.join();
        mt3.join();
        mt4.join();
        mt5.join();
        mt6.join();
    }
}
