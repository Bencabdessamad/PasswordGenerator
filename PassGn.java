import java.util.Random;

public class PassGn {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(geek_Password(length));
    }

    static String geek_Password(int len) {
        System.out.println("Generating password using random():");
        System.out.print("Your password is: ");
        String Capital_Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Smalll_Chars = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";
        String Special_Chars = "!@#$%^&*()_+-={}[]:";
        String values = Capital_Chars + Smalll_Chars + Numbers + Special_Chars;
        Random rand = new Random();
        StringBuilder password = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            password.append(values.charAt(rand.nextInt(values.length())));
        }

        return password.toString();
    }
}
