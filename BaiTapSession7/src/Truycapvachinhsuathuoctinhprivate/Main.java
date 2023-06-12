package Truycapvachinhsuathuoctinhprivate;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello");
        System.out.println("Giá trị myString ban đầu: " + myObject.getMyString());

        myObject.setMyString("World");
        System.out.println("Giá trị myString sau khi thay đổi: " + myObject.getMyString());
    }
}
