package CHALLANGES.lecture_code.kgcoding.Challange102;

public class testingLight {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(LightColour.RED);
        TrafficLight yellow = new TrafficLight(LightColour.YELLOW);
        TrafficLight Green = new TrafficLight(LightColour.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        Green.start();

    }
}
