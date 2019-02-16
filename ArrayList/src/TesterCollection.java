public class TesterCollection {

    public void testCollection(ICollection list) {
        list.add("potato");
        list.add("key");
        list.add("bread");
        list.add("money");
        list.add("phone");
        list.add("potato");
        list.add("key");
        list.add("bread");
        list.add("money");
        list.add("phone");
        list.add("ball");

        System.out.println("The size of bag is " + list.size());
        list.print();
        System.out.println();

        System.out.println("Get from the list " + list.get(2));
        System.out.println("The size of bag is " + list.size());

        System.out.println("List contains " + list.contains("bread"));


    }
}
