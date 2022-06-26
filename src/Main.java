import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan  = new Scanner(System.in);

        System.out.println("do you have criminal record ans:yes/no ");
        String criminalRecordInput = scan.next();
        System.out.println("please insert your credit score value in decimals  ");

        float creditInput = scan.nextFloat();
        System.out.println("please insert your saving amount in birr");
        float savingInput = scan.nextFloat();
        boolean hasCriminalRecord = criminalRecordInput.equalsIgnoreCase("no");
        boolean hasCredit = creditInput > 0.7;
        boolean hasSavings = savingInput >10_000;
        if(hasCriminalRecord && (hasCredit || hasSavings)){
            if(savingInput > 100_000)
                System.out.println("you can tak a loan up to: "+4*savingInput);
            else
                System.out.println("you can tak a loan up to: "+2*savingInput);
            String credit = NumberFormat.getPercentInstance().format(creditInput);
            System.out.println("your credit score is:"+credit);


        }




    }
}