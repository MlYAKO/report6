package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class Enemy extends Character {
    private int handnumber;

    public int gethandnumber(){
        return this.handnumber;
    }

    public void sethandnumber(int handnumber){
        this.handnumber = handnumber;
    }
    public Enemy(String name, int win, int lose) {
        super(name, win, lose);
    }
 
    @Override
    public void act(ArrayList<Character> targets) {
        Random random = new Random();
        int command = random.nextInt(3);
        getHands().get(command);
        handnumber = getHands().get(command).eigenvalue();
        System.out.println(getHands().get(command).name());
    }
 }