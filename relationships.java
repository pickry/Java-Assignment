public class relationships extends base{
    relationships(){
        System.out.println("This is a trial " + x);
    }
    static class A{
        int z = 110;
        A(int n){
            System.out.println("The "+n+"th multiple of "+ z + " is :" + n*110);
        }

    }
    static class B{
        B(){
            System.out.println("Example of HAS-A relationship: ASSOCIATION");
            A obj = new A(12);

        }
    }

    static class C{
        String animal = "Lion";

    }
    static class D{
        void example(int t){
            C obj = new C();
            for(int i=0;i<t;i++){
                System.out.println(obj.animal);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Example of IS-A relationship: INHERITANCE");
        relationships obj = new relationships();
        System.out.println(obj.x + 2);
        B obj2 = new B();
        System.out.println("Example of USES-A relationship: DEPENDENCY");
        D obj3 = new D();
        obj3.example(14);
    }
}
