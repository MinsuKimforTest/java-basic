package poly.ex.pay1;

public class NewPay implements PayInterface{
    @Override
    public boolean pay(int amount) {
        System.out.println("NEW페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public void Account() {

    }
}
