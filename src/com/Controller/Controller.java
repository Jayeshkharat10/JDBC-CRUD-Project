package com.Controller;

import java.util.Scanner;

import com.Services.Services;

public class Controller {
	public static void main(String[] args) throws Exception {
		System.out.println("1.Insert data"+"              "+" 2. update data ");
		System.out.println("3.show data "+"               "+" 4. delete data ");
		System.out.println("select your operation :  ");
		Scanner ss= new Scanner(System.in);
		int n=ss.nextInt();
		
		Services sc = new Services();
		
		if(n==1) {
			sc.Insert();
		}else if(n==2) {
		 
			sc.Update();
		}else if(n==3) {
			
			sc.Select();
		}else if(n==4) {
			
			sc.Delete();
			
		}else {
			System.out.println(" invalid input ....");
		}
		
		
		
		
	}

}
