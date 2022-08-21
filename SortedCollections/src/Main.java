import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");

        sellItem(timsBasket, "Car", 1);

        System.out.println(timsBasket);sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        if (sellItem(timsBasket, "Car", 1) !=1 ) {
            System.out.println("There are no more cars in stock");
        }
        System.out.println(timsBasket);

        sellItem(timsBasket, "Spanner", 5);

        sellItem(timsBasket, "Juice", 4);
        sellItem(timsBasket, "Cup", 12);
        sellItem(timsBasket, "Bread", 1);
//        System.out.println(timsBasket);

//        System.out.println(stockList);
        Basket basket = new Basket("Customer");
        sellItem(basket,"Cup", 100);
        sellItem(basket,"Juice", 5);
        removeItem(basket,"Cup", 1);
        System.out.println(basket);

        removeItem(timsBasket, "Car", 1);
        removeItem(timsBasket, "Cup", 9);
        removeItem(timsBasket, "Car", 1);
        System.out.println("Cars removed: " + removeItem(timsBasket, "Car", 1));
        System.out.println(timsBasket);

        //remove all items from Tim's basket
        removeItem(timsBasket, "Bread", 1);
        removeItem(timsBasket, "Cup", 3);
        removeItem(timsBasket, "Juice", 4);
        removeItem(timsBasket, "Cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);
//        temp = new StockItem("Pen", 1.12);
//        stockList.items().put(temp.getName(), temp);
        StockItem car = stockList.items().get("Car");
        if (car != null) {
            car.adjustStock(2000);
        }
        if (car != null) {
            stockList.get("Car").adjustStock(-1000);
        }
        System.out.println(stockList);
//        for (Map.Entry<String, Double> price : stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkout(timsBasket);
        System.out.println(timsBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
