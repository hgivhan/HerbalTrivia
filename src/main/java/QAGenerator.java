import java.util.*;

public class QAGenerator {
    public Map<Question, Answer> qaMap;

    //create new hashmap of 10 Qs wiht arraylist of answer options when object is made
    public QAGenerator(Map<Question, Answer> qaMap) {
        this.qaMap = qaMap;
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

    //generate random key-value pair for questions
    public String generateRandomQ() {
        Object[] randomQAPair = qaMap.keySet().toArray();
        Object random = randomQAPair[new Random().nextInt(randomQAPair.length)];
        String newStr = random + "\n" + qaMap.get(random);
        qaMap.remove(random);
        return newStr;
    }
}
