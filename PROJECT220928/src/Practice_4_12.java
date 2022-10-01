// 실습 4-12
import java.util.Scanner;

class Subscriber {
    String name;

    public Subscriber () {

    }
}

public class Practice_4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subscriber s_s[] = new Subscriber[10];
        Subscriber s_a[] = new Subscriber[10];
        Subscriber s_b[] = new Subscriber[10];
        for(int i = 0; i < 10; i++){
            s_s[i] = new Subscriber();
            s_a[i] = new Subscriber();
            s_b[i] = new Subscriber();
            s_s[i].name = "---";
            s_a[i].name = "---";
            s_b[i].name = "---";
        }
        String n_name;
        int n_seat;
        int choice = 0;
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (choice != 4) {
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        int cnt = 0;
                        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                        int ch = sc.nextInt();
                        sc.nextLine();
                        switch (ch) {
                            case 1:
                                System.out.print("S>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_s[i].name + " ");
                                }
                                System.out.println();

                                System.out.print("이름 >> ");
                                n_name = sc.nextLine();
                                while (true) {
                                    System.out.print("번호 >> ");
                                    n_seat = sc.nextInt();
                                    if (n_seat >= 1 && n_seat <= 10) {
                                        if(s_s[n_seat - 1].name.equals("---")) {
                                            s_s[n_seat - 1].name = n_name;
                                            cnt++;
                                            break;
                                        }
                                        else {
                                            System.out.println("이미 예약된 자리입니다. 다시 입력하세요. \n");
                                        }

                                    } else {
                                        System.out.println("없는 번호입니다. 다시 입력하세요. \n");
                                    }
                                }

                                break;

                            case 2:
                                System.out.print("A>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_a[i].name + " ");
                                }
                                System.out.println();

                                System.out.print("이름 >> ");
                                n_name = sc.nextLine();
                                while (true) {
                                    System.out.print("번호 >> ");
                                    n_seat = sc.nextInt();
                                    if (n_seat >= 1 && n_seat <= 10) {
                                        if(s_a[n_seat - 1].name.equals("---")) {
                                            s_a[n_seat - 1].name = n_name;
                                            cnt++;
                                            break;
                                        }
                                        else {
                                            System.out.println("이미 예약된 자리입니다. 다시 입력하세요. \n");
                                        }
                                    } else {
                                        System.out.println("없는 번호입니다. 다시 입력하세요. \n");
                                    }
                                }

                                break;

                            case 3:
                                System.out.print("B>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_b[i].name + " ");
                                }
                                System.out.println();

                                System.out.print("이름 >> ");
                                n_name = sc.nextLine();
                                while (true) {
                                    System.out.print("번호 >> ");
                                    n_seat = sc.nextInt();
                                    if (n_seat >= 1 && n_seat <= 10) {
                                        if(s_b[n_seat - 1].name.equals("---")) {
                                            s_b[n_seat - 1].name = n_name;
                                            cnt++;
                                            break;
                                        }
                                        else {
                                            System.out.println("이미 예약된 자리입니다. 다시 입력하세요. \n");
                                        }
                                    } else {
                                        System.out.println("없는 번호입니다. 다시 입력하세요. \n");
                                    }
                                }

                                break;

                            default:
                                System.out.println("잘못 입력하셨습니다. 다시 입력하세요. \n");

                                break;
                        }

                        if (cnt != 0){
                            break;
                        }

                    }

                    break;

                case 2:
                    System.out.print("S>> ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(s_s[i].name + " ");
                    }
                    System.out.println();

                    System.out.print("A>> ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(s_a[i].name + " ");
                    }
                    System.out.println();

                    System.out.print("B>> ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(s_b[i].name + " ");
                    }
                    System.out.println();

                    System.out.println("<<<조회를 완료하였습니다.>>>");

                    break;

                case 3:
                    while (true) {
                        int c_cnt = 0;
                        System.out.print("좌석 S:1, A:2, B:3 >> ");
                        int ch = sc.nextInt();
                        sc.nextLine();
                        switch (ch) {
                            case 1:
                                System.out.print("S>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_s[i].name + " ");
                                }
                                System.out.println();

                                while (true) {
                                    System.out.print("이름 >> ");
                                    n_name = sc.nextLine();
                                    int cnt = 0;

                                    for (int i = 0; i < 10; i++) {
                                        if (s_s[i].name.equals(n_name)) {
                                            s_s[i].name = "---";
                                            c_cnt++;
                                        } else {
                                            cnt++;
                                        }
                                    }

                                    if (cnt == 10) {
                                        System.out.println("없는 이름입니다. 다시 입력하세요 (빠져나가려면 --- 입력)");
                                    } else {
                                        break;
                                    }
                                }

                                break;

                            case 2:
                                System.out.print("A>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_a[i].name + " ");
                                }
                                System.out.println();

                                while (true) {
                                    System.out.print("이름 >> ");
                                    n_name = sc.nextLine();
                                    int cnt = 0;

                                    for (int i = 0; i < 10; i++) {
                                        if (s_a[i].name.equals(n_name)) {
                                            s_a[i].name = "---";
                                            c_cnt++;
                                        } else {
                                            cnt++;
                                        }
                                    }

                                    if (cnt == 10) {
                                        System.out.println("없는 이름입니다. 다시 입력하세요. (빠져나가려면 --- 입력)");
                                    } else {
                                        break;
                                    }
                                }

                                break;

                            case 3:
                                System.out.print("B>> ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print(s_b[i].name + " ");
                                }
                                System.out.println();

                                while (true) {
                                    System.out.print("이름 >> ");
                                    n_name = sc.nextLine();
                                    int cnt = 0;

                                    for (int i = 0; i < 10; i++) {
                                        if (s_b[i].name.equals(n_name)) {
                                            s_b[i].name = "---";
                                            c_cnt++;
                                        } else {
                                            cnt++;
                                        }
                                    }

                                    if (cnt == 10) {
                                        System.out.println("없는 이름입니다. 다시 입력하세요  (빠져나가려면 --- 입력)");
                                    } else {
                                        break;
                                    }
                                }

                                break;

                            default:
                                System.out.println("잘못 입력하셨습니다. 다시 입력하세요. \n");

                                break;
                        }

                        if (c_cnt != 0){
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다. \n");
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요. \n");
                    break;
            }
        }
    }
}
