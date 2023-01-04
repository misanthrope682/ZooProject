public class LinkedList {
    public static void main(String[] args) {
        // Creating new linked list of int type
        list<Integer> list1 = new list<>();
        list1.addNode(1);
        list1.addNode(25);
        list1.addNode(69);
        list1.addNode(2, 35);
        System.out.println("Original list 1: " + list1);
        list1.removeNode(69);
        System.out.println("New list 1 after removing a node from the list: " + list1);
        System.out.println();
        // Create new linked list of string type
        list<String> list2 = new list<>();
        list2.addNode("prepbytes");
        list2.addNode("Algorithm");
        System.out.println("Original list 2: " + list2);
        list2.addNode(1, "Data");
        System.out.println("New list 2 after adding element: " + list2);
    }
}