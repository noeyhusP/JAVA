package thistisjava_ex;
public class CarExample {
    public static void main(String[] args) {
        Car avante = new Car("HD", "Normal", "red", 160);
        Car sonata = new Car("HD", "N-Line", "white", 200);

        System.out.println(sonata.getColor());
        System.out.println(avante.getCompany());
    }
}
