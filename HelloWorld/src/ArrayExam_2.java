public class ArrayExam_2 {
    public static void main(String[] args) {
        // Non-Primitive type의 대표 : 배열(Array)
        // 자바에서 Array의 정의 : 어떤 데이터 타입을 T(type)라고 가정했을 때 (ex)int))
        // T가 n개 연속으로 이루어진 선형 데이터타입

        // 자바스크립트에서는 배열에 서로 다른 데이터타입의 데이터도 들어갈 수 있었으나
        // 자바에서는 불가함 (반드시 같은 데이터타입의 데이터만 허용)

        // 배열 만들기
        // heap에다가 T = int, n = 5 인 배열을 만들기
        // 만들 배열의 참조값을 넣어줄 int ar 변수도 만들어줌
        int[] ar = new int[5];

        // 또는
        int[] ar2 = new int[] {1, 2, 3, 4, 5};
        // 자바는 compiler가 데이터의 개수를 세서 []에 넣어줌 
        // (개발자가 직접 입력하는 걸 믿지 않아 허용하지 않음)

        // 변수 선언파트가 슈거코드인 코드
        // 슈거코드는 거의 C언어의 슈거코드들을 허용한 것
        // C언어 개발자들의 파이를 흡수하기 위해 자바에서도 허용하게 된 것
        // 어쨌든 슈거코드이므로(심지어 C언어의 잔재이므로 구식임) 가급적 쓰기 말고 정석대로 할 것
        int ar3[] = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar3[i]);
        }

        // 예제1)
        // double 4개짜리 배열을 만들고 이를 1.0, 2.0, 3.0, 4.0으로 초기화

        // 1. 배열을 new로 만듦과 동시에 초기화
        double[] arr1 = new double[]{1.0, 2.0, 3.0, 4.0};

        // 2. 배열을 new로 만들고 이후레 갑을 대입
        double[] arr2 = new double[4];
        arr2[0] = 1.0;
        arr2[1] = 2.0;
        arr2[2] = 3.0;
        arr2[3] = 4.0;

        // 3. 슈거코드로 구현하는 방식
        double[] arr3 = {1.0, 2.0, 3.0, 4.0};

        // 화면에 찍어보기
        for (int i = 0; i < arr3.length; i++)
        {
            System.out.println(arr3[i]);
        }

    }
}
