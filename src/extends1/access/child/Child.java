package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        pretectedValue = 1; // 상속관계 or 같은 패키지

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 패키지

        prinntParent();
    }
}
