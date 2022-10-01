// 실습 4-6
import java.util.Scanner;
class Circle5{
    private double x, y;
    private int radius;

    public Circle5(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void big_show() {
        System.out.println("가장 면적이 큰 원은 (" + this.x + "," + this.y + ") " + radius);
    }
}

public class CircleManager2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle5 c [] = new Circle5[3];
        int max = 0, save = 0;
        for (int i = 0; i < 3; i++){
            System.out.print("x, y, radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            if(max < radius){
                max = radius;
                save = i;
            }
            c[i] = new Circle5(x, y, radius);
        }

        c[save].big_show();

        sc.close();
    }
}
