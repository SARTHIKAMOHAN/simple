package stackeg;

public class Stack {
    int s[]=new int[10];
    int tos;
    
    Stack()
    {
    	tos = -1;
    }
    void push(int item)
    {
    	if(tos==9)
    		System.out.println("stack is full");
    	else
    	    s[++tos] = item;
    }
    int pop() {
    	if(tos>=0)
    	   return s[tos--];
    	else
    		System.out.println("empty");
    		return-1;
    }
    
}
