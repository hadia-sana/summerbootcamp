public class Prog8{
	
	public static void main(String[]args){
		int totalMen_prcnt=52;
		int totalLit_prcnt=48;
		int litMen_prcnt=35;
		int totalPop=80000;
		int illitMen_prcnt= totalMen_prcnt - litMen_prcnt;
		int totalWomen=totalPop-(((float)totalMen_prcnt/100)*totalPop);
		int totalWomen_prcnt=((float)totalWomen/totalPop)*100;
		int litWomen_prcnt=totalLit_prcnt-litMen_prcnt;
		int illitWomen_prcnt=totalWomen_prcnt-litWomen_prcnt;
		System.out.println("total literate men:"+litMen_prcnt);
		System.out.println("total literate women:"+litWomen_prcnt);
		System.out.println("total illiterate men:"+illitMen_prcnt);
		System.out.println("total illiterate women:"+illitWomen_prcnt);
}}