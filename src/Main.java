public class Main {
    public static void main(String[] args) {
        Box<Integer, String> box1 = new Box<>(0, "Vladimir");
        System.out.println(box1);

        Box<String, String> box2 = new Box<>("apple", "яблоко");
        System.out.println(box2);
    }
}
