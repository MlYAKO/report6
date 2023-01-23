import jp.ac.uryukyu.ie.e225706.*;

public class Main{
    
    public static void main(String[] args){
        var board = new Gameboard();
        System.out.println("最初はグー、ジャンケン...");
        for(var i = 1; i<6;){
            board.janken();
            //Rohan.gethandeigenvalue
            if (board.Rohan.gethandeigenvalue() - board.Honda.gethandeigenvalue() == 0){
                board.Rohan.openStatus();
                board.Honda.openStatus();
                System.out.println("あいこで...");
            }
            if (board.Rohan.gethandeigenvalue() - board.Honda.gethandeigenvalue() == -1 || board.Rohan.gethandeigenvalue() - board.Honda.gethandeigenvalue() == 2){
                System.out.println(i + "戦目\nyon win!");
                board.Rohan.setWin(board.Rohan.getWin() + 1);
                board.Honda.setLose(board.Honda.getLose() + 1);
                board.Rohan.openStatus();
                board.Honda.openStatus();
                i += 1;
            }
            if (board.Rohan.gethandeigenvalue() - board.Honda.gethandeigenvalue() == 1 || board.Rohan.gethandeigenvalue() - board.Honda.gethandeigenvalue() == -2){
                System.out.println(i + "戦目\nyou lose");
                board.Rohan.setLose(board.Rohan.getLose() + 1);
                board.Honda.setWin(board.Honda.getWin() + 1);
                board.Rohan.openStatus();
                board.Honda.openStatus();
                //board.openStatus();
                i += 1;
            }
        }
        if (board.Rohan.getWin() > board.Honda.getWin()){
            System.out.println("お主、なかなかやりおる。また挑みに来るが良い！");
        }
        //今回は５回戦のため引き分けにはならない。i=奇数にすれば引き分けになる
        if (board.Rohan.getWin() == board.Honda.getWin()){
            System.out.println("泥試合で草");
        }
        if (board.Rohan.getWin() < board.Honda.getWin()){
            System.out.println("俺の勝ち。何で負けたか明日までに考えといてください。");
        }
    }
}
