package printerEx;
// interface는 
// 1. 강제성이 있는 추상 자료구조
// 2. 규약만 존재
// 3. 객체화 할 수 없음
// 4. 상속매커니즘을 사용 (내부적으로 상속구조를 따름)
// 5. 규약(메서드)은 public이 기본

// interface는 규약 목적으로도 쓰이지만
// 쉽게 쓸 수 있도록 주요 메서드를 따로 모아 간단화해 접근성을 높이는 목적으로 쓰기도 함 
public interface Printable {
    int func(String str); 
    // = public int func(String str) 
    
    // class는 public을 붙여주지 않으면 public이 디폴트로 붙는게 아닌 반면
    // interface는 public이 디폴트로 생략되어 있는 것
    // 또, class는 추상메서드를 구현할 때 abstract를 붙여준 반면
    // interface는 아무것도 붙이지 않고 만들 수 있음

    // 이것이 자바다 8.3 상수 필드 참고
    // interface에서 기본적으로 상수는
    // static이 생략된 상태로 전역으로 올라가 있기 때문에 사용 가능한 것
    // 인터페이스에 선언된 필드는 모두 public static final

}
