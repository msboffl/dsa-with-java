package Arrays.Substrings;

public class GenerateSubstrings {
    public static void main(String[] args) {
        String name = "abc";

        for(int i = 0; i < name.length(); i++) {
            for(int j = i; j < name.length(); j++) {
                System.out.println(name.substring(i, j+1));
            }
        }
    }
}
