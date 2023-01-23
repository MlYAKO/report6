package jp.ac.uryukyu.ie.e225706;

 import java.util.*;

 public class Gameboard{
    ArrayList<Character> order = new ArrayList<>();

    public Player Rohan = new Player("あなた", 0, 0,0);
    public Enemy Honda = new Enemy("Honda", 0, 0, 0);
    public Gameboard() {
        Rohan.addAction(new Rock("グー", 1));
        Rohan.addAction(new paper("チョキ", 2));
        Rohan.addAction(new paper("パー", 3));

        Honda.addAction(new Rock("グー", 1));
        Honda.addAction(new paper("チョキ", 2));
        Honda.addAction(new paper("パー", 3));

        //入力順
        order.add(Rohan);
        order.add(Honda);
    }

    public void openStatus(Player player,Enemy enemy){
        System.out.printf("%s:win %d  lose %d  number %d\n", player.getName(), player.getWin(), player.getLose(),player.gethandeigenvalue());
        System.out.printf("%s:win %d  lose %d  number %d\n", enemy.getName(), enemy.getWin(), enemy.getLose(),enemy.gethandeigenvalue());
    }

    public void janken(){
        for(var check : order){
            check.act(order);
        }
    }

    public Object getGreeting() {
        return null;
    }

}