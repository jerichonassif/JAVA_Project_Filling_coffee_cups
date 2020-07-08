package com.company;

public class Ebreeq {
    private static int amount;
    private String liquteType;
//    private int amount= 0;
    public static final int MAX_LINQUDE_AMOUNT = 1000;
    public static final int FINJAN_LINQUDE_AMOUNT = 25;

    public Ebreeq(String liquteType , int amount){
        this.liquteType = liquteType;
        this.amount = amount;
    }

    public String getLiquteType() {
        return liquteType;
    }

    public int getAmount() {
        return amount;
    }

    public void clean(){
        amount = 0;
    }

    public void fill(){
         fill(MAX_LINQUDE_AMOUNT - amount);;
    }

    public boolean serve()
    {
        boolean didServe = false;
        if (fanajeen() != 0){
            amount-=FINJAN_LINQUDE_AMOUNT;
            didServe = true;
        }
        return didServe;
    }

    private static int fanajeen(){
        return amount/ FINJAN_LINQUDE_AMOUNT;
    }

    public boolean isEmpty(){
        return (amount == 0);
    }
    public boolean isFill(){
        return (amount == 1000);
    }

    public void fill(int amount){
       int newAmount = this.amount + amount;
       if (newAmount > MAX_LINQUDE_AMOUNT){
           throw new IllegalArgumentException( " لقد تم تعبئة الكثير من القهوة " + amount);
       }
       this.amount = newAmount;
    }
}
