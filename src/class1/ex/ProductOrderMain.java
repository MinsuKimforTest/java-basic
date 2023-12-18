package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담은 배열 생성
        //상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        //상품 주문 정보와 최종 금액 출력
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "1";
        order1.price = 1000;
        order1.quantity = 2;

        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "2";
        order2.price = 2000;
        order2.quantity = 3;

        productOrders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "2";
        order3.price = 3000;
        order3.quantity = 4;

        productOrders[2] = order3;

        int value = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : "+productOrder.productName + " 가격 : "+productOrder.price + " 수량 : "+productOrder.quantity);
            value += productOrder.price* productOrder.quantity;
        }

        System.out.println("총 합 = " + value);
    }
}
