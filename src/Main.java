public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello world");
        System.out.println(box1);

        Box<Integer> box2 = new Box<>(2);
        System.out.println(box2);

        Box<Boolean> box3 = new Box<>(Boolean.TRUE);
        System.out.println(box3);
    }
}
