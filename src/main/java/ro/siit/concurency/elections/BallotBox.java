package ro.siit.concurency.elections;

import java.util.*;

public class BallotBox {
//    List<Vote> votes = new ArrayList<>();
    List<Vote> votes = new Vector<>();

    public void addVote(Vote vote){
        votes.add(vote);
    }

    public void getResults(){
        Map<Candidate, Integer> candidateVotes = new HashMap<>();

        for(Candidate candidate : Candidate.values()){
            candidateVotes.put(candidate, 0);
        }

        for(Vote vote : votes){
            candidateVotes.put(vote.getCandidate(), candidateVotes.get(vote.getCandidate()) + 1);
        }

        TreeSet<ElectionResult> results = new TreeSet<>();
        for(Map.Entry<Candidate, Integer> entry : candidateVotes.entrySet()){
            results.add(new ElectionResult(entry.getKey(), entry.getValue()));
        }

        results.stream().forEach(System.out::println);
    }
}
