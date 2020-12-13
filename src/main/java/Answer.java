import java.util.ArrayList;
import java.util.List;

public class Answer {
    List<String> answerList;

    public Answer(String a1, String a2, String a3, String a4) {
        this.answerList = new ArrayList<>();
        answerList.add(a1);
        answerList.add(a2);
        answerList.add(a3);
        answerList.add(a4);
    }

    public List<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return answerList.get(0) + "\n" +
        answerList.get(1) + "\n" +
        answerList.get(2) + "\n" +
        answerList.get(3) + "\n\n";
    }


}
