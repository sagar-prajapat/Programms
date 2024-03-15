public class hollowtriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                if (i == 1) {
                    System.out.print("* ");
                } else if (i == 2 && j == 2 || j == 4) {
                    System.out.print("*");
                } else if (i == 3 && j == 2 || j == 4) {
                    System.out.print("*");
                } else if (i == 4 && j == 3) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
