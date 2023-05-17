public class Stack_ANSAPP {
    public static void main(String[] args) {
        Stack_ANS stack_ANS = new Stack_ANS(3);
        boolean res;
        int data;

        res = stack_ANS.push(10);
        res = stack_ANS.push(20);
        res = stack_ANS.push(30);


        data = stack_ANS.pop();
        data = stack_ANS.pop();
        data = stack_ANS.pop();
        data = stack_ANS.pop();

        if (data == stack_ANS.ERROR_STACK)
        {
            System.out.println("Stack_ERROR");
        }
        

    }   
}
