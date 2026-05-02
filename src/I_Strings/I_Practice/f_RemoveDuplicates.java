package I_Strings.I_Practice;
import java.util.*;

public class f_RemoveDuplicates {
    public String removeDuplicateLetters(String s) {
        Set<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        String str="";
        for(int i=0; i<26; i++){
            if(set.contains((char)('a'+i))){
                str = str+(char)('a'+i);
            }
        }
        return str;
    }

    public String removeDuplicateLetters2(String s) {
        Set<Character> set=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        String str="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                str= str+ch;
                set.remove(ch);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        f_RemoveDuplicates f=new f_RemoveDuplicates();
        System.out.println(f.removeDuplicateLetters(s));

    }
}
