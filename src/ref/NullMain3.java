package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData = " + bigData.count);
        System.out.println("bigData = " + bigData.data); //참조형은 초기값 0

        System.out.println("bigData = " + bigData.data.value);
    }
}
