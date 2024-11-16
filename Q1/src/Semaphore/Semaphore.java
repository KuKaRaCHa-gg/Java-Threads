package threads.train.Semaphore;

public class Semaphore {
    private final int val;
    private int tempVal;

    public Semaphore(int val){
        this.val = val;
        this.tempVal = val;
    }
    public synchronized void P(){
        if (--tempVal< 0){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void V(){
        if (++tempVal <= 0){
            notify();
        }
    }
}