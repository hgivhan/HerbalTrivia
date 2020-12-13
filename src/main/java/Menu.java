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
        play();

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
        console.println("1..." + "\n");
        console.delay();
    }

    //evaluate randomly generated info to get correct answer for each key
    //remove the key-value pair from map if it was generated to avoid duplicates in quiz
    public String evaluateRandomlyGeneratedKeyValue() {
        Map<Question, Answer> qaMap = new HashMap();
        if (qag.generateRandomQ().equals(qaMap.get("Q1"))) { //check if random = given key
            String correctAnswer = "A";
            qaMap.remove("Q1");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q2"))) { //check if random = given key
            String correctAnswer = "C";
            qaMap.remove("Q2");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q3"))) { //check if random = given key
            String correctAnswer = "B";
            qaMap.remove("Q3");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q4"))) { //check if random = given key
            String correctAnswer = "C";
            qaMap.remove("Q4");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q5"))) { //check if random = given key
            String correctAnswer = "D";
            qaMap.remove("Q5");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q6"))) { //check if random = given key
            String correctAnswer = "A";
            qaMap.remove("Q6");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q7"))) { //check if random = given key
            String correctAnswer = "D";
            qaMap.remove("Q7");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q8"))) { //check if random = given key
            String correctAnswer = "B";
            qaMap.remove("Q8");
            return correctAnswer;
        } else if (qag.generateRandomQ().equals(qaMap.get("Q9"))) { //check if random = given key
            String correctAnswer = "C";
            qaMap.remove("Q9");
            return correctAnswer;
        } else { //this would be "Q10" key
            String correctAnswer = "A";
            qaMap.remove("Q10");
            return correctAnswer;
        }
    }

    //generate random set and check what was generated
    // get input from user, compare answers, return outcome
    public void play() {
        Map<Question, Answer> qaMap = new HashMap(); //new map
        int pointsCount = 0; //point count

        //for (Question q : qaMap.keySet()) { //loop thru map
            console.print(qag.generateRandomQ());
            String value = evaluateRandomlyGeneratedKeyValue();//for each loop, generate random
            String givenAnswer = console.getStringInput(console.promptForAnswer()); //get answer
                if (givenAnswer.equals(value)) { //check if given is correct
                    pointsCount++; //if so, increase points
                    console.println(console.correctAnswer()); //print correct
                } else {
                    console.println(console.wrongAnswer()); //and print incorrect
                }
                checkIfPlayAgain();

            }

    public void checkIfPlayAgain(){
        console.getIntegerInput(console.promptNext());
        if (console.getIntegerInput(console.promptNext()) == 1) {
            play();
        }
        else if (console.getIntegerInput(console.promptNext()) == 2) {
            console.println("Thanks for playing!");
        }
        else {
            console.println("Please enter (1) or (2)");
        }


        }


            }




