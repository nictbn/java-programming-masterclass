public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishwasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
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
