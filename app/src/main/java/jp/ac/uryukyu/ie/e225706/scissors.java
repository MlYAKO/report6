package jp.ac.uryukyu.ie.e225706;

public class scissors implements Hand{
    private String name;
    private int eigenvalue;

    public scissors(String name, int eigenvalue){
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
 }