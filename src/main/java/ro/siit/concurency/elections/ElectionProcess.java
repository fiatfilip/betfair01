package ro.siit.concurency.elections;

import java.util.Random;

public class ElectionProcess {
    public static void main(String[] args) {
        BallotBox ballotBox = new BallotBox();
        Voter[] voters = new Voter[1000];
        Random random = new Random();
        for (int i = 0; i < voters.length; i++) {
            voters[i] = new Voter(i, ballotBox, random.nextInt(30000));
        }

        for (int i = 0; i < voters.length; i++) {
            voters[i].start();
        }

        Thread pollThread = new Thread(new Poll(ballotBox));
        pollThread.setDaemon(true);
        pollThread.setPriority(11);
        pollThread.start();

        for (int i = 0; i < voters.length; i++) {
            try {
                voters[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Final results");
        ballotBox.getResults();

    }
}
