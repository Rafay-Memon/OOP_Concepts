class BaseClass {
    public void method1() {
        System.out.println("Method 1 in BaseClass");
        method2();
    }
    
    public void method2() {
        System.out.println("Method 2 in BaseClass");
    }
}

class SubClass extends BaseClass {
    @Override
    public void method2() {
        System.out.println("Method 2 in SubClass");
    }
}

class Main {
    public static void main(String[] args) {
        BaseClass obj = new SubClass();
        obj.method1();
    }
}