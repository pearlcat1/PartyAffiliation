import java.util.Scanner;

public class PartyAffiliation
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        IO.println("Enter you Party Affiliation [D R I]: ");
        partyAfil = in.nextLine();

        switch(partyAfil)
        {
            case "D":
                IO.println("You get a Democratic Donkey");
                return;
            case "R":
                IO.println("You get a Republican Elephant");
                return;
            case "I":
                IO.println("You get an Independent Person");
                return;
            default:
                IO.println("I do not know what that party is! " + partyAfil);
        }
    }
}
