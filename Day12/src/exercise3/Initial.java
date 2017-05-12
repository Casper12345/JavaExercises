package exercise3;

/**
 * Created by Casper on 10/03/2017.
 */
public class Initial {

    public String getInitials(String fullName) {
        String result = "";

        if(fullName.contains("  ")){
            fullName = fullName.replaceFirst(" ","");
        }

        String[] words = fullName.split(" ");

        for (int i = 0; i < words.length; i++) {
                String nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();

            }
        return result;

    }
}
