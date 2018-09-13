import java.util.Scanner;
/************************************************************************************************************
Purpose:  This class is the method main for Lab 1. 
Author:  Linda Crane and Evan Legault
Course: F2018 - CST8130
Lab Section: CST8130                                      
 *************************************************************************************************************/


public class Lab1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		int assessments;
		System.out.println("How many assessments in this course - must be greater than 0?");
		assessments = keyboard.nextInt();
		
		Lab1 labs = new Lab1();
		labs.inputDate();
		labs.MyDate();
	}
}