package view;

import org.junit.Test;

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

}