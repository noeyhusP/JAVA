public class ReadAgeException extends Exception{
    // 사용자 정의 exception
    public ReadAgeException()
    {
        super("유효하지 않은 나이 범위 입니다.");
    }

    // 그러나 사용자 정의 exception의 용도는 이게 아님
    // 이러한 용도는 if else문으로도 만들 수 있음

    // 올바른 용도로는 대개 생성자에서 많이 씀
    // 예를 들어 class student 객체 생성시 이름, 학년, 나이, 반 등이 들어가는데
    // 나이에 예상범위밖의 값을 입력했을 때 생성자체를 막는 등의 용도로 씀
    // 만들어보기
    // 생성자는 if else문으로 막을 수 없기 때문 
}
