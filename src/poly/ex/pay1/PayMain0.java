package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true){
            System.out.println("결제수단을 입력하세요.");
            String option = scanner.nextLine();
            if(option.equals("exit")){
                System.out.println("종료합니다.");
                return;
            }
            System.out.println("결제 금액을 입력하세요.");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }
    }
}
