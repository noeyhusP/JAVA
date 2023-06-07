public class App {

    public static boolean bubbleSort(int[] data) {

        int temp = 0;
        boolean bSwapped = false; // 스왑 영역으로 들어갈 필요가 없는 경우를 위한 변수 선언

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    bSwapped = true;
                    temp = data[j];        // 스왑
                    data[j] = data[j + 1]; // 연산
                    data[j + 1] = temp;    // 루프
                }
            }
        }

        // 면접 질문: 버블소트를 만들고 버블소트를 최적화하시오. (아래코드 구현)
        if (bSwapped == false) { // 여기에 왔다면 정렬이 이미 끝났다는 뜻 --> 즉시 리턴
            return true;
        } else {
            // 스왑변수 초기화
            bSwapped = false;
        }

        return true;
    }

    public static void printData(int[] data) {

        for(int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }


    // 은정 코드: 정확한 루프 설계 ////////////////////////////////////////////////////
    // 왜냐하면 큰 for문에서 data.length에 -1을 하지 않아도 도는데 -1로 정확하게 설계했기 때문
    public static boolean bubbleSortEJ(int [] data)
    {
        int temp;
        int count = data.length - 1;

        boolean bSwaped = false;

        // 배열 순회
        for(int i = 0; i < data.length - 1; i++)
        {
            // 비교
            for(int j = 0; j < count; j++)
            {
                // 현재 요소의 값과 다음 요소의 값을 비교
                if(data[j] > data[j + 1])
                {
                    bSwaped = true;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }

            if (bSwaped == false)
            {
                return true;

            }
            else
            {
                // 스왑변수 초기화.
                bSwaped = false;

            }
            
            count--;
        }

        return true;
    }



    public static void main(String[] args) throws Exception {
        
        int[] arr1 = new int[]{1, 9, 4, 6, 11, 10, 3, 15, 2, 13};
        bubbleSort(arr1);
        printData(arr1);

        int[] arr2 = new int[]{-2, 6, 1, 3, 12};
        bubbleSort(arr2);
        printData(arr2);

        int[] arr3 = new int[]{1, 2, 3, 4, 5}; // 스왑 연산 루프로 들어갈 일이 없다.
        bubbleSort(arr3);
        printData(arr3);

        int[] arr4 = new int[]{2, 1, 3, 4, 5}; // 스왑 연산 루프에 딱 1번만 들어온 뒤 안들어온다.
        bubbleSort(arr4);
        printData(arr4);


    }
}
