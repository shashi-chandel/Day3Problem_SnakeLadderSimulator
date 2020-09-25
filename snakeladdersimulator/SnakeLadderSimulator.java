package com.snakeladdersimulator;

public class SnakeLadderSimulator {
	public static void main(String[] args) {
	int position = 0, role=0;
	while(position<100) 
	{
	int roll = (int)(Math.random()*(6-1))+1;
	System.out.println("\nNumber after rolling die: " + roll);
	int turn = (int)(Math.random() * 10 ) % 3;
	switch (turn) {
	case 1:
		System.out.println("Ladder!!");
		if(!((position+roll)>100))
			position +=roll;
		else
			System.out.println("No turn");
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
	role++;
	System.out.println("Position of the player: " + position);
	}
	System.out.println("\n        Player wins the game!!!");
	System.out.println(" \n Number of roles to win: " + role);
	}
}
