import java.util.Scanner;

class question1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println(1);
            return;
        }

        String bin = "";

        while(number != 0){
            bin = (number & 1) + bin;
            number = number >> 1;
        }

        bin = bin.replaceAll("1","2");
        bin = bin.replaceAll("0","1");
        bin = bin.replaceAll("2","0");

        int requirednumber = Integer.parseInt(bin,2);
        System.out.print(requirednumber);
    }
}