
class Base {
    public int i, j;

}

class Derived extends Base {
    public int x;
}

class RMDDemo1 {
    public static void main(String[] args) {
        Base bp1 = new Base(); // Nocasting
        Derived dp1 = new Derived(); // Nocasting
        Base bp2 = new Derived(); // Upcasting
        Derived bp2 = new Base(); // Downcasting //ERROR
    }
}