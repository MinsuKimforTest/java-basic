package poly.ex;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String Message) {
        System.out.println("페이스북을 발송합니다 : "+Message);
    }

}
