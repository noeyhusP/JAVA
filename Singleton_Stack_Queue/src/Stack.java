public class Stack {
        //  Stack 배열 생성하기

        int size; // 스택(배열) 사이즈
        int sp; // sp의 기본값 -1로 세팅해줌
        int[] stack; // 스택배열 생성 (객체배열로 생성)

        // 기본 생성자
        public Stack()
        {
            sp = 0;
            stack = null;
            size = 0;         
        }
        // 오버로딩 생성자
        public Stack(int size)
        {
            this.sp = -1;
            this.size = size;
            this.stack = new int[size];
        }

        // stack-empty 확인
        private boolean isEmpty()
        {
            return sp == -1;
        }

        // stack-full 확인
        private boolean isFull()
        {
            return sp == size - 1;
        }

        // push() 기능 = 데이터 넣기
        // return값이 필요한 이유 : 함수가 제대로 돌고 있는지 확인할 수 있어야 함
        public int push(int num)
        {
            int pushedData = 0;
            if (isFull() == false)
            {
                pushedData = num;
                stack[++sp] = num;

            }
            else
            {
                System.out.println("STACK-FULL");   
                sp = size - 1; 
            }
            return pushedData;
        }

        // public boolean push(int num)
        // {
        //     if (isFull() == false)
        //     {
        //         stack[++sp] = num;

        //     }
        //     else
        //     {
        //         System.out.println("STACK-FULL");   
        //         sp = size - 1; 
        //     }
        //     return pushedData;
        // }

        // pop() 기능 = 데이터 빼기
        public int pop()
        {
            int poppedData;
            if (isEmpty() == false)
            {
                stack[sp] = 0;
                sp--;
                poppedData = stack[sp];
            }
            else
            {
                poppedData = 0;
                System.out.println("STACK-EMPTY");
            }
            return poppedData;
        }

        public static void func1(Stack Stack)
        {
            int data;
            data = Stack.pop();
        }

        // peek() 기능 = 가장 위의 값을 반환 (잘 사용하지 않음)
        public int peek()
        {
            if (isEmpty())
                System.out.println("STACK-EMPTY");
            return stack[sp];
        }

        // 현재 스택 프린트
        public void printPop()
        {
            System.out.println("===============");
            System.out.println(pop());
            System.out.println("===============");
        }

        // 저장된 스택 전부 프린트
        public void printStackAll()
        {
            for (int i = 0; i < stack.length; i++)
            {
                System.out.println(stack[i]);
            }
        }

}
