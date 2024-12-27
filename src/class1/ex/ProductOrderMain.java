package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder a = new ProductOrder();
        a.productName = "두부";
        a.price = 2000;
        a.quantity = 2;
        productOrders[0] = a;

        ProductOrder b = new ProductOrder();
        b.productName = "김치";
        b.price = 5000;
        b.quantity = 1;
        productOrders[1] = b;

        ProductOrder c = new ProductOrder();
        c.productName = "콜라";
        c.price = 1500;
        c.quantity = 2;
        productOrders[2] = c;

        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            total += (productOrder.price * productOrder.quantity);
            System.out.println("상품명: " + productOrder.productName + "가격: " + productOrder.price + "수령: " + productOrder.quantity);
        }

        System.out.println("총 결제 금액: " +  total);
    }
}
