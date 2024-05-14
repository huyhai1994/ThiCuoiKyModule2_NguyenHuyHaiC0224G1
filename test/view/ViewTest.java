package view;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ViewTest {
    @Test
    public void printIntroduction() {
        View view = new View();
        view.printIntroduction();
    }
    @Test
    public void printMenu() {
        View view = new View();
        view.printMenu();
    }

    public static void main(String[] args) {
        View view = new View();
        int userChoice = view.getChoice();
        view.navigateToRegexControllers(userChoice);

    }

}