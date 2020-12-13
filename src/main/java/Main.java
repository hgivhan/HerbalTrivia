import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IOConsole ioc = new IOConsole(System.in, System.out);
        Menu menu = new Menu(ioc);
        menu.mainMenu();


    }
}
