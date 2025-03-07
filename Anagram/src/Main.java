import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s= "listen",t="silent";
        System.out.println(checkAnagram(s,t));

    }

    static boolean  checkAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}