package thisisjava;

// 이것이자바다 p715

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOk.setClickListenter(()->
        {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });

        // Ok 버튼 클릭하기
        btnOk.click();
        // = btnOk.setClickListenter(() 구현부 실행

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnCancel.setClickListenter(() -> 
        {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        // Cancel 버튼 클릭하기
        btnCancel.click();
        // btnCancel.setClickListenter(() 구현부 실행
    }
}
