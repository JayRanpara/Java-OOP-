import java.util.Scanner;

public class cricket{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String team[] = new String[2];
        for(int i =0; i<team.length; i++) {
            System.out.println("enter"+(i+1)+" team name = ");
            team[i] = sc.nextLine();
        }
        System.out.println("enter number of over = ");
        int noOfOver = sc.nextInt();

        int scoreCard[][][] = new int[2][noOfOver][];

        for(int i=0; i<scoreCard.length; i++) {//no of ing
            for(int j = 0; j<scoreCard[i].length; j++) {//no of over
                System.out.println("enter no.of ball in inning "+(i+1));
                int temp = sc.nextInt();
                scoreCard[i][j] = new int[temp];
                for(int k = 0; k<temp; k++) {//no of ball
                    System.out.println("enter "+(i+1)+" inning "+(j+1)+" over "+(k+1)+" ball");

                    scoreCard[i][j][k]= sc.nextInt();
                }
            }
        }

        for(int i =0; i<scoreCard.length; i++){
            int totalRun = 0;
            int wicket = 0;
            int extra = 0;
            for(int j =0; j<scoreCard[i].length; j++) {
                for(int k=0; k<scoreCard[i][j].length; k++) {
                    if(scoreCard[i][j][k] == -61) {
                        extra++;
                        totalRun++;
                    }
                    else if(scoreCard[i][j][k] == -62) {
                        extra++;
                        totalRun++;
                    }
                    else if(scoreCard[i][j][k] == -51) {
                        wicket++;
                    }
                    else {
                        totalRun+=scoreCard[i][j][k];
                    }
                }
                System.out.println("Team "+team[i]+" = "+totalRun+"/"+wicket+ "("+(j+1)+") over with extra"+extra);
            }
        }
    }
}