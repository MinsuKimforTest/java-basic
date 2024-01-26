package final1;

public class ConstantMain1 {

    static final int VALUE = 1000;
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : "+VALUE);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > VALUE) {
            System.out.println("대기자로 등록합니다");

        }else{
            System.out.println("참여합니다");
        }
    }
}
