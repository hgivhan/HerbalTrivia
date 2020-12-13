import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TriviaView {
    private final Scanner input;
    private final PrintStream output;
    private Question[] questionList;

    public TriviaView(InputStream input, PrintStream output) {
        this.input = new Scanner(input);
        this.output = output;
    }

    //In the View the user will see Q&A
    //the user will choose answer
    //the user will see if answer is right/wrong and any other messages
    //we had a menu and input/output console in the Casino...
    // how to know when to do that? They both seem the same to me.

}
