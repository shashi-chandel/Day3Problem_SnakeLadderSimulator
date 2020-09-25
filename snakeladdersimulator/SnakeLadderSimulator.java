package com.snakeladdersimulator;

public class SnakeLadderSimulator {
	public static void main(String[] args) {
	int position = 0;
	int roll = (int)(Math.random()*(6-1))+1;
	System.out.println("Number after rolling die: " + roll);
	int turn = (int)(Math.random() * 10 ) % 3;
	switch (turn) {
	case 1:
		System.out.println("Ladder!!");
		position +=roll;
		break;
	case 2:
		System.out.println("Snake!!");
		position -=roll;
		if(position<0)
			position = 0;
		break;
	default:
		System.out.println("No Play!!");
	}
	System.out.println("Position of the Single player: " + position);
	}
}
