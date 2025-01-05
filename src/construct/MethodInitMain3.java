package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("user1", 15, 90);

        MemberInit memberInit2 = new MemberInit();
        memberInit2.initMember("user2", 16, 80);

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
