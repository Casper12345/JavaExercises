package exercise4;

public class ExerciseFour {

    public static void main(String[] args) {

        ExerciseFour e = new ExerciseFour();
        if(e.palindrome("hannah")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    private boolean palindrome(String word){

        if(word.length() == 0 || word.length() == 1)
            return true;
        if(word.charAt(0) == word.charAt(word.length()-1))
            return palindrome(word.substring(1, word.length()-1));

        return false;
    }


}


