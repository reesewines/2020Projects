import java.util.Scanner;

public class PwMgr {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String newUserName="";
        String newPassword="";

        System.out.println("Would You Like To Create A New Account Or Login? (c/l): ");
        String cOrL=in.nextLine();
        if (cOrL.equals("c")){
            System.out.println();
            System.out.println("What would you like your username to be?");
            newUserName=in.nextLine();
            while (newUserName.length()<=7){
                System.out.println("Your username is too short!");
                System.out.println("What would you like your username to be?");
                newUserName=in.nextLine();
                System.out.println();
            }
            System.out.println();
            System.out.println("What would you like your password to be?");
            newPassword=in.nextLine();
            while (newPassword.length()<=7){
                System.out.println("Your password is too short!");
                System.out.println("What would you like your password to be?");
                newPassword=in.nextLine();
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println("Your username is "+ newUserName+ " and your password is "+ newPassword);
        }
        else{
            System.out.println("Please enter your username: ");
            String existingUserName=in.nextLine();
            System.out.println("Please enter your password: ");
            String existingPassword=in.nextLine();
        }


    }
    
}
