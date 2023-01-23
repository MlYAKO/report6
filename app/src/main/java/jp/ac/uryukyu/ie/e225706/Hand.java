package jp.ac.uryukyu.ie.e225706;

public interface Hand {
    public String name();
    public int eigenvalue();
    void execute(Character executer, Character target);
 }
