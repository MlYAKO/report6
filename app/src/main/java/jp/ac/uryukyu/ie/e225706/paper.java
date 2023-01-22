package jp.ac.uryukyu.ie.e225706;

public class paper implements Hand{
    private String name;
    private int eigenvalue;

    public paper(String name, int eigenvalue){
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