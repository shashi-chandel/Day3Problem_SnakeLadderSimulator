package com.snakeladdersimulator;

public class SnakeLadderSimulator {
	public static void main(String[] args) {
	int position1 = 0, position2 = 0, role1=0, role2=0;
	while(position1<100 && position2<100) 
	{
	int roll1 = (int)(Math.random()*(6-1))+1;
	int roll2 = (int)(Math.random()*(6-1))+1;
	//System.out.println("\nNumber after rolling die: " + roll);
	int turn1 = (int)(Math.random() * 10 ) % 3;
	int turn2 = (int)(Math.random() * 10 ) % 3;
	switch (turn1) 
	{
	case 1:
		System.out.println("Ladder!!");
		if(!((position1+roll1)>100))
			{ position1 += roll1;
						while(turn1 == 1) 
						{
								turn1 = (int)(Math.random() * 10 ) % 3;
								switch (turn1) 
								{
								case 1:
									System.out.println("Ladder!!");
									if(!((position1+roll1)>100))
										position1 +=roll1;
									else
										System.out.println("No turn");
									break;
								case 2:
									System.out.println("Snake!!");
									position1 -=roll1;
									if(position1<0)
										position1 = 0;
									break;
								default:
									System.out.println("No Play!!");
								}
						}
			}
		else
			System.out.println("No turn");
		break;
	case 2:
		System.out.println("Snake!!");
		position1 -=roll1;
		if(position1<0)
			position1 = 0;
		break;
	default:
		System.out.println("No Play!!");
			}
	role1++;
	System.out.println("Position of the player1: " + position1);
	
	
	switch (turn2) {
	case 1:
		System.out.println("Ladder!!");
		if(!((position2+roll2)>100))
			{position2 +=roll2;
							while(turn2 == 1) 
							{
									turn2 = (int)(Math.random() * 10 ) % 3;
									switch (turn2) {
									case 1:
										System.out.println("Ladder!!");
										if(!((position2+roll2)>100))
											position2 +=roll2;
										else
											System.out.println("No turn");
										break;
									case 2:
										System.out.println("Snake!!");
										position2 -=roll2;
										if(position2<0)
											position2 = 0;
										break;
									default:
										System.out.println("No Play!!");
											}
							}
			}
		else
			System.out.println("No turn");
		break;
	case 2:
		System.out.println("Snake!!");
		position2 -=roll2;
		if(position2<0)
			position2 = 0;
		break;
	default:
		System.out.println("No Play!!");
			}
	role2++;
	System.out.println("Position of the player2: " + position2);
	}
	if (position1<position2)
	{
	System.out.println("\n        Player2 wins the game!!!");
	System.out.println(" \n Number of roles to win: " + role2);
	}
	else 
	{
		System.out.println("\n        Player1 wins the game!!!");
		System.out.println(" \n Number of roles to win: " + role1);
	}
}
}
