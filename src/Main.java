public class Main {
    public static void main(String[] args) {
        for(int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
            for (int j = 8; j >= 0; j--) {
                if (j > i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}