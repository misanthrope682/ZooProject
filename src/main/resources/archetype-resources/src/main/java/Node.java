class node<T> {
    // Stores data of the node
    T data;
    // Store address of the node
    node<T> next;
    // Constructor
    node(T data) {
        this.data = data;
        this.next = null;
    }
}