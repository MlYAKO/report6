package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class Player extends Character{

    public Player(String name, int win, int lose,int handeigenvalue){
        super(name, win, lose, handeigenvalue);
    }

    @Override
    public void act(ArrayList<Character> targets) {
        var command_selector = new CommandSelector();
        
       //選択肢選択肢作成
        for(var action: getHands()) {
            command_selector.addCommand(action.name());
        }
       //ユーザの選択を待つ
        var command_number = command_selector.waitForUsersCommand("選択肢");
        System.out.println("ポンッ！");
        getHands().get(command_number);
        System.out.println(getHands().get(command_number).name());
        sethandeigenvalue(command_number + 1);
    }
}
