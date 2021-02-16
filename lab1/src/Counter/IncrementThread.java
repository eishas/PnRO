package Counter;

public class IncrementThread implements Runnable{
    private Counter counter;
    private String method;

    public IncrementThread(Counter counter, String method){
        this.counter = counter;
        this.method = method;
    }

    @Override
    public void run() {
        switch (method){
            case ("asynchronous"):
                for (int i=0; i<100000; i++){
                    counter.asyncIncrement();
                }
                break;
            case ("synchronized method"):
                for (int i=0; i<100000; i++){
                    counter.syncIncrementMethod();
                }
                break;
            case ("synchronized block"):
                for (int i=0; i<100000; i++){
                    counter.syncIncrementBlock();
                }
            case ("locker"):
                for (int i=0; i<100000; i++){
                    counter.lockIncrement();
                }

        }
    }
}
