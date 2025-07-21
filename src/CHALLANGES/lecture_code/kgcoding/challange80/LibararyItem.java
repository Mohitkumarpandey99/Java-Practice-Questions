package CHALLANGES.lecture_code.kgcoding.challange80;

public class LibararyItem {
    private String itemId;
    private String title;
    private String author;
    private boolean ischeckedout = false;

    public boolean isCheckout() {
        if (ischeckedout) {
            System.out.println("book already borrowed");
            return false;
        } else {
            ischeckedout = true;
            System.out.println("checking out");
            return true;
        }
    }

    public boolean isReturning() {
        if (!ischeckedout) {
            System.out.println("already in library!!");
            return false;

        } else {
            ischeckedout = false;
            System.out.println("returning");
           return true;
        }
        }

    public boolean isIscheckedout(){
        return ischeckedout;
    }
          //  if (isReturnning()) {
       // System.out.println("Thanks for returning the book!");
//} else {
     //   System.out.println("This book was already in the library.");
  //  }

}
