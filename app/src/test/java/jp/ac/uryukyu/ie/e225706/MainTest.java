package jp.ac.uryukyu.ie.e225706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test void cheker() {
        Gameboard board = new Gameboard();
        board.Rohan.act(board.order);
        board.Honda.act(board.order);
        board.Rohan.openStatus();
        board.Honda.openStatus();
        assertNotNull(board.getGreeting(), "app should have a greeting");
    }   
}
    
