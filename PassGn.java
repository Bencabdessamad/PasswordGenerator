import java.util.*;
public class PassGn{
    public static void main(String[] args) {
        int length = 10;
        System.out.println(geek_Password(length));
    }
    static char[] geek_Password(int len){
        System.out.println("Generating password using random() :    ");
        System.out.println("Your password is :");
        String Capital_Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Smalll_Chars = "abcdefghijklmopqrstuvwxyz";
        String Numbers = "0123456789";
        String Special_Chars = "!@#$%^&*()_+-={}[]:";
        String values = Capital_Chars+Smalll_Chars+Numbers+Special_Chars;
        Random rand = new Random();
        char[] password = new char[len];
        for(int i=0;i<len;i++){
            password[i] = values.charAt(rand.nextInt(values.length()));
        }
        return password;
    }
        
}