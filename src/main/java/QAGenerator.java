import java.lang.reflect.Array;
import java.util.*;

public class QAGenerator {
    public Map<Question, Answer> qaMap;

    public QAGenerator() {
        this.qaMap = new HashMap<>();
        qaMap.put(new Question("Q1"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q2"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q3"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q4"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q5"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q6"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q7"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q8"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q9"), new Answer("A", "B", "C", "D"));
        qaMap.put(new Question("Q10"), new Answer("A", "B", "C", "D"));
    }

    public String generateRandomQ(){
        Object[] randomQAPair = qaMap.keySet().toArray();
        Object random = randomQAPair[new Random().nextInt(randomQAPair.length)];
        return ("Question:\n" + random + "\n" + qaMap.get(random));

    }


    /*randomly generate map of 5 QA key value pairs
    there will be 4 answer options A-D
    compare given answer to key's value
    return yes/no if right and count points
    Delete Q once it has been answered
    add music clip to match the herb/topic in question
    */

}
