package com.company.accessmodifiers;

import com.company.accessmodifiers1.access.*;

public class AccessModifiers {

    public static void main(String [] args)
    {

        AccessModifiers1 accessModifiers = new AccessModifiers1();
        System.out.println(accessModifiers.w);

        // different package and not using inheritance, you can access only public member of another class in another package

    }
}

 class AccessModifiers2 extends AccessModifiers1 {

    public static void main(String [] args) {

        AccessModifiers1 accessModifiers1 = new AccessModifiers1();
        System.out.println(accessModifiers1.w);

        // since you are not using direct inheritance but creating object of class then accessing the protected member, it is not allowed
       //  System.out.println(accessModifiers1.y);




        // different package and not using inheritance, you can access only public member of another class in another package

    }

    public void method()
    {
        y=40; // here protected member access is allowed from another class in another package as you are using direct inheritance
      //   x=10;   // not accessible as default member of another class in another package
      //  z=30; // not accessible as private member of another class in another package
        w=50; // accessible as public member of another class in another package

        methodAccessModifiers1();
        // private member of another class in another package is also accessible here via inheritance through that class method only
    }
}

