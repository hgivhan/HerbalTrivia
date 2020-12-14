import java.util.HashMap;
import java.util.Map;

public class Menu {
    IOConsole console;
    Map<Question, Answer> qaMap = new HashMap<>();
    QAGenerator qag = new QAGenerator(qaMap);
    private static int counter = 0;

    public Menu(IOConsole console) {
        this.console = console;
    }

    public void mainMenu() {
        welcomeMessage();
        readyGo();
        getQandA();
    }

    public void welcomeMessage() {
        console.println("Welcome to Herbal Trivia!");
    }

    //add pause between numbers
    public void readyGo() {
        console.println("3");
        console.delay();
        console.println("2");
        console.delay();
        console.println("1");
        console.delay();
        console.println("Go!" + "\n");
        console.delay();
    }

    //evaluate randomly generated info to get correct answer for each key
    //generate the 5 Qs in random order
    public void getQandA() {
        int i = 0;
        while (i < 5) {
            String random = qag.generateRandomQ();
            console.println(random);
            if (random.contains("Q1")) { //check if random = given key
                evalAnswer("A");
                i++;
            } else if (random.contains("Q2") == true) {
                evalAnswer("C");
                i++;
            } else if (random.contains("Q3") == true) {
                evalAnswer("B");
                i++;
            } else if (random.contains("Q4") == true) {
                evalAnswer("C");
                i++;
            } else if (random.contains("Q5") == true) {
                evalAnswer("D");
                i++;
            } else if (random.contains("Q6") == true) {
                evalAnswer("A");
                i++;
            } else if (random.contains("Q7") == true) {
                evalAnswer("D");
                i++;
            } else if (random.contains("Q8") == true) {
                evalAnswer("B");
                i++;
            } else if (random.contains("Q9") == true) {
                evalAnswer("C");
                i++;
            } else { //this is "Q10"
                evalAnswer("A");
                i++;
            }
        }
        checkIfPlayAgain();
    }


    // get input from user, compare answers, return outcome
    public void evalAnswer(String correctAnswer) {
        String givenAnswer = console.getStringInput(console.promptForAnswer()); //get answer
        if (!(givenAnswer.toUpperCase().equals("A") || givenAnswer.toUpperCase().equals("B") ||
                givenAnswer.toUpperCase().equals("C") || givenAnswer.toUpperCase().equals("D"))) {
            console.println("The only answer options are: (A)(B)(C)or(D)");
            evalAnswer(correctAnswer);
        }
        else if (givenAnswer.toUpperCase().equals(correctAnswer)) { //check if given is correct
            incrementCounter(); //if so, increase points
            console.println(console.correctAnswer()); //print correct
        }
        else {
            console.println(console.wrongAnswer()); //and print incorrect
            }
        }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }


        public void checkIfPlayAgain(){
            Integer input = console.getIntegerInput("Press (1) to continue playing\n" + "Press (2) to quit");
            if (input == 1) {
                mainMenu();
            } else if (input == 2) {
                console.println("Thanks for playing! You're total points are: " + getCounter() + "/5.");
            } else {
                console.println("There are only two options:");
                checkIfPlayAgain();
            }

        }
    }





