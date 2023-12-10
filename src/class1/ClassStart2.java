package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        String[] student1 = {"학생1", "15", "90"};
        String[] student2 = {"학생2", "16", "80"};

        for (int i = 0; i < 1; i++) {
            System.out.println("이름: "+student1[0] + " 나이 : "+student1[1] + " 성적 : "+student1[2]);
            System.out.println("이름: "+student2[0] + " 나이 : "+student2[1] + " 성적 : "+student2[2]);
        }

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: "+studentNames[i] + " 나이 : "+studentAge[i] + " 성적 : "+studentGrade[i]);
        }

    }
}
