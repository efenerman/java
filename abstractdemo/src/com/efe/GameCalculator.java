package com.efe;
//abstract sınıflar newlenemez!!!!!!
public abstract class GameCalculator {
    public abstract void calculate();


    //override edilemesin
    public final void gameOver(){
        System.out.println("GAME OVER  : ");
    }
}
