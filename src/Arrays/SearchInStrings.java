package Arrays;

public class SearchInStrings {
    static void main() {
        String name="Ahmer";
        char me='u';
        System.out.println(searchingMethod(name,me));
    }

    private static boolean searchingMethod(String name, char me) {
        if (name.isEmpty()){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if (me==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
