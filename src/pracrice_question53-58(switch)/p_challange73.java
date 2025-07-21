public class p_challange73 {
    int rolldice(){
        double random = Math.random()*6;
        return (int)Math.ceil(random);
    }
    public static void main(String[] args) {
        p_challange73 dice = new p_challange73();
        for (int i = 0; i < 1 ; i++) {
             System.out.println(dice.rolldice()); 
        }
      
    }
}
