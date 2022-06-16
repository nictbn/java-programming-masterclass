import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // Highly Illegal :)
//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }


        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myInt.intValue();

        ArrayList<Double> doubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            doubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < doubleValues.size(); i++) {
            double value = doubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            doubleValues.add(dbl);
        }

        for (int i = 0; i < doubleValues.size(); i++) {
            double value = doubleValues.get(i);
            System.out.println(i + " --> " + value);
        }

    }
}
