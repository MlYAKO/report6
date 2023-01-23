package jp.ac.uryukyu.ie.e225706;

public class scissors implements Hand{
    private String name;
    private int eigenvalue;

    scissors(String name, int eigenvalue){
        this.name = name;
        this.eigenvalue = eigenvalue;
    }

    @Override
    public String name(){
        return name;
    }

    @Override
    public int eigenvalue(){
        return this.eigenvalue;
    }
    @Override
    public void execute(Character executer, Character target) {
        executer.sethandeigenvalue(2);
    }
}