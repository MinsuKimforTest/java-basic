package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메시드 호출 전 : a = " + a);
        int b = changePrimitive(a);
        System.out.println("메시드 호출 전 : a = " + b);
    }

    static int changePrimitive(int x){
        x = 20;
        return x;
    }
}
