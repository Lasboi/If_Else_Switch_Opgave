//Vi importere scanner klassen så vi kan lege lidt med den
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        //Vi angiver vores instans variabler som vi benytter gennem koden
        int power = 65;
        int powerPercent = 4;
        String answer = "";
        int charge = 0;

        //Vi opretter en ny scanner
        Scanner scanner = new Scanner(System.in);

        //Vi printer text ud til brugeren
        System.out.println("******************************************");
        System.out.println("Telefonen har " + power +"% strøm tilbage");

        //Vi laver en if statement
        if (power < 50)
            System.out.println("Din telefon skal oplades");
        else
            System.out.println("Din telefon har massere af strøm tilbage");

        System.out.println("******************************************");
        System.out.println("1 time senere........");
        System.out.println("******************************************");

        //Vi laver en switch
        switch (powerPercent){
            case 0:
                System.out.println("Du har mindre end 10% strøm tilbage");
                break;
            case 1:
                System.out.println("Du har mindre end 20% strøm tilbage");
                break;
            case 2:
                System.out.println("Du har mindre end 30% strøm tilbage");
                break;
            case 3:
                System.out.println("Du har mindre end 40% strøm tilbage");
                break;
            case 4:
                System.out.println("Du har mindre end 50% strøm tilbage");
                break;
            case 5:
                System.out.println("Du har mindre end 60% strøm tilbage");
                break;
            case 6:
                System.out.println("Du har mindre end 70% strøm tilbage");
                break;
            case 7:
                System.out.println("Du har mindre end 80% strøm tilbage");
            case 8:
                System.out.println("Du har mindre end 90% strøm tilbage");
                break;
            case 9:
                System.out.println("Du har mindre end 100% strøm tilbage");
                break;
            default:
                System.out.println("Du har 100% strøm på din telefon");
        }

        System.out.println("******************************************");
        System.out.println("Ønsker du at oplade din telefon?");
        System.out.print("Ja/Nej: ");
        answer = scanner.next(); //Vi sætter vores answer String til det input brugeren skriver
        System.out.println("******************************************");

        //Vores if og else if statement
        if (answer.equalsIgnoreCase("ja")) {
            System.out.println("Hvor længe vil du oplade telefonen?");
            System.out.print("Skriv et tal mellem 1-10: ");
            charge = scanner.nextInt();
            System.out.println("******************************************");
        }
        else if (answer.equalsIgnoreCase("nej"))
            System.out.println("Nå så skal du da være fri!");

        //Endu en switch bare fordi vi kan
        switch (charge){
            case 0:
                System.out.println("Du har ikke fået noget strøm på din telefon");
                break;
            case 1:
                System.out.println("Du har opladet din telefon i 1 time og har fået 10% ekstra strøm");
                break;
            case 2:
                System.out.println("Du har opladet din telefon i 2 timer og har fået 20% ekstra strøm");
                break;
            case 3:
                System.out.println("Du har opladet din telefon i 3 timer og har fået 30% ekstra strøm");
                break;
            case 4:
                System.out.println("Du har opladet din telefon i 4 timer og har fået 40% ekstra strøm");
                break;
            case 5:
                System.out.println("Du har opladet din telefon i 5 timer og har fået 50% ekstra strøm");
                break;
            case 6:
                System.out.println("Du har opladet din telefon i 6 timer og har fået 60% ekstra strøm");
                break;
            case 7:
                System.out.println("Du har opladet din telefon i 7 timer og har fået 70% ekstra strøm");
            case 8:
                System.out.println("Du har opladet din telefon i 8 timer og har fået 80% ekstra strøm");
                break;
            case 9:
                System.out.println("Du har opladet din telefon i 9 timer og har fået 90% ekstra strøm");
                break;
            case 10:
                System.out.println("Du har opladet din telefon i 10 timer og har fået 100% ekstra strøm");
                break;
        }

        //Tror dette siger alt af sig selv
        System.out.println("******************************************");
        System.out.println("******** Kodet af den seje Lasse ********");
        System.out.println("******************************************");
    }
}
