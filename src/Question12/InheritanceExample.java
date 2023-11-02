package Question12;

public class InheritanceExample {
    static class Parent {
        void printParent() {
            System.out.println("This is a Parent Class!");
        }
    }

    static class Child extends Parent {
        void printChild() {
            System.out.println("This is a Child Class!");
        }
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.printParent();

        Child obj1 = new Child();
        obj1.printParent();
        obj1.printChild();
    }

}
