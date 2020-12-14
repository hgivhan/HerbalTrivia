import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner input;
    private final PrintStream output;
    Menu menu;

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
            println("Try inputting an integer value!");
        }
        return 0;
    }

    public String promptForAnswer(){
        return "Please type your answer (A, B, C, or D)";
    }

    public String correctAnswer(){
        return "Ding ding, that is correct!\n";
    }

    public String wrongAnswer(){
        return "That's not correct, let's try another...\n";
    }

    public void delay() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}

