public class SmartKitchen {
    private final CoffeeMaker brewMaster;
    private final Refrigerator iceBox;
    private  final DishWasher dishwasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
    }

    public void setKitchenState(boolean coffeeMachineHasWork, boolean fridgeHasWork, boolean dishWasherHasWork) {
        brewMaster.setHasWorkToDo(coffeeMachineHasWork);
        iceBox.setHasWorkToDo(fridgeHasWork);
        dishwasher.setHasWorkToDo(dishWasherHasWork);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }
}
