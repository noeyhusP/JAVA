package thisisjava;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        // toString() 메소드 호출
        System.out.println(strObj);

        // toString() 메소드 호출
        System.out.println(myPhone);
    }
}
