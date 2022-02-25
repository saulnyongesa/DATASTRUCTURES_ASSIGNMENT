public class ArrayStack {
    private int arr[];
    private int top;
    public ArrayStack(int cap){
        arr = new int[cap];
        top= -1;
    }
    public  int peek(){
        if(top==-1){
        //throw EmptyStackException
        System.out.println("error stack empty");
        return top;}
        else
        return arr[top];
    }
    public void push(int element){
        if(top == arr.length-1){
            System.out.println("stack is full");
        
        }
        else{
            arr[++top]=element;
        }
    }
}
