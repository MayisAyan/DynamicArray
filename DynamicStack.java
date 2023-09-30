public class DynamicStack {
    public static void main(String[] args) {
        IntArrayStack stck = new IntArrayStack();
        stck.push(15);
        stck.push(77);
        stck.push(5);
        stck.print();
        System.out.println(stck.pop());
        System.out.println(stck.top());
        System.out.println(stck.isEmpty());
        System.out.println(stck.getSize());
    }
}


class IntArrayStack {
    private int[] stack;
    private int topIndex;
    
    public IntArrayStack() {
        stack = new int[10];
    }
    
    public void push(int element) {
        if (topIndex >= stack.length) {
            resize();
        }
        stack[topIndex++] = element;
    }
    
    public int pop() {
        topIndex -= 1;
        return stack[topIndex];
    }
    
    public int top() {
        if(topIndex == 0){
            System.out.print("Stack is empty");
            return -1;
        }
        return stack[topIndex - 1];
    }
    
    public boolean isEmpty() {
        return topIndex == 0;
    }
    
    public int getSize() {
        return topIndex;
    }
    
    public void print() {
        for (int i = topIndex - 1; i >= 0; --i) {
            System.out.println("[" + stack[i] + ']');
        }
        System.out.println();
    }
    
    private void resize() {
        int[] newStack = new int[(int)(topIndex * 1.5)];
        for (int i = 0; i < topIndex; ++i){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    
}
