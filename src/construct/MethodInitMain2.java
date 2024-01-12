package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("user1", 15, 90);

        MemberInit member2 = new MemberInit("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name : "+member.name + " age : "+ member.age + " grade : "+member.grade);
        }

    }
}
