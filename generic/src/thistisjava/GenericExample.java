package thistisjava;

public class GenericExample {
    public static void main(String[] args) {
        // K는 TV로 대체, M은 String으로 대체
        Product<TV, String> product1 = new Product<>();
        
        // Setter 매개값은 반드시 TV와 String을 제공
        product1.setKind(new TV()); 

    }
}
