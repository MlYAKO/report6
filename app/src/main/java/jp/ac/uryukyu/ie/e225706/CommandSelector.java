package jp.ac.uryukyu.ie.e225706;

import java.util.*;

public class CommandSelector {
    ArrayList<String> commands;
    Scanner scanner;

    public CommandSelector() {
        scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }

    public void addCommand(String command_name) {
        commands.add(command_name);
    }

    //promptを表示した上で，ユーザの選択を待つ
    public int waitForUsersCommand(String prompt) {
        var index = 0;
        System.out.println(prompt);
        for(var command : commands) { //選択肢をprint
            System.out.println(index + ":" + command);
            index += 1;
        }

        //標準入力から数値を入力
        while(true) {
            int target_index = scanner.nextInt();

            if (target_index >= 0 && target_index < commands.size()) {
                return target_index;
            }
        }        
    }
}