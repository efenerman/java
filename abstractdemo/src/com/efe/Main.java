package com.efe;

public class Main {

    public static void main(String[] args) {
	WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
	womanGameCalculator.calculate();
	womanGameCalculator.gameOver();

	GameCalculator gameCalculator=new KidsGameCalculator();
	gameCalculator.calculate();
	gameCalculator.gameOver();
    }
}
