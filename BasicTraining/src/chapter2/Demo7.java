package chapter2;

public class Demo7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int yu = N % 2;

        if(yu != 0){
            System.out.println("Weird");
        }
        else{
            if((N >= 2 && N <= 5) || N > 20){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }

        scanner.close();
    }
}
