package t5;

public class Stack {
    int top = -1;
    int size = 10;
    task[] t = new task[size];
    public Stack(int s){
        size = s;
        task[] t = new task[size];
        top = -1;
    }
    public void push(task v){
        if(top == size -1){
            System.out.println("the stack is full");
        }else{
            t[++top] = v;
        }
    }
    public void pop(){
        if(top > -1){
            t[top] = null;
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("top is " + t[top]);
        }
    }
    public boolean isEmpty(){
        return (top == -1)? true : false;
    }
    public boolean isFull(){
        return (top == size-1)? true : false;
    }
}