package class1.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요.: ");
        int i = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[i];

        for (int a = 0; a < productOrders.length; a++){
            System.out.println((a + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[a] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " +  totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders){
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + "가격: " + productOrder.price + "수령: " + productOrder.quantity);
        }


    }

    static int getTotalAmount(ProductOrder[] productOrders){
        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            total += (productOrder.price * productOrder.quantity);
        }

        return total;
    }
}
