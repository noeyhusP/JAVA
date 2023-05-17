public class App {
    public static void main(String[] args) throws Exception {
        // Child ch = new Child();
        // // child 객체를 불러왔지만
        // System.out.println(ch.parentMoney);
        // System.out.println(ch.childMoney);
        // child class 안에 없는 parentMoney값도 불러오는게 가능함
        // 이유 : child에 extends Parent를 붙여주면
        // child 객체를 생성해올 때, heap에 올라가는
        // child 객체 안에 parent object와 순수한 child object가 함께 생성 됨

        // 각 소프트웨어가 필요한 공통적인 정보를 parent class에 넣고
        // 상속으로 받아와서 코드를 효율적으로 이용할 수 있음 (재활용하는 느낌으로)
        
        // Phone phone = new Phone();
        // phone.bell();
        // phone.sendVoice("안녕하세요");
        // phone.receiveVoice("끊자");
        // phone.hangUp();

        // 안과환자
        ApartPatient p1 = new ApartPatient();

        ApartPatient p3 = new ApartPatient("john","male",70,"A",1.0);

        // 생성자가 call 되는 순서는 자식클래스에 먼저 가서 생성자 call하고 > 부모클래스로 점프해서 생성자 call함
        // 부모클래스 생성자 실행까지 하고 > 다시 자식클래스로 돌아와서 call해놓은 생성자 실행

        p1.setName("john");
        p1.setGender("male");
        p1.setWeight(70);
        p1.setBloodtype("A");
        p1.setEyeSight(1.0);

        // 환자 클래스의 메서드
        System.out.println(p1.getName());

        // 안과환자 클래스의 메서드
        System.out.println(p1.getEyeSight());

        p1.checkMedical();
        p1.checkMedicalforSurgery();

        // 산부인과 환자
        // SpartPatient p2 = new SpartPatient();
        // p2.setName("kate");
        // p2.setGender("female");
        // p2.setWeight(55);
        // p2.setBloodtype("O");
        // p2.setIsPregnant(false);

        // // 환자 클래스의 메서드
        // System.out.println(p2.getName());

        // // 산부인과환자 클래스의 메서드
        // System.out.println(p2.getIsPregnant());



    }
}
