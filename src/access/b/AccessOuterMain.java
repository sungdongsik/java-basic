package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        // public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        //다른 패키지 default 호출불가
        //accessData.defaultField = 2;
        accessData.defaultFieldMethod();

        // private 호출 불가

        accessData.innerAccess();
    }
}