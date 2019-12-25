package linked_list;

import java.util.LinkedList;

public class LinkedListExample {

    public LinkedListExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        var items = "lee kim choi jun go han".split(" ");

        for (int i = 0; i < items.length; i++) {
            linkedList.add(items[i]);
        }

        System.out.println("using foreach");
        for (String str:
             linkedList) {
            System.out.println(str);
        }

        System.out.println(linkedList.contains("lee"));
        System.out.println("using fori");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    public static void main(String[] args) {
        new LinkedListExample();
    }
}
