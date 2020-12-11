public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int refill = 1000;
        int bonus = refill/ 100;

            if (refill >= 1000) {
                int total = refill + balance + bonus;
                System.out.println(total);

            }else{
                 int total = refill + balance;
                 System.out.println(total);

            }




    }

}

