package threads.train.Semaphore;

public class TestDIL {
    public static void main(String[] args) {
        Semaphore sem1 = new Semaphore(0);
        Semaphore sem2 = new Semaphore(0);
        Semaphore sem3 = new Semaphore(0);

        System.out.println("Debut du test");
        Thread t1 = new Thread(new DIL(sem1, sem2, "Dpt Info"), "Thread Dpt Info");
        Thread t2 = new Thread(new DIL(sem2, sem3, " IUT de "), "Thread IUT de ");
        Thread t3 = new Thread(new DIL(sem3, sem1, " Laval\n"), "Thread Laval");

        t1.start();
        t2.start();
        t3.start();

        sem1.V();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin du test");
    }
}