public class Prog7{
	public static void main(String[]args){
		int numb=12345;
		int total=0;
		int dig=0;
		while(numb>0){
			dig=numb%10;
			total=total+dig;
		numb=numb/10;}
System.out.println("sum is:"+total);}}