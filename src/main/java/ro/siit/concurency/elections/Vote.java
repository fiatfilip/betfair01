package ro.siit.concurency.elections;

public class Vote {
    private Candidate candidate;
     public Vote(Candidate candidate){
         this.candidate = candidate;
     }
     public Candidate getCandidate() {
         return candidate;
     }
}
