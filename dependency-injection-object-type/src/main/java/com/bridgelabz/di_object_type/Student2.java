package com.bridgelabz.di_object_type;

public class Student2 {
	private MathCheat cheat;
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void startCheating(){
		cheat.mathCheat();
		
	}

}
