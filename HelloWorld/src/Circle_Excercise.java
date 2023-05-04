public class Circle_Excercise {

        // 원의 넓이와 둘레를 구하기
        // 반지름을 입력하면 원의 넓이, 둘레를 구하는 프로그램을 구현하기

        // 순서
        // 1. 클래스 이름 정하기 
        // 2. attribute 도출
        // 3. getter, setter 만들기
        // 4. 생성자 만들기
        // 5. method 추가

        private double pi;
        private double radius;


        public void Circle()
        {
            this.pi = 3.14;
            this.radius = 0;
        }

        public void Circle(double radius)
        {
            this.pi = 3.14;
            this.radius = radius;
        }

        public double getCircum()
        {
            double circum = (radius * 2) * pi;
            return circum;
        }

        public double getArea()
        {
            double area = pi * (radius * radius);
            return area;
        }

        public void printCirclecalc()
        {
            System.out.println(getCircum());
            System.out.println(getArea());
        }
}


