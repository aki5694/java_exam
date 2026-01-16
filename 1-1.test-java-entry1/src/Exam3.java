public class Exam3 {
    public static void main(String[] args) {
        int product1 =200;
        int product2 =250;
        double tax =0.1;
        System.out.println(+product1*3+product2*4+"円");
        System.out.println((int)((product1*3+product2*4)*tax)+"円");
        System.out.println((int)((product1*3+product2*4)*1.1)+"円");
    }

}
