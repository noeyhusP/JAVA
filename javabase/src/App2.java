public class App2 {
    public static void main(String[] args) {
        Animal ani = new Animal(1,"노랭이",5.6,"yellow");
        // @AllArgsConstructor 때문에 돌아가고
        // 아래의 것들도 불러올 수 있음

        System.out.println(ani.getId());
        System.out.println(ani.getName());
        System.out.println(ani.getWeight());
        System.out.println(ani.getColor());

        // 롬복은 라이브러리이자 실행되어지는 파일이라는 점이 중요함

        System.out.println("abc");
        System.err.println("abc");
    }
}
