import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner input;
    private final PrintStream output;

    public IOConsole(InputStream input, PrintStream output) {
        this.input = new Scanner(input);
        this.output = output;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Integer input = Integer.parseInt(stringInput);
            return input;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value! Error Code:");
            return 101;
        }
    }

    public String promptForAnswer(){
        return "Please type your answer as a single letter";
    }

    public String correctAnswer(){
        return "Ding ding, that is correct!";
    }

    public String wrongAnswer(){
        return "That's not correct, keep studying...";
    }

    public String promptNext(){
        return getStringInput("Press (1) to continue playing\n" + "Press (2) to quit");
    }

    public void delay() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}

