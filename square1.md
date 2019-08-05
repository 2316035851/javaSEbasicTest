public class square1 {


    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
        System.out.print("*");
        for (int j = 0; j <= 9; j++) {
        if(i==0 || i==10 || j ==9)
        System.out.print("#");
        else {
        System.out.print("0");
        }
        }
        System.out.println();
        }

    }
}

