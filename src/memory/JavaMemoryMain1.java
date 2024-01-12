package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("main1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("main1 end");
    }

    static void method2(int m2) {
        System.out.println("main2 start");
        System.out.println("main2 end");
    }
}
