package CHALLANGES.lecture_code.kgcoding.Challange102;

public enum LightColour {
    RED(9000),
    YELLOW(1000),
    GREEN(5000);

    private final int waitTime;

    LightColour(int waitTime) {
        this.waitTime = waitTime;
    }
    public int getWaitTime() {
        return waitTime;
    }
}
