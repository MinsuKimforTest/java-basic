package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int i) {
        System.out.println("main1 start");
        Data data = new Data(10);
        method2(data);
        System.out.println("main1 end");
    }

    static void method2(Data data) {
        System.out.println("main2 start");
        System.out.println(data.getValue());
        System.out.println("main2 end");
    }
}
