public class finalkeyword76 {
    final int noOfWheels;
    final String model;
    final String engineInLtr;

    public finalkeyword76(int noOfWheels, String model, String engineInLtr) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLtr = engineInLtr;
    }
  public static void main(String[] args) {
    finalkeyword76 car = new finalkeyword76(4, "rangerover velar", "5.6");
    System.out.println("no of wheels: "+car.noOfWheels);
    System.out.println("model: "+car.model);
    System.out.println("engine info: "+car.engineInLtr);
  }
    
}
