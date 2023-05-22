package thisisjava;

// 7장 8번

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        // 스노우 타이어가 굴러갑니다.
        tire.run();
        // 오버라이딩 됐기 때문에 이것도
        // 스노우 타이어가 굴러갑니다.

        // 이걸 규약으로써의 함수로 이용하려면 추상화시키기

        // 9번 답 - 2번
        // 강제 타입 변환은 자식 타입이 부모 타입으로 자동 변환한 후, 
        // 다시 자식 타입으로 변환할 때에만 사용할 수 있다. 

        // 10번 답 - Machine 클래스가 abstract 클래스이기 때문에 
        // Computer 클래스에 반드시 오버라이딩 메서드를 작성해줘야 함
    }
}
