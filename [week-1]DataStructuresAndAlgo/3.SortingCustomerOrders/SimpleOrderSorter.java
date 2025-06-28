public class SimpleOrderSorter {

    static class Order {
        String id;
        String customer;
        double price;

        public Order(String id, String customer, double price) {
            this.id = id;
            this.customer = customer;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        Order[] orders = {
            new Order("101", "Alice", 450.99),
            new Order("102", "Bob", 125.50),
            new Order("103", "Charlie", 320.75)
        };

        System.out.println("Original orders:");
        printOrders(orders);

        bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        printOrders(orders);

        orders = new Order[]{
            new Order("101", "Alice", 450.99),
            new Order("102", "Bob", 125.50),
            new Order("103", "Charlie", 320.75)
        };

        quickSort(orders, 0, orders.length-1);
        System.out.println("\nAfter Quick Sort:");
        printOrders(orders);
    }

    static void bubbleSort(Order[] orders) {
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders.length -1 ; j++) {
                if (orders[j].price > orders[j + 1].price) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].price <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o.id + " - " + o.customer + " - " + o.price);
        }
    }
}
