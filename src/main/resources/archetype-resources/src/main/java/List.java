class list<T> {
    // Head of the node
    node<T> head;
    //Store length of the linked list
    private int len = 0;
    // Constructor
    list() {
        this.head = null;
    }
    // Method addNode(T data): This method add a new element at the end
    void addNode(T data) {
        // creating a new generic node
        node<T> temp = new node<>(data);
        // check if list is empty
        if (this.head == null) {
            head = temp;
        }
        // if list exists
        else {
            node<T> X = head;
            // Iterate the List
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        // Increase the len after adding new node
        len++;
    }
    // Method addNode(int pos,T data): It will add a new element at a particular position
    void addNode(int pos, T data) {
        // Check position if it's valid or not
        if (pos > len + 1) {
            System.out.println("Position not found");
            return;
        }
        // if new node is to be added in the beginning
        if (pos == 1) {
            node<T> temp = head;
            head = new node<T>(data);
            head.next = temp;
            return;
        }
        // Temporary node to store previous head
        node<T> temp = head;
        node<T> prev = new node<T>(null);
        // Interating
        while (pos - 1 > 0) {
            prev = temp;
            temp = temp.next;
            pos--;
        }
        prev.next = new node<T>(data);
        prev.next.next = temp;
    }
    // Method removeNode(T key): It will remove a node from the LinkedList
    void removeNode(T key) {
        node<T> prev = new node<>(null);
        prev.next = head;
        node<T> next = head.next;
        node<T> temp = head;
        // This will check whether the value is present or not
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            // Node is present which we will want to remove
            exists = true;
        }
        while (temp.next != null) {
            // Convert the value to be compared to string
            if (String.valueOf(temp.data).equals(String.valueOf(key))) {
                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        // When the node which we want to delete exists
        if (exists) {
            // reduce the len of linked list
            len--;
        }
        // If it does not exist
        else {
            System.out.println("Not found in linked list");
        }
    }
    public String toString() {
        String S = "{";
        node<T> X = head;
        if (X == null)
            return S + "}";
        while (X.next != null) {
            S += String.valueOf(X.data) + "->";
            X = X.next;
        }
        S += String.valueOf(X.data);
        return S + "}";
    }
}