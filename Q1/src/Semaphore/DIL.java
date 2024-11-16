package threads.train.Semaphore;

public class DIL {
    private Semaphore semP, semV;
    private String msg;

    public DIL(Semaphore semP, Semaphore semV, String msg){
        this.semP = semP;
        this.semV = semV;
        this.msg = msg;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            this.semP.P();
            System.out.println(this.msg);
            this.semV.V();
    }


}}
