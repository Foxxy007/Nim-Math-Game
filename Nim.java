package Projects.Nim;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num=randInt(10,50);
        // num=13;

        System.out.print("Player 1:");
        String name1 = sc.nextLine();
        System.out.print("Player 2:");
        String name2 = sc.nextLine();

        double choice = ((int)(Math.random()*2))+1;
        boolean isFinished=false;

        int taken=0;

        while(!isFinished){
            //1 st turn.
            System.out.println("There are "+num+" pieces on the table.");
            System.out.print((choice==1)?name1:name2+", how many do you take away? ");
            taken=(int)sc.nextInt();//requesting of the amount to be taken
            while((taken<1)){
                System.out.print("ERROR: less than 1 taken, take more next time.");
                taken=(int)sc.nextInt();
            }
            while(taken>(num/2)){
                System.out.print("ERROR: more than half taken, take less next time.");
                taken=(int)sc.nextInt();
            }
            num-=taken;
            if(num==1){// wining condition
                System.out.print((choice==1)?name1:name2+" won!\n");
                isFinished=true;
                break;
            }
            //2 nd turn.
            System.out.println("There are "+num+" pieces on the table.");
            System.out.print((choice==1)?name2:name1+", how many do you take away? ");
            taken=(int)sc.nextInt();//requesting of the amount to be taken
            while((taken<1)){
                System.out.print("ERROR: less than 1 taken, take more next time.");
                taken=(int)sc.nextInt();
            }
            while(taken>(num/2)){
                System.out.print("ERROR: more than half taken, take less next time.");
                taken=(int)sc.nextInt();
            }
            num-=taken;
            if(num==1){// wining condition
                System.out.print((choice==1)?name2:name1+" won!\n");
                isFinished=true;
                break;
            }
        }
    }
    public static int randInt(int start, int end){
        return ((int)(Math.random()*(end-start))+start);
    }
}
