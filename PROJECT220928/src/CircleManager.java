// 실습 4-5
import java.util.Scanner;
class Circle4{
    private double x, y;
    private int radius;

    public Circle4(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + this.x + "," + this.y + ") " + radius);
    }
}

public class CircleManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle4 c [] = new Circle4[3];
        for (int i = 0; i < 3; i++){
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle4(x, y, radius);
        }
        for(int i = 0; i<c.length; i++){
            c[i].show();
        }
        sc.close();
    }
}
