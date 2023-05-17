public class StackEx {
    public static void main(String[] args) {
        Stack Stack = new Stack(5);

        Stack.push(1);

        Stack.push(2);

        Stack.push(3);

        Stack.push(4);

        Stack.push(5);
        Stack.printStackAll();

        Stack.pop();
        Stack.printPop();

        Stack.pop();
        Stack.printPop();

        Stack.pop();
        Stack.printPop();

        Stack.pop();
        Stack.printPop();

        Stack.pop();
        Stack.printPop();

        // pop이랑 printAll 수정하기

        // boolean result;
        // result = Stack.push(1);
        // 이렇게 확인 가능하도록

        // if (false == Stack.push(2))
        // {
        //     System.out.println("더 이상 넣을 수 없습니다.");
        // }
        // 이렇게도 확인 가능하도록

    }
}
