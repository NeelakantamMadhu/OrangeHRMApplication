package com.DecisionMakingStatement;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int WeekDay= 6;
		switch(WeekDay) {
		case 1:
		    System.out.println("MonDay");
		    break;
		case 2:
			System.out.println("tuseDay");
			break;
		case 3:
			System.out.println("wednesDay");
			break;
		case 4:
			System.out.println("thursDay");
			break;
		case 5:
			System.out.println("friDay");
			break;
		case 6:
			System.out.println("saturDay");
			break; //will terminate the program execution right away
		case 7:
			System.out.println("sunDay");
			
			default:
				System.out.println("NOT Matching With Any of the Give Expression");
				break;
		
		
		
		}

	}
	}
