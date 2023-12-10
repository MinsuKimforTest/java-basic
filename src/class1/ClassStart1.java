package class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: "+student1Name + " 나이 : "+student1Age + " 성적 : "+student1Grade);
        System.out.println("이름: "+student2Name + " 나이 : "+student2Age + " 성적 : "+student2Grade);

        String[] student1 = {"학생1", "15", "90"};
        String[] student2 = {"학생2", "16", "80"};

        for (int i = 0; i < 1; i++) {
            System.out.println("이름: "+student1[0] + " 나이 : "+student1[1] + " 성적 : "+student1[2]);
            System.out.println("이름: "+student2[0] + " 나이 : "+student2[1] + " 성적 : "+student2[2]);
        }

    }
}
