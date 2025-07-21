import java.util.Scanner;

class no_guessGame_74 {
    int random;

    public no_guessGame_74() {
        random = (int) Math.ceil(Math.random()*100);//constructor 
    }  
         
    /**
     * guessdnum = the no that user will guess 
     * - negative if guessed number  is smaller
     * + positive if guessed number  is greater
     * 0 if guessed nu is equal
     * @param args
     */
    int guesnum(int guessednum){
        return guessednum - random;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        no_guessGame_74 gussingGame = new no_guessGame_74();
        System.out.println("welcome to the number guessing game.guess the number between 1 to 100");
        
        int guessednum ;
        int result ;
        do {
            System.out.println("guess the number:");
            guessednum = input.nextInt();
            result = gussingGame.guesnum(guessednum);
            if (result == 0) {
                System.out.println("you have guessed the correct number!!!");
            }
            else if (result<0) {
                System.out.println("guess higher");
            }
            else{
                System.out.println("guess lower");
            }
                
            
        } while (result != 0 );
    }
}  


