
import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[]args){
     System.out.println("enter the name of teams");
        Scanner s=new Scanner(System.in);
     System.out.println("team 01:");

     String t1=s.nextLine();
        System.out.println("team 02:");

        String t2=s.nextLine();
        String []team1_play={"p1","p1","p1","p1","p1","p1","p1","p1","p1","p1","p1"};
        String []team2_play={"p1","p1","p1","p1","p1","p1","p1","p1","p1","p1","p1"};
        Random r=new Random();

        int toss=r.nextInt(2);
        if(toss==1){
            System.out.println("team 01 would do batting first");
        }
        else{
            System.out.println("team 02 would do batting first");
        }
        int team01_score=0;
        int team02_score=0;
        int team01_players=11;
        int team02_players=11;
        int balls=20*6;
        int team01_wicket=0;
        int team01_outs=0;
        int team02_wicket=0;
        int team02_outs=0;
        while(team01_players>0 && balls>0){
            boolean w=r.nextBoolean();
            if(w==true){
                team01_wicket++;
                team01_players--;
                balls--;
            }
            else{
                boolean o=r.nextBoolean();
                if(o==true){
                    team01_outs++;
                    team01_players--;
                    balls--;
                }
                else{
                     team01_score= team01_score+r.nextInt(7);
                     balls--;
                }

            }

        }

        int balls_t2=20*6;
       // boolean w=false;
       // boolean o=false;
        while(team02_players>0 && balls_t2>0){
            boolean w=r.nextBoolean();
            if(w==true){
                team02_wicket++;
                team02_players--;
                balls_t2--;
            }
            else{
                boolean o=r.nextBoolean();
                if(o==true){
                    team02_outs++;
                    team02_players--;
                    balls_t2--;
                }
                else{
                    team02_score= team02_score+r.nextInt(7);
                    balls_t2--;
                }

            }

        }

System.out.println("team 01 data");
System.out.println("wickets:"+team01_wicket);
        System.out.println("wickets:"+team01_wicket);
        System.out.println("outs:"+team01_outs);
        System.out.println("balls:"+balls);
        System.out.println("runs:"+team01_score);
        float strike_t1=team01_score/(balls*100);
        System.out.println("strike rate:"+strike_t1);
        System.out.println("total score of "+t1+" is "+team01_score+" in "+ (balls/6)+" overs");
        //*******************t2**************************
        System.out.println("team 02 data");
        System.out.println("wickets:"+team02_wicket);
        System.out.println("wickets:"+team02_wicket);
        System.out.println("outs:"+team02_outs);
        System.out.println("balls:"+balls_t2);
        System.out.println("runs:"+team02_score);
        float strike_t2=team02_score/(balls_t2*100);
        System.out.println("strike rate:"+strike_t2);
        System.out.println("total score of "+t2+" is "+team02_score+" in "+(balls_t2/6)+" overs");
        if(team01_score>team02_score){
            System.out.println(t1+ " is winner");
        }
        if(team01_score<team02_score){
            System.out.println(t2+ " is winner");
        }


    }}