public class Question {
    String question;

    public Question(String q) {
        this.question = q;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return question;
    }
}

