package io.turntabl.startfresh;

public class addClass {
    public int add(int i, int b){
        return i+b;
    }

    public void addmore(int ... n){
        int sum=0;
        for(int l : n){
            sum+=l;
        }
        System.out.println(sum);
    }

    void addTwoStrings(String a, String b){
        System.out.println("the strings you entered are " + a + " and "+ b);
    }
}
