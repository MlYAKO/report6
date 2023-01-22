package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class Player extends Character{

    private int handnumber;

    public int gethandnumber(){
        return this.handnumber;
    }

    public void sethandnumber(int handnumber){
        this.handnumber = handnumber;
    }

    public Player(String name, int win, int lose){
        super(name, win, lose);
    }

    @Override
    public void act(ArrayList<Character> targets) {
        var command_selector = new CommandSelector();
        
       //選択肢選択肢作成
        for(var action: getHands()) {
            command_selector.addCommand(action.name());
        }
       //ユーザの選択を待つ
        var command_number = command_selector.waitForUsersCommand("最初はグー、ジャンケン...");
        System.out.println("ポンッ！");
        getHands().get(command_number);
        handnumber = getHands().get(command_number).eigenvalue();
        System.out.println(getHands().get(command_number).name());
    }
}
