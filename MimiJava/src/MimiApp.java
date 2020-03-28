import java.util.Scanner;
import java.util.Random;
//import java.io.*; 
//import java.lang.*; 
//import java.util.*; 
//import java.util.ArrayList;
//import java.util.List;
public class MimiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfile x=new readfile();
		word[] list=new word[0];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("nan kai desu ka? ");
		int min=50;
		int max=100;
		
		int dainanka = keyboard.nextInt();
		x.openFile(dainanka);
		list=x.readFile(list);
		x.closeFile();
		int i,j;
		do {
			System.out.println("More? ");
			j = keyboard.nextInt();
	        System.out.println("Random value in int from "+min+" to "+max+ ":");
	        int random_int = (int)(Math.random() * (max - min + 1) + min);
	        System.out.println("\n\n\n\n"+list[random_int].getImi()+"\n\n\n\n");
	        System.out.println("Show? ");
			j = keyboard.nextInt();
			if(j==1) {
				System.out.println("\n\n\n\n"+list[random_int].getYomikata()+"\n\n\n\n");
			}
		}
		while(j!=2);
		for (i=0;i<list.length;i++) {
			System.out.println("lord satan "+list[i].getYomikata()+" "+list[i].getImi());
		}
		keyboard.close();
	}
}
