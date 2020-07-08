package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        System.out.println(Ebreeq.MAX_LINQUDE_AMOUNT);

        Ebreeq ebreeq =new Ebreeq("witer", 0);

        while (true){
            Scanner input = new Scanner(System.in);

            System.out.println("أدخل رقم يعبر عن كيمية القهوة الجديد بشرط أن لايتخطا ال 1000");

            int linqudeAmount = input.nextInt();
            ebreeq.fill(linqudeAmount);
            System.out.println("تم تعبئة الابريق بنجاح");
            System.out.println("you have the amount : "
                    + ebreeq.getAmount() + " " + "from the " + " "
                    + ebreeq.getLiquteType());

            System.out.println("نعيد صب فناجين القهوة من جديد");
            while (ebreeq.serve()){
                System.out.println("you have the amount : "
                        + ebreeq.getAmount() + " " + "from the " + " "
                        + ebreeq.getLiquteType());
            }

//            if (ebreeq.isEmpty()){
//                ebreeq.fill();
//                System.out.println("you have the amount : "
//                        + ebreeq.getAmount() + " " + "from the " + " "
//                        + ebreeq.getLiquteType());
//            }else {
//                System.out.println("ابريق القهوة ممتلئ");
//            }
        }


//        if (ebreeq.isFill()){
//            ebreeq.clean();
//            System.out.println("you have the amount : "
//                    + ebreeq.getAmount() + " " + "from the " + " "
//                    + ebreeq.getLiquteType());
//        }else {
//            System.out.println("iiiii");
//        }

//        while (ebreeq.serve()){
//            System.out.println("you have the amount : "
//                    + ebreeq.getAmount() + " " + "from the " + " "
//                    + ebreeq.getLiquteType());
//        }


//        try {
//            ebreeq.fill(30000);
//        }catch (IllegalArgumentException error){
//            System.out.println( "error" + error.getMessage());
//        }

//
//        System.out.println("تم تعبئة الابريق بنجاح");
//        System.out.println("you have the amount : "
//                + ebreeq.getAmount() + " " + "from the " + " "
//                + ebreeq.getLiquteType());
//
//        System.out.println("نعيد صب فناجين القهوة من جديد");
//        while (ebreeq.serve()){
//            System.out.println("you have the amount : "
//                    + ebreeq.getAmount() + " " + "from the " + " "
//                    + ebreeq.getLiquteType());
//        }



//        ebreeq.fill(126);
//        System.out.println("تم تعبئة الابريق بنجاح");
//        System.out.println("you have the amount : "
//                + ebreeq.getAmount() + " " + "from the " + " "
//                + ebreeq.getLiquteType());
//
//        System.out.println("نعيد صب فناجين القهوة من جديد");
//        while (ebreeq.serve()){
//            System.out.println("you have the amount : "
//                    + ebreeq.getAmount() + " " + "from the " + " "
//                    + ebreeq.getLiquteType());
//        }
//        System.out.println("you have the amount : "
//                + ebreeq.getAmount() + " " + "from the " + " "
//                + ebreeq.getLiquteType());
//
//        Ebreeq sebreeq =new Ebreeq("coffee", 20);
//
//        System.out.println("you have the amount : "
//                + sebreeq.getAmount() + " " + "from the " + " "
//                + sebreeq.getLiquteType());


    }
}
