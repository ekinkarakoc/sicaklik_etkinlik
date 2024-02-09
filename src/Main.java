import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("sicaklik giriniz: ");
        heat = scanner.nextInt();

        if(heat <5){
            System.out.println("kayak yapabilirsin");
        } else if (heat >5 && heat<25) {
            if(heat<=15){
                System.out.println("sinemaya gidebilirisin");
            }
            if(heat>=10){
                System.out.println("pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("yüzmeye gidebilirsin");
        }
    }
}