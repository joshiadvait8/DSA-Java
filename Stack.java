public class Stack {
    int[] arr = new int[5];
    int top;
    int size;

    public Stack() {
        top = -1;
        size = arr.length;
    }

    public void push(int data) {
        ++top;
        if (top < size) {
            arr[top] = data;
        }else{
            top--; //if stack full to but in peek we still want peek 
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if(top>-1){
            int val = arr[top];
            arr[top] = 0;
            top--;
            return val;
        }else{
            System.out.println("stack is empty");
        }
        return 0;
    }

    public int peek() {
        //check if stack is full or empty
        if(top<size && top > -1)
            return arr[top];
        return 0;
    }

    public void printStack() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack arr = new Stack();

        
        System.out.println(arr.pop());
        // arr.push(30);
        // arr.push(40);
        // arr.push(50);
        // arr.push(60);
        System.out.println(arr.peek());

        arr.printStack();
    }

}
