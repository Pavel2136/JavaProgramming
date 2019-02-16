public class TestMyArrayList {

    public static void main(String[] args) {

        TesterCollection tester = new TesterCollection();
        System.out.println("Array List test: ");
        tester.testCollection(new MyArrayList<>());
        System.out.println("Link List test:");
        tester.testCollection(new LinkList());

        LinkList list = new LinkList ();

        if (list.contains("bread")) {
            System.out.println("Contains item");
        } else {
            System.out.println("No item");
        }


    }
}
