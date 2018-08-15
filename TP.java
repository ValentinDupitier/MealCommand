package com.capgemini.tp.tp1;
import java.util.Scanner;

public class TP1 {

	public static void main(String[] args) {
		System.out.print("Utilisez + ou - pour rentrer les valeurs du cadenas" );
		Scanner sc = new Scanner(System.in);
		
		int currentNb =0;
		
		String userChoice = sc.next();
		System.out.print(userChoice);
		
		if (userChoice == "+") {
			currentNb +=1;
			
		}else if (userChoice == "-") {
			currentNb -=1;
		}
		
		sc.close();
	}

}
