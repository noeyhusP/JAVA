public class ArrayExam_3 {
    public static void main(String[] args) {
        // int[] : 이런 형식의 배열을 1차원배열이라고 함
        // 2차원, 3차원, 4차원 배열 등등 도 존재 => 다차원배열 이라고 함

        int [] ar1 = new int[6];
        int [][] ar2 = new int[3][2];
        // ar1과 ar2가 둘 다 똑같이 24byte인데
        // ar1은 int 6개로 24byte인거고
        // ar2는 int 2개짜리가 3개로 24byte, 즉 접근방식이 다른 것

        System.out.println("---------------------");
    }
}
