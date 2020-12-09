import java.util.*;
import java.util.stream.Collectors;

public class Election<names> {

    public static void countVotes(ArrayList<String> names) {
        ArrayList<Integer> votes = new ArrayList<Integer>();
        Set<String> set = new HashSet<String>(names);
        String mostCommonWord = null;
        for (String name : set){
            System.out.println(name + " received " + Collections.frequency(names, name) + " votes");
            votes.add(Collections.frequency(names, name));
            if(Collections.max(votes) == Collections.frequency(names, name)){
                mostCommonWord = name;
            }
        }
        System.out.println("The Winner is " + mostCommonWord + " with " + Collections.max(votes) + " votes");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        ArrayList names = new <String, Integer>ArrayList();
        System.out.println("Enter the votes, one vote per line.\n End with either -1 or an empty line.");
        outer:
        while (run != false) {
           String a = input.nextLine();
            if (a.isEmpty() || a.contentEquals("-1")) {
                run = false;
                break outer;
            }
            else{
                names.add(a);
            }
        }
        if(!names.isEmpty()) {
            countVotes(names);
        }
    }
}

