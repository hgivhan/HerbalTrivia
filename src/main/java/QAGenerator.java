import java.lang.reflect.Array;
import java.util.*;

public class QAGenerator {
    public Map<Question, Answer> qaMap = new HashMap<>();

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
    public String generateRandomQ(){
        Object[] randomQAPair = qaMap.keySet().toArray();
        Object random = randomQAPair[new Random().nextInt(randomQAPair.length)];
        String newStr = random + "\n" + qaMap.get(random);
        qaMap.remove(random);
        return newStr;




    }
//compare given answer against correct answer.
//return true if the given answer matches the correct answer
//    public boolean compareAnswer(String question, String givenA){
//        Map<String, String> comparison = new HashMap<>();
//        comparison.put(question, givenA);
//        if (qaMap.get(question).equals(comparison.get(question))){
//            return true;
//        }
//        return false;

    }


    /*randomly generate map of 5 QA key value pairs
    there will be 4 answer options A-D
    compare given answer to key's value
    return yes/no if right and count points
    Delete Q once it has been answered
    add music clip to match the herb/topic in question, out of my league?
    GUI? Out of my league?
    */


