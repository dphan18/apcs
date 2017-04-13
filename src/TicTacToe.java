//Author:  Miss Hines and Daniel Phan
//Tic-tac-toe is a classic game with x's and o's.  Players take turns
//filling in a 3 by 3 board and aim to get three of the same symbol
//in a row.

import java.util.*;
import java.io.*;

public class TicTacToe {
	private static char [][] board= new char [3][3];  //keeps track of the board
	private static Scanner keys; //reads in user input from the keyboard
	//main method is the "bootstrap" method that provides the main game menu.
	//each item in the menu is contained in a helper method.
	public static void main(String[] args) {
		keys = new Scanner(System.in);
		boolean done = false;
		while(!done) { //main game loop
			System.out.println("Welcome to tic-tac-toe!");
			//game menu
			System.out.println("Choose one of the following options:");
			System.out.println("A: 2 Player Tic-Tac-Toe");
			System.out.println("B: 1 Player Tic-Tac-Toe, against the computer");
			
			String decision = keys.nextLine();
				if(decision.trim().toUpperCase().equals("A")) {
					twoPlayer();
				}
				else{
						onePlayer();
				}
			keys.nextLine();
			//when they are finished playing, it will return to here
			System.out.println("Do you want to play again? (Y/N)");
			String playAgain = keys.nextLine().trim().toUpperCase();
				if(playAgain.equals("Y")) {
				done = false;
				}
				else {
				System.out.println("Good bye!");
				done = true; 
				}
		}
	}
	//Implements the code for two player tic-tac-toe.
	//Pre-condition: None
	//Post-condition: Game is played and completed when method exits.
	private static void twoPlayer() {
	//initializes/resets the board
	for (int i=0; i<3;i++){
		for (int j=0;j<3;j++){
			board[i][j]=' ';
		}
	}
		System.out.println("Player 1 will be X. Player 2 will be O.");
		printBoard();
		
		//sets the maximum number of turns
		for(int i=0;i<9;i++){
			//even numbers are player 1
			if (i%2==0){
			System.out.println("Player 1, what is your move? (1-9)");
			int move = keys.nextInt();
				//numbers input must be 1-9
				if (move>-1&&move<10){
					//numbers must be not be used already
					if (board[(move-1)/3][(move-(3*((move-1)/3)))-1]==' '){
						//places X in the designated spot
						board[(move-1)/3][(move-(3*((move-1)/3)))-1]='X';
						printBoard();
						//checks to see if they won
						if (isWinner()==true){
							System.out.println("Player 1 Wins!");
							i+=9;
						}
					}
					else {
						System.out.println("Invalid move: Try again");
						i-=1;
					}
				}	
				else{
					System.out.println("Invalid move: Try again");
					i-=1;
				}
			}
			//player 2
			else{
			System.out.println("Player 2, what is your move? (1-9)");
			int move2 = keys.nextInt();
				//numbers must be 1-9
				if (move2>-1&&move2<10){
					//numbers must be not be used already
					if (board[(move2-1)/3][(move2-(3*((move2-1)/3)))-1]==' '&&move2>-1&&move2<10){
						//places O in designated spot
						board[(move2-1)/3][(move2-(3*((move2-1)/3)))-1]='O';
						printBoard();
						//checks to see if they won
						if (isWinner()==true){
							System.out.println("Player 2 Wins!");
							i+=8;
						}
					}
					else{
						System.out.println("Invalid move: Try again");
						i-=1;
					}
				}
				else{
					System.out.println("Invalid move: Try again");
					i-=1;
				}
			}
			if (i==8){
				//if there are no spaces left it is a tie
				System.out.println("Tie Game!");
			}
		}
		
	}
	
	//Determines whether or not there is a winner yet.
	//Pre-condition: board has been initialized with chars in it.
	//Post-condition: returns true if there is a winner, and false otherwise.
	private static boolean isWinner() {
		if (board[0][0]!=' '&&board[0][0]==board[0][1]&&board[0][1]==board[0][2]){
			return true;
		}
		else if (board[1][0]!=' '&&board[1][0]==board[1][1]&&board[1][1]==board[1][2]){
			return true;
		}
		else if (board[2][0]!=' '&&board[2][0]==board[2][1]&&board[2][1]==board[2][2]){
			return true;
		}
		else if (board[0][0]!=' '&&board[0][0]==board[1][0]&&board[1][0]==board[2][0]){
			return true;
		}
		else if (board[0][1]!=' '&&board[0][1]==board[1][1]&&board[1][1]==board[2][1]){
			return true;
		}
		else if (board[0][2]!=' '&&board[0][2]==board[1][2]&&board[1][2]==board[2][2]){
			return true;
		}
		else if (board[0][0]!=' '&&board[0][0]==board[1][1]&&board[1][1]==board[2][2]){
			return true;
		}
		else if(board[0][2]!=' '&&board[0][2]==board[1][1]&&board[1][1]==board[2][0]){
			return true;			
		}
		else return false; 
	}
	
	//Prints out the current board.
	//Pre-condition: board has been initialized with chars in it.
	//Post-condition: prints out the current game board
	private static void printBoard() {
		for(int i=0;i<3;i++){
			System.out.print(" "+board[0][i]+" ");
			if (i<2){
				System.out.print("|");				
			}
		}
		System.out.println();
		System.out.println("-----------");
		for(int i=0;i<3;i++){
			System.out.print(" "+board[1][i]+" ");
			if (i<2){
				System.out.print("|");				
			}
		}
		System.out.println();
		System.out.println("-----------");
		for(int i=0;i<3;i++){
			System.out.print(" "+board[2][i]+" ");
			if (i<2){
				System.out.print("|");				
			}
		}
		System.out.println();
	}
	
	//Implements the code for one player tic-tac-toe.
	//Pre-condition: None
	//Post-condition: Game is played and completed when method exits.
	private static void onePlayer() {
		System.out.println("You may go first. You'll be X.");
		//initializes/resets board
		for (int i=0; i<3;i++){
			for (int j=0;j<3;j++){
				board[i][j]=' ';
			}
		}
				printBoard();
			
			for(int i=0;i<9;i++){
				//player 1 same as above
				if (i%2==0){
				System.out.println("Player 1, what is your move? (1-9)");
				int move = keys.nextInt();
					if (move>-1&&move<10){
						if (board[(move-1)/3][(move-(3*((move-1)/3)))-1]==' '&&move>-1&&move<10){
							board[(move-1)/3][(move-(3*((move-1)/3)))-1]='X';
							if (isWinner()==true){
								System.out.println("Player 1 Wins!");
								printBoard();
								i+=9;
							}
						}
						else {
							System.out.println("Invalid move: Try again");
							i-=1;
						}
					}
					else{
					System.out.println("Invalid move: Try again");
					i-=1;
					}
				}
				//computer chooses a random number until it finds an empty space
				else{
				int move2 = (int)(Math.random()*10);
					if (board[(move2-1)/3][(move2-(3*((move2-1)/3)))-1]==' '){
						board[(move2-1)/3][(move2-(3*((move2-1)/3)))-1]='O';
						printBoard();
						if (isWinner()==true){
							//determines if the computer won
							System.out.println("Computer Wins!");
							i+=8;
						}
					}
					else{
						i-=1;
					}
				}
				//if there are no spaces left it is a tie
				if (i==8){
					System.out.println("Tie Game!");
				}
			}
		}
	}