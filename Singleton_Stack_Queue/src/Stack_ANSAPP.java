public class Stack_ANSAPP {
    public static void main(String[] args) {
        Stack_ANS stack_ANS = new Stack_ANS(3);
        boolean res;
        int data;

        res = stack_ANS.push(10);
        res = stack_ANS.push(20);
        res = stack_ANS.push(30);
        res = stack_ANS.push(40);


        data = stack_ANS.pop();
        // stack_ANS.printStackAll();
        stack_ANS.printAll();
        data = stack_ANS.pop();
        // stack_ANS.printStackAll();
        stack_ANS.printAll();
        data = stack_ANS.pop();
        data = stack_ANS.pop();

        res = stack_ANS.push(50);
        stack_ANS.printAll();
        res = stack_ANS.push(60);
        stack_ANS.printAll();

        if (data == stack_ANS.ERROR_STACK)
        {
            System.out.println("Stack_ERROR");
        }
    }   
}
