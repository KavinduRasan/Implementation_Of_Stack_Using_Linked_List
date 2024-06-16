package Stack_Using_Linked_List;



public class Stack_Linked_List {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node top; 

        public Stack() {
            this.top = null;
        }

        
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        
        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        
        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        
        public boolean isEmpty() {
            return top == null;
        }

      
        public void display() {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack elements: ");
        stack.display(); 

        System.out.println("Top element is: " + stack.peek()); // Output: 3

        System.out.println("Popped element is: " + stack.pop()); // Output: 3
        System.out.print("Stack elements after pop: ");
        stack.display(); 
    }
}
