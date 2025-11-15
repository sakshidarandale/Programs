interface A {

    int no = 11;

    void fun();

    private void Display() {
        System.out.println("Inside private Display");
    }

    default void gun() {
        System.out.println("Inside gun");
        Display();
    }
}

interface B {

    int no = 21;

    void fun();

}

class Demo implements A, B // Multiple inheritance
{
    public void fun() {
        System.out.println("Inside fun");
    }

}

class Demo implements A {

}

class InterfaceDemo8 {
    public static void main(String A[]) {

        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        // dobj.Display();

    }
}