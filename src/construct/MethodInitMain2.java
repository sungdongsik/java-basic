package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1, "user1", 15, 90);

        MemberInit memberInit2 = new MemberInit();
        initMember(memberInit2, "user2", 16, 80);


        MemberInit[] members = {memberInit1, memberInit2};

        for(MemberInit member : members){
            System.out.println("이름: " + member.name + "나이: " + member.age + "성적: " + member.grade);
        }
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade){
        memberInit.name = name;
        memberInit.age =  age;
        memberInit.grade = grade;
    }
}
