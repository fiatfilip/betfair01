package ro.siit.concurency.elections;

public class Poll implements Runnable{
    private BallotBox ballotBox;

    public Poll(BallotBox ballotBox){
        this.ballotBox = ballotBox;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Intermediate results");
            ballotBox.getResults();
        }
    }
}
