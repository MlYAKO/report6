package jp.ac.uryukyu.ie.e225706;

public class Rock implements Hand{
    private String name;
    private int eigenvalue;//この手の数値

    public Rock(String name, int eigenvalue){
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