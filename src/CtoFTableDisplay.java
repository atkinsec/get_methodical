public class CtoFTableDisplay {
    public static void main(String[] args) {
        for (int count = -100; count <= 100; count++) {
            System.out.print(count);
            System.out.print("  ");
            System.out.printf("%.2f", SafeInput.CtoF(count));
            System.out.println();
        }
    }
}
