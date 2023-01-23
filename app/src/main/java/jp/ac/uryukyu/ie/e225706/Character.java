package jp.ac.uryukyu.ie.e225706;

import java.util.*;;

public abstract class Character{
    private String name;
    private int win;
    private int lose;
    private int handeigenvalue;

    private ArrayList<Hand> hands = new ArrayList<>();

    public Character(String name, int win, int lose, int handeigenvalue){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.handeigenvalue = handeigenvalue;
    }
    
    public void addAction(Hand hand) {
        hands.add(hand);
    }

    public void openStatus(){
        System.out.printf("%s:win %d  lose %d\n", name, win, lose);
    }

    public abstract void act(ArrayList<Character> targets);

    public String getName(){
        return this.name;
    }
    public int getWin(){
        return this.win;
    }
    public int getLose(){
        return this.lose;
    }

    public int gethandeigenvalue(){
        return this.handeigenvalue;
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
    public void sethandeigenvalue(int eigenvalue){
        this.handeigenvalue = eigenvalue;
    }
}