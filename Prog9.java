import java.util.Scanner;

public class Prog9{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	int hund=0;
	int fifty=0;
	int ten=0;
		int numb=s.nextInt();
		while(numb>=10){
			if(numb>=100){
				hund++;
				numb=numb-100;
			}
			else if(numb>=50){
				fifty++;
				numb=numb-50;
			}
			else{
				ten++;
				numb=numb-10;
			}
		}
		System.out.println("hundreds:"+hund);
		System.out.println("fifty:"+fifty);
		System.out.println("ten:"+ten);
	
	
	}}