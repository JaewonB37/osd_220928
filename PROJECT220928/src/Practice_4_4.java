// 실습 4-4
class Rectangle2 {
    int x, y, width, height;
    public Rectangle2(int a, int b, int c, int d) {
        this.x = a;
        this.y = b;
        this.width = c;
        this.height = d;
    }

    int square() {
        return width * height;
    }

    void show() {
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    boolean contains(Rectangle2 r) {
        int cnt = 0;
        if(this.x + this.width > r.x + r.width && this.y + this.height > r.y + r.height){
            cnt++;
        }
        if(this.x < r.x && this.y < r.y){
            cnt++;
        }

        if(cnt == 2){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Practice_4_4 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(2, 2, 8, 7);
        Rectangle2 s = new Rectangle2(5, 5, 6, 6);
        Rectangle2 t = new Rectangle2(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
