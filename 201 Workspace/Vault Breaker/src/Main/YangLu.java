package Main;

import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class YangLu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Yang Lu
		
		//Declared the scanner early on
		Scanner input = new Scanner(System.in);
		
		//Difficulty selection
		System.out.println("WELCOME TO HACKING 101!\nPlease choose a difficulty\nE = easy\nM = medium\nH = hard\nS = SUPER");
		String selection = input.nextLine();
		char difficulty = selection.charAt(0);
		
		//Every basic thing I need for program
		int x = 0, y = 0, width = 0, height = 0, precision = 1;
		int series[] = null;
		String endmsg = "nothing yet";
		String result = "nothing yet"; 
		Random insert = new Random();
		
		//Timer variables
		long sTime = 0;
		int bTime = 0;
		
		//Detection of which difficulty the user chooses
		switch(difficulty)
		{
			case 'e':
			case 'E':
			{
				//Same code layout for all levels
				
				//This sets how many numbers the array has, every multiple of 4 is another layer to the "firewall"
				series = new int [4];
				
				//The precision is used later to adjust the "hot-cold" ranges for vastly different number areas
				precision = 10;
				
				//Time allowed set here
				sTime = System.currentTimeMillis();
				bTime = 300000;
				
				//Custom ending for all difficulties
				endmsg = "You now know the basics of hacking";
				
				//Inserting the random numbers
				for(int count = 0; count<4; count++)
					series[count] = insert.nextInt(9);
				
				//General game user interface info
				System.out.println("You have accessed a simple home firewall to break through!");
				System.out.println("The gap needed should be between 0-9");
				
				//ends
				break;
			}
			
			case 'm':
			case 'M':
			{
				series = new int [28];
				precision = 5;
				sTime = System.currentTimeMillis();
				bTime = 600000;
				endmsg = "You are a fairly advanced hacker";
				for(int count = 0; count<28; count++)
					series[count] = insert.nextInt(30);
				System.out.println("You have accessed the personal bank account of a millionaire!");
				System.out.println("The gap needed should be between 0-30");
				break;
			}
			
			case 'h':
			case 'H':
			{
				series = new int [40];
				precision = 2;
				sTime = System.currentTimeMillis();
				bTime = 1200000;
				endmsg = "You are a hyper advanced hacker!!!";
				for(int count = 0; count<40; count++)
					series[count] = insert.nextInt(100);
				System.out.println("You are stopped in front of a large transnational corporation's firewall!");
				System.out.println("The gap needed should be between 0-100");
				break;
			}
			
			case 's':
			case 'S':
			{
				series = new int [100];
				precision = 1;
				sTime = System.currentTimeMillis();
				bTime = 1500000;
				endmsg = "YOU ARE THE WORLD'S BEST HACKER! CAPABLE OF SHUTTING DOWN AMERICA HOMELAND SECURITY!!!";
				for(int count = 0; count<100; count++)
					series[count] = insert.nextInt(1000);
				System.out.println("YOU HAVE BEEN HALTED BY THE AMERICAN HOMELAND SECURITY'S FIREWALL!!!");
				System.out.println("The gap needed should be between 0-1000");
				break;
			}
			default:
			{
				System.out.println("Defaulting to medium.");
				series = new int [40];
				precision = 2;
				sTime = System.currentTimeMillis();
				bTime = 1200000;
				endmsg = "You are a hyper advanced hacker!!!";
				for(int count = 0; count<40; count++)
					series[count] = insert.nextInt(100);
				System.out.println("You are stopped in front of a large transnational corporation's firewall!");
				break;
			}
		
		
		}
		
		
		//A bit more instructions and then the game begins!
		System.out.println("Try to achieve horizontal, vertical, width, and height synchronization to send your virus through!\nType in your guess and hit enter to submit it.");
		x = input.nextInt();
		y = input.nextInt();
		width = input.nextInt();
		height = input.nextInt();
		
		
		//Detection to see if the user got the number or not, as well as hot-cold
		
		//It has -3 because it uses 4 numbers consecutively, can't go over
		for(int count = 0; count < (series.length - 3); count++)
		{
			
			
			while(x != series[count]  ||  y != series[(count + 1)]  ||  width != series[(count + 2)]  ||  height != series[(count +3)])
			{
				//Everything must match in order to move on
				//Same code layout for everything
				if(x == series[count])
				{
					System.out.println("Horizontal synchronization achieved");
				}
				else
				{
					//Hot-cold detection
					//Precision is used here to give the user a more precise range to guess. As the difficulty increases, the precision gets less and more skill is required
					if(x >= (series[count] - (10/precision))  &&  x <= (series[count] + (10/precision)))
					{
						System.out.println("Horizontal synchronization extremely close");
					}
					else
					{
						if(x >= (series[count] - (50/precision))  &&  x <= (series[count] + (50/precision)))
						{
							System.out.println("General horizontal synchronization area located");
						}
						else
						{
							System.out.println("Horizontal synchronization failed");
						}
					}
				}
				
				
				if(y == series[(count + 1)])
				{
					System.out.println("Verticle synchronization achieved");
				}
				else
				{
					if(y >= (series[(count + 1)] - (10/precision))  &&  y <= (series[(count + 1)] + (10/precision)))
					{
						System.out.println("Verticle synchronization extremely close");
					}
					else
					{
						if(y >= (series[(count + 1)] - (50/precision))  &&  y <= (series[(count + 2)] + (50/precision)))
						{
							System.out.println("General verticle synchronization area located");
						}
						else
						{
							System.out.println("Verticle synchronization failed");
						}
					}
				}
				
				
				if(width == series[(count + 2)])
				{
					System.out.println("Width synchronization achieved");
				}
				else
				{
					if(width >= (series[(count + 2)] - (10/precision))  &&  width <= (series[(count + 2)] + (10/precision)))
					{
						System.out.println("Width synchronization extremely close");
					}
					else
					{
						if(width >= (series[(count + 2)] - (50/precision))  &&  width <= (series[(count + 2)] + (50/precision)))
						{
							System.out.println("General width synchronization area located");
						}
						else
						{
							System.out.println("Width synchronization failed");
						}
					}
				}
				
				
				if(height == series[(count + 3)])
				{
					System.out.println("Height synchronization achieved");
				}
				else
				{
					if(height >= (series[(count + 3)] - (10/precision))  &&  height <= (series[(count + 3)] + (10/precision)))
					{
						System.out.println("Height synchronization extremely close");
					}
					else
					{
						if(height >= (series[(count + 3)] - (50/precision))  &&  height <= (series[(count + 3)] + (50/precision)))
						{
							System.out.println("General height synchronization area located");
						}
						else
						{
							System.out.println("Height synchronization failed");
						}
					}
				}
				
				//After displaying hot-cold and is it equal, the user just enters it again with the help from that
				x = input.nextInt();
				y = input.nextInt();
				width = input.nextInt();
				height = input.nextInt();
				
				//Sets the rectangle code and the result-shows the user the answer each time they break through a layer
				Rectangle virus = new Rectangle(x,y,width,height);
				result = ("The successful virus entrance code is " + virus);
				
				//Timer check
				long cTime = System.currentTimeMillis();
				if(cTime>=(sTime + bTime))
				{
					System.out.println("Time's up!");
					endmsg = "You have failed!";
					result = "You did not locate the gap.";
					break;
				}
				
				
			}
			
			//Even if time was up, the previous loop ends goes into this one, so it needs to check again to break out so it won't print the result
			long cTime = System.currentTimeMillis();
			if(cTime>=(sTime + bTime))
			{
				break;
			}
			
			System.out.println(result);
			
		}
		
		//Final ending and advertisements!
		System.out.println(endmsg);
		System.out.println("This program was brought to you by Yang Lu");
		
		
		
		/*
WELCOME TO HACKING 101!
Please choose a difficulty
E = easy
M = medium
H = hard
S = SUPER
e
You have accessed a simple home firewall to break through!
The gap needed should be between 0-9
Try to achieve horizontal, vertical, width, and height synchronization to send your virus through!
Type in your guess and hit enter to submit it.
0
0
0
0
Horizontal synchronization extremely close
General verticle synchronization area located
General width synchronization area located
General height synchronization area located
1
1
1
1
Horizontal synchronization achieved
General verticle synchronization area located
General width synchronization area located
General height synchronization area located
1
2
2
2
Horizontal synchronization achieved
General verticle synchronization area located
General width synchronization area located
Height synchronization extremely close
1
3
3
3
Horizontal synchronization achieved
Verticle synchronization extremely close
Width synchronization extremely close
Height synchronization achieved
1
4
4
3
The successful virus entrance code is java.awt.Rectangle[x=1,y=4,width=4,height=3]
You now know the basics of hacking
This program was brought to you by Yang Lu



-------------------------ANOTHER TRIAL(default to medium)------------------------------

WELCOME TO HACKING 101!
Please choose a difficulty
E = easy
M = medium
H = hard
S = SUPER
5t89rgfvy9hy89t45
Defaulting to medium.
You are stopped in front of a large transnational corporation's firewall!
Try to achieve horizontal, vertical, width, and height synchronization to send your virus through!
Type in your guess and hit enter to submit it.


//(I'm bad at this game so I didn't play it through this time)


------------------------ANOTHER TRIAL(out of time)-----------------------------

WELCOME TO HACKING 101!
Please choose a difficulty
E = easy
M = medium
H = hard
S = SUPER
e
You have accessed a simple home firewall to break through!
The gap needed should be between 0-9
Try to achieve horizontal, vertical, width, and height synchronization to send your virus through!
Type in your guess and hit enter to submit it.
1
5
3
7
General horizontal synchronization area located
General verticle synchronization area located
General width synchronization area located
Height synchronization failed
3
2
4
8
General horizontal synchronization area located
Verticle synchronization failed
Width synchronization extremely close
Height synchronization failed
4
3
56
8
General horizontal synchronization area located
General verticle synchronization area located
Width synchronization failed
Height synchronization failed
1
2
34
2
General horizontal synchronization area located
Verticle synchronization failed
Width synchronization failed
General height synchronization area located
4

3
4
6
General horizontal synchronization area located
General verticle synchronization area located
Width synchronization extremely close
Height synchronization failed
2
3
4
5
Time's up!
You have failed!
This program was brought to you by Yang Lu

		 */
	}

}
