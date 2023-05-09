public class Thisisjava_ex1 {
    public static void main(String[] args) {
        // p136
        // 3. for 문을 이용해서 1부터 100까지 정수 중에 3의 배수 총합 출력

        // 방법 1

        // int total = 0;
        // for (int i = 1; i <= 100; i++)
        // {
        //     if (i % 3 == 0)
        //     {
        //         total += i;
        //     }
        // }
        // System.out.printf("1부터 100까지 3의 배수 총합은 %d",total);

        // 방법2 

        // int num = 1;
        // int total = 0;
        // for (int i = 1; i <= 100; i++)
        // {
        //     if (num % 3 == 0)
        //     {
        //         System.out.println(num);
        //         total += num;
        //     }
        //     num++;
        // }
        // System.out.printf("1부터 100까지 3의 배수 총합은 %d",total);
        

        // System.out.println(sum);

        // 4. Math.random()을 이용해 두 개의 주사위를 던졌을 때 나오는 눈을
        // (눈1, 눈2)형태로 출력하고, 눈의 합이 5가 아니라면 계속 주사위를 던지고,
        // 눈의 합이 5면 실행을 멈추는 코드 작성
        // 눈의 합이 5인 경우 : (1,4) (4,1) (2,3) (3,2)

        // while (true)
        // {
        //     int dice1 = (int)(Math.random()*6) + 1;
        //     int dice2 = (int)(Math.random()*6) + 1;
        //     System.out.printf("%d 와 %d 의 합은 5 \n", dice1, dice2);

        //     if (5 == (dice1 + dice2)) 
        //     // 가급적 위와 같이 조건식 세우도록 하기
        //     // 비교값이 함수의 리턴값일 경우에 가독성이 더 좋아짐
        //     {
        //         System.out.printf("%d 와 %d 의 합은 5", dice1, dice2);
        //         break;
        //     }

        // }

        // 정답1

        // int dice1 = 0;
        // int dice2 = 0;
        // while (true)
        // {
        //     if (5 == (dice1 + dice2)) 
        //     {
        //         System.out.printf("%d 와 %d 의 합은 5", dice1, dice2);
        //         break;
        //     }

        //     dice1 = ((int)(Math.random()*6)) + 1;
        //     dice2 = ((int)(Math.random()*6)) + 1;
        //     System.out.printf("(%d, %d) \n", dice1, dice2);

        // }

        // 정답2

        // int sum = 0;
        // while(sum != 5)
        // {
        //     int dice1 = (int)(Math.random()*6) + 1;
        //     int dice2 = (int)(Math.random()*6) + 1;
        //     sum = dice1 + dice2;
        //     System.out.printf("(%d, %d) \n", dice1, dice2);
        // }
        

        // 5. 중첩 for문을 이용해 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로
        // 출력하는 코드 작성. 단, x와 y는 10이하의 자연수

        // for (int x = 1; x <= 10; x++)
        // {
        //     for (int y = 1; y <= 10; y++)
        //     {   
        //         if ((4*x) + (5*y) == 60)
        //         {
        //             System.out.printf("x, y = %d, %d\n", x, y);
        //         }
        //     }
        // }
    }
}
