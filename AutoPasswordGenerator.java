import java.util.Random;

public class AutoPasswordGenerator {

    public static void main(String[] args) {
        int length=12;
        System.out.println("Your AutoGenerated Password is: ");
        System.out.print(generatePassword(length));
    }
    static char[] generatePassword(int length){
        String uppercase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase= "abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String characters="`~!@#$%^&*()-_+=/<>[]{}|?";

        String combinedChar=(uppercase+lowercase+numbers+characters);

        Random rand =new Random();
        char[] password= new char[length];

        for (int i=0; i<length ;i++){
        	password[i]= combinedChar.charAt(rand.nextInt(combinedChar.length()));
            }
        return password;
    }
}