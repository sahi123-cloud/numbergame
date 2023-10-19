import java.util.*;
class game{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random random=new Random();
        int computersNumber=random.nextInt(100)+1;
        int count=0;
        System.out.println(computersNumber);
        while(true){
        System.out.println("Enter The Number You Guess between 1 to 100");
        count++;
        if(count==6){
            System.out.println("Number Of Attempts Exceeded ..Start Again");
            break;
        }
        int playerGuess=s.nextInt();
        if(playerGuess==computersNumber){
            System.out.println("Hurray!!! You Won It"+ "  "+"Your Score is "+" "+(5-count));
            break;
        }
        else if(playerGuess>computersNumber){
            System.out.println("Ooops! You Guessed So High");
        }
        else{
            System.out.println("Hmmm! You Guessed The Low Number");
        }
    }
    }
        
    }
