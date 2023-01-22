package jp.ac.uryukyu.ie.e225706;

import java.util.*;;

public abstract class Character{
    private String name;
    private int win;
    private int lose;

    private ArrayList<Hand> hands = new ArrayList<>();

    public Character(String name, int win, int lose){
        this.name = name;
        this.win = win;
        this.lose = lose;
    }
    
    public void addAction(Hand hand) {
        hands.add(hand);
    }

    public void openStatus(){
        System.out.printf("%s:win %d  lose %d\n", name, win, lose);
    }

    abstract void act(ArrayList<Character> targets);

    public String getName(){
        return this.name;
    }
    public int getWin(){
        return this.win;
    }
    public int getLose(){
        return this.lose;
    }

    public ArrayList<Hand> getHands(){
        return hands;
    }

    public void setWin(int win){
        this.win = win;
    }
    public void setLose(int lose){
        this.lose = lose;
    }
}