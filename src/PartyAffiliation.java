import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String partyAffiliation = "";

    System.out.println("What is your party affiliation? (D, R, or I)");
        partyAffiliation = userInput.nextLine();

if (partyAffiliation.equals("D")){
    System.out.print("You get a Democratic Donkey");}

    else if (partyAffiliation.equals("R")){
        System.out.print("You get a Republican Elephant");}

    else if (partyAffiliation.equals("I")) {
        System.out.print("You get a Person");}

    else{

    System.out.print("You get Other");

}
    }
}
