package ro.siit.concurency.elections;

import java.util.Random;

public class Voter extends Thread{
    private BallotBox ballotBox;
    private int delay;
    private int id;
    public Voter(int id, BallotBox ballotBox, int delay) {
        this.ballotBox = ballotBox;
        this.delay = delay;
        this.id = id;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Voter" + id);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        vote();
        // System.out.println(Thread.currentThread().getName() + " has voted");
    }

    private void vote(){
        Random random = new Random();
        Candidate electedCandidate = Candidate.values()[random.nextInt(Candidate.values().length)];
        ballotBox.addVote(new Vote(electedCandidate));
    }

}
