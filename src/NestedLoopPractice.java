public class NestedLoopPractice {
    public static void main(String[] args) {
        NestedLoopPractice n = new NestedLoopPractice();
    }

    public NestedLoopPractice() {
        pattern9();


    }

    public void pattern1() {
        //code for pattern 1 goes here
        int num = 0;
        System.out.println("pattern 1");
        for (int i = 0; i < 5; i++) {
            num += 5;
            System.out.print(num + ", ");
        }
    }

    public void pattern2() {
        int num = 2;
        System.out.println("pattern 2");
        for (int i = 0; i < 5; i++) {
            num += 5;
            System.out.print(num + ", ");
        }
    }

    public void pattern3() {
        int num = 25;
        System.out.println("pattern 3");
        for (int i = 0; i < 6; i++) {
            num -= 4;
            System.out.print(num + ", ");
        }
    }

    public void pattern4() {
        int num = 0;
        System.out.println("pattern 4");
        for (int i = 0; i < 6; i++) {
            num = num + 1;
            System.out.print(num * num + "\t");
        }

//        for (int i=0;i<6;i++){
//            System.out.print(i*i + ", ");
//        }
    }

    public void pattern5() {

        System.out.println("pattern 5");

        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 5; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("pattern 6");
        for (int a = 0; a < 6; a++) {
            for (int b = 1; b < a; b++) {
                System.out.print(" ");
            }
            System.out.println(a);
        }
    }

    public void pattern7() {
        System.out.println("pattern 7");
        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < a; b++) {
                System.out.print(a + " ");
            }
            System.out.println(a);
        }

    }

    public void pattern75() {
        System.out.println("pattern 7.5");
        int rows=6;
        for (int i = 1; i < 6; i++) {
            for (int b = 1; b<rows-i; b++) {
                System.out.print(i + " ");
            }
            System.out.println(i);
        }
    }


    public void pattern8() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9() {
        int rows = 9;
        for (int i = 1; i <= rows; i++) {
            int spaces = Math.abs(i - (rows / 2 + 1));
            int stars = rows - 2 * spaces;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                if (i == (rows / 2 + 1)) {
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
