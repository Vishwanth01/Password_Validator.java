import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        String Password;
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        System.out.print("Enter your Password: ");
        Password = scanner.nextLine();
        
        if (PasswordValidator.isValid(Password)) {
            System.out.println("Password is valid.");
            break;
        } 
        else {
            System.out.println("Password is invalid.");
        }
    }
    }
}

class PasswordValidator{
    public static boolean isValid(String Password){
        if (Password.length() < 8){
            System.out.println("The password is too short!");
            return false;
        }
        boolean hasuppercase = false;
        boolean hasdigit = false;
        for (int i=0; i<Password.length(); i++){
            char ch = Password.charAt(i);

            if (Character.isUpperCase(ch)){
                hasuppercase = true;
            }
        
            if (Character.isDigit(ch)){
                hasdigit = true;
            }
        }
            if (!hasuppercase) {
                System.out.println("The Password must have at least one uppercase letter!");
            }

            if (!hasdigit) {
                System.out.println("The Password must have at least one digit!");
            }
        return hasuppercase && hasdigit;
    }
}