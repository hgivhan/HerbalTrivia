import java.util.HashMap;
import java.util.Map;

public class Menu {
    IOConsole console;
    Question question;
    Answer answer;
    Map<Question, Answer> qaMap = new HashMap<>();
    QAGenerator qag = new QAGenerator(qaMap);

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
        console.println("Go!"+ "\n");
        console.delay();
    }

    //evaluate randomly generated info to get correct answer for each key
    //remove the key-value pair from map if it was generated to avoid duplicates in quiz
    // (qag.generateRandomQ().equals(qaMap.get("Q3")))
    public void getQandA() {
        int i = 0;
        while(i<10){
//        for (int i = 0; i == 10; i++) {
            String random = qag.generateRandomQ();
            console.println(random);
                if (random.contains("Q1")) { //check if random = given key
                    EvalAnswer("A");
                    i++;
                } else if (random.contains("Q2") == true) {
                    EvalAnswer("C");
                    i++;
                } else if (random.contains("Q3") == true) {
                    EvalAnswer("B");
                    i++;
                } else if (random.contains("Q4") == true) {
                    EvalAnswer("C");
                    i++;
                } else if (random.contains("Q5") == true) {
                    EvalAnswer("D");
                    i++;
                } else if (random.contains("Q6") == true) {
                    EvalAnswer("A");
                    i++;
                } else if (random.contains("Q7") == true) {
                    EvalAnswer("D");
                    i++;
                } else if (random.contains("Q8") == true) {
                    EvalAnswer("B");
                    i++;
                } else if (random.contains("Q9") == true) {
                    EvalAnswer("C");
                    i++;
                } else { //this is "Q10"
                    EvalAnswer("A");
                    i++;
                }
            }
        checkIfPlayAgain();
    }


    //generate random set and check what was generated
    // get input from user, compare answers, return outcome
    public void EvalAnswer(String correctAnswer) {
        int pointsCount = 0; //point count
            String givenAnswer = console.getStringInput(console.promptForAnswer()); //get answer
            if (givenAnswer.toUpperCase().equals(correctAnswer)) { //check if given is correct
                pointsCount++; //if so, increase points
                console.println(console.correctAnswer()); //print correct
            } else {
                console.println(console.wrongAnswer()); //and print incorrect
            }
        }


    public void checkIfPlayAgain(){
       Integer input = console.getIntegerInput("Press (1) to continue playing\n" + "Press (2) to quit");
        if (input == 1) {
            mainMenu();
        }
        else if (input == 2) {
            console.println("Thanks for playing!");
        }
        else {
            console.println("Please enter (1) or (2)");
        }
    }
}




