import model.Datasource;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        datasource.close();
    }
}
