package CHALLANGES.lecture_code.kgcoding.Challange102;

public class TrafficLight extends  Thread {

        private final LightColour colour;

    public TrafficLight(LightColour colour) {
        this.colour = colour;
    }

    @Override
    public void run() {
        System.out.printf("\n%s Active",colour);
        try {
            Thread.sleep(colour.getWaitTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n%s Inactive",colour);
    }
}

