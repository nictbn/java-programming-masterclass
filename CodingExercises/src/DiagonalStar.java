public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(i == 0 || i == number - 1) {
                    System.out.print("*");
                    continue;
                }
                if(j == 0 || j == number - 1) {
                    System.out.print("*");
                    continue;
                }
                if (i == j || i + j == number - 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
