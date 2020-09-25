package com.snakeladdersimulator;

public class SnakeLadderSimulator {
	public static void main(String[] args) {
	int position = 0;
	System.out.println("Position of the Single player: " + position);
	int roll = (int)(Math.random()*(6-1))+1;
	System.out.println("Number after rolling die: " + roll);
	}
}
