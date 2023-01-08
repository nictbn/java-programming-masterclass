public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getBrewMaster().brewCoffee();

        kitchen.getDishwasher().setHasWorkToDo(true);
        kitchen.getDishwasher().doDishes();

        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getIceBox().orderFood();
    }
}
