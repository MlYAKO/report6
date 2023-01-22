package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class Gameboard{
    ArrayList<Character> order = new ArrayList<>();
    private int Rohan_hand;
    private int Honda_hand;

    public int getRohan_hand(){
        return this.Rohan_hand;
    }

    public int getHonda_hand(){
        return this.Honda_hand;
    }

    public void setRohan_hand(int Rohan_hand){
        this.Rohan_hand = Rohan_hand;
    }

    public void setHonda_hand(int Honda_hand){
        this.Honda_hand =Honda_hand;
    }

    public Gameboard() {
      //for (var k = 0; k < 1;){
        var Rohan = new Player("あなた", 0, 0);
        Rohan.addAction(new Rock("グー", 1));
        Rohan.addAction(new paper("チョキ", 2));
        Rohan.addAction(new paper("パー", 3));
        Rohan_hand = Rohan.gethandnumber();

        var Honda = new Enemy("本田圭佑", 0, 0);
        Honda.addAction(new Rock("グー", 1));
        Honda.addAction(new paper("チョキ", 2));
        Honda.addAction(new paper("パー", 3));
        Honda_hand = Honda.gethandnumber();

        //入力順
        System.out.println("最初はグー、ジャンケン...");
        order.add(Rohan);
        order.add(Honda);
        // if (Rohan_hand - Honda_hand == 0){
        //     System.out.println("あいこで...");
        // }
        // if (Rohan_hand - Honda_hand == -1 || Rohan_hand - Honda_hand == 2){
        //     System.out.println("yon win!");
        //     k += 1;
        // }
        // if (Rohan_hand - Honda_hand == 1 || Rohan_hand -Honda_hand == -2){
        //     System.out.println("you lose");
        //     k += 1;
        // }
        // }
    }

    public void openStatus(){
        for(var open : order){
            open.openStatus();
        }
    }

    public void janken(){
        for(var check : order){
            check.act(order);
        }
    }
    
    // public static void main(String[] args){
    //     var board = new Gameboard();
    //     for(var i = 0; i<1; i++){
    //         board.openStatus();
    //         board.janken();
    //     }
    // }
 }