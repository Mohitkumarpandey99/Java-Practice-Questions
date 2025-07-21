public class thirteen {
    // compound intrest p*((1+r/100)^t)-p
    public static void main(String[] args) {
    float principal = 20.6f;
    float rate = 25.22f;
     float time = 3.5f;   
     Double ci = principal*Math.pow((1+rate/100),time)-principal;
     System.out.println("the CI is: " + String.format("%.2f", ci));//way to show only two digit after .
    }
}
