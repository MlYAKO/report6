package jp.ac.uryukyu.ie.e225706;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test void cheker() {
        var board = new Gameboard();
        board.janken();
        board.Rohan.openStatus();
        board.Honda.openStatus();
    }   
}
    
