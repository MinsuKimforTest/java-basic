package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        Parent parent1 = new Child();
        parent1.parentMethod();

        Child child = (Child) new Parent();
        child.childMethod();
        child.parentMethod();
 
        Child child1 = new Child();
        child1.parentMethod();
        child1.childMethod();

    }
}
