package construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    // 추가
    // 변수 선언한게 우선 순위
     void initMember(String name, int age, int grade){
        this.name = name;
        this.age =  age;
        this.grade = grade;
    }
}
