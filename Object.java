 public class Object {
    int a = 5;
    static String name = "abc";

}
class Class2 {
    public static void main(String[] args) {
        Object.name = "deepesh";  // we have to use classname.variable = new value
        Object s1 = new Object();

        System.out.println(s1.a);
        System.out.println(s1.name);

    }
}