package tutorial;
import java.util.Scanner;

public class Unyah {
public static void main(String[] arg){
    Scanner s = new Scanner(System.in);
    int feeling = 1, feeling2 = 2, feeling3 = 3, feeling4 = 4;
 
    System.out.print(" 1 - In need of motivation! \n "
            + "2 - feeling anxious and stressed. \n "
            + "3 - I'm feeling grateful! \n 4 - I'm feeling lost in life. \n");
    System.out.print("How are you feeling love? ");
   feeling = s.nextInt();
    System.out.println("Personally picked for you: ");
    if(feeling == 1){
        System.out.println("'If the Spirit of him who raised Jesus from the dead dwells in you, he who raised Christ Jesus \n from the dead will also give life to your mortal bodies through his Spirit who dwells in you.' "
                + "         \n                                                                                        Romans 8:11 ");
    }else if(feeling == 2){
        System.out.println("'That is why, for Christ's sake, I delight in weaknesses, in insults, in hardships,\n in persecutions, in difficulties. For when I am weak, I am strong' \n"
                + "                                              2 Corinthians 12:10");
    }else if(feeling == 3){
        System.out.println("'Thanks be to God for His indescribable gift' \n             "
                + "         2 Corinthians 9:15 NIV");
    }else if(feeling == 4){
        System.out.println("'He heals the brokenhearted and binds up their wounds.' \n                                         Psalm 147:3");
    }
}
}
