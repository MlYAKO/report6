package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class Enemy extends Character {
    public Enemy(String name, int win, int lose, int handeigenvalue) {
        super(name, win, lose, handeigenvalue);
    }
 
    @Override
    public void act(ArrayList<Character> targets) {
        Random random = new Random();
        int command = random.nextInt(3);
        getHands().get(command);
        System.out.println(getHands().get(command).name());
        sethandeigenvalue(command + 1);

    }
 }