package PracticeQuestions_all;

public class Show implements Printable{
    private String content;

    public Show(String content) {
        this.content = content;
    }

    @Override
    public void printing() {
        System.out.println("printing document: "+content);
    }
}
