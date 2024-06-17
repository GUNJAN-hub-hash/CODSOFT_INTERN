import java.util.Scanner;
public class NumberGame{
      public static void main(String[]args){
         Scanner S  = new Scanner(System.in);
         int chances = 5;
         int finals  = 0;
         boolean playAgain = true;
         System.out.println("Welcome Friend!");
         System.out.println("Hey Friend you have about "+chances+" to win the game");
         while(playAgain){
            int rand=getrandN(1,100);
            boolean guess = false;
            for(int i=0;i<chances;i++){
                  System.out.println("Chances "+(i+1)+" Enter your guess: ");
                  int user = S.nextInt();
                  if(user==rand){
                        guess = true;
                        finals+=1;
                        System.out.println("Congratulation! You won the Game");
                        break;
                  }
                  else if(user>rand){
                        System.out.println("You Guessed Too High!");   
                  }
                  else{
                        System.out.println("You Guessed Too Low!");
                  }
            }
            if(guess==false){
                  System.out.println("Sorry Friend , You Lost Your Chances. The Number is "+rand);
            }
            System.out.println("Do you want to play Again ?");
            String A = S.next();
            playAgain = A.equalsIgnoreCase("yes");
         }
         System.out.println("Thank you Friend, Hope you Enjoyed it");
         System.out.println("Here is the Score "+finals);
      }
      public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
      }

}
