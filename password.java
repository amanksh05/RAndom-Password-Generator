package Project;

//import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        System.out.println("\n\n***** Welcome to password generator ***** \n\n");

        System.out.print("Enter the length of password you want to generate: ");
        Scanner s =new Scanner(System.in);
        int size = s.nextInt();

        if(size<4){
            System.out.println("!!!!!!!!  Please generate password of size atleast 4   !!!!!!!!");
        }
        else{
            System.out.println(generatePassword(size));
        }


        
    }

    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}