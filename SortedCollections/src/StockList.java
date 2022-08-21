import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public StockItem get(String key) {
        return  list.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }
    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(list);
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if (inStock != item) {
                item.adjustStock(inStock.availableQuantity());
            }
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if (inStock != null && quantity > 0) {
            return inStock.finalizeStock(quantity);
        }
        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if (inStock != null && quantity > 0) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if (inStock != null && quantity > 0) {
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nStock List\n");
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();
            s.append(stockItem).append(", There are ").append(stockItem.availableQuantity()).append(" in stock. Value of items: ");
            s.append(String.format("%.2f", itemValue)).append("\n");
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}
