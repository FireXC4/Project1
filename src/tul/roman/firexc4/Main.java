package tul.roman.firexc4;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        ukol 6,7,9,10,13,17,20
         */

        //7
        // P7();

        //17
        // P17();

        //13
        // P13();

        //19
        //20
    }
    public static void P7(){
        //7 . Napište program, který načte souřadnice bodu roviny a určí a vypíše, ve kterém kvadrantu zadaný bod leží
        Scanner sc = new Scanner(System.in);

        System.out.println("Input X of a point:");
        double x1 = sc.nextDouble();
        System.out.println("Input Y of a point:");
        double y1 = sc.nextDouble();

        //double x1 = 1;
        //double y1 = 1;

        if (x1>=0 && y1 >=0){
            System.out.format("Point X:%.2f,Y:%.2f je v prvním kvadrantu.%n",x1,y1);
        }

        if (x1<=0 && y1 <=0){
            System.out.format("Point X:%.2f,Y:%.2f je v třetím kvadrantu.%n",x1,y1);
            }

        if (x1<=0 && y1 >=0){
            System.out.format("Point X:%.2f,Y:%.2f je v čtvrtém kvadrantu.%n",x1,y1);
        }

        if (x1>=0 && y1 <=0){
            System.out.format("Point X:%.2f,Y:%.2f je v druhém kvadrantu.%n",x1,y1);
        }

    }

    public static void P13(){
       String Out = "Null";
       Scanner sc = new Scanner(System.in);

       System.out.println("Type in your date of birth in this format dd.mm.rr -> 07.05.02 for 7.5.2002");
       String dateofbirth = sc.nextLine();
       System.out.println("Type your gender f/m -> m for male f for female");
       String gender = sc.nextLine();
        if (dateofbirth.matches("\\d{2}.\\d{2}.\\d{2}") && (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m"))){
            String[] split = dateofbirth.split("[.]",0);

            String day = split[0];
            String month = split[1];
            String year = split[2];

            if (gender.equalsIgnoreCase("f")) {
                Integer fmonth = Integer.parseInt(month) + 50;

                Out = (year+fmonth+day+"/XXXX");
                System.out.println(Out);
            }else {
                Out = (year+month+day+"/XXXX");
                System.out.println(Out);
            }
        }else {
            System.out.println("Error: Format error in dateofbirth || gender");
        }
    }

    public static void P17(){
        //17. Vyberte jednu z dříve zadaných úloh (například určení dělitelnosti nebo převod sekund na hodiny, minuty,
        //sekundy) a zapište program, který bude danou úlohu řešit opakovaně pro více vstupních hodnot při jednom
        //spuštění programu. Ukončení programu bude specifikováno jistou kombinací uživatelem zadávaných vstupních
        //hodnot nebo jako odpověď a/n na „dotaz položený programem“.

        Scanner sc = new Scanner(System.in);
        String loop = "0";

        while (!loop.equalsIgnoreCase("exit")){
            P7();
            System.out.println("For exit type: exit or Exit!");

            loop = sc.nextLine();
        }
    }
}
