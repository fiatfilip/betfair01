package ro.siit.concurency.elections;

public class ElectionResult implements Comparable<ElectionResult> {
    private Candidate candidate;
    private int noOfVotes;
    public ElectionResult(Candidate candidate, int noOfVotes) {
        this.candidate = candidate;
        this.noOfVotes = noOfVotes;
    }

    @Override
    public int compareTo(ElectionResult o) {
        if (this.noOfVotes < o.noOfVotes) {
            return 1;
        } else if (this.noOfVotes > o.noOfVotes) {
            return -1;
        } else {
            return this.candidate.compareTo(o.candidate);
        }
    }

    @Override
    public String toString() {
        return candidate.toString() + " " + noOfVotes;
    }
}
