package Unit4.notes;

import java.util.Locale;

public class PigLatin {

    public static String toPigLatin (String phrase){
        String translatedPhrase = "";
        String word = "";
        phrase = phrase.toLowerCase();
        int ticker = 0;
        for (int i = 0;i<phrase.length()-1;i++){
            if (phrase.charAt(i) == ' ') {

                word = phrase.substring(ticker, i);
                ticker = i + 1;

                translatedPhrase += (translateWordToPigLatin(word) + " ");
            }
        }

        word = phrase.substring(ticker);
        translatedPhrase+=translateWordToPigLatin(word);

        translatedPhrase = translatedPhrase.substring(0,1).toUpperCase() + translatedPhrase.substring(1);

        return(translatedPhrase);
    }


//----------------------------------------------------------------------------------------------------------------------
    public static String translateWordToPigLatin (String str){
        String output = str;
        int counter = 0;
        boolean isVowelTrue2 = checkVowel(str);

        if (isVowelTrue2 == true){
            output += "yay";
        }

        else {
            int i = 0;

            while ('a' != (str.charAt(i))  && 'e' != (str.charAt(i))  && 'i' != (str.charAt(i))
                    && 'o'!= (str.charAt(i)) && 'u' != (str.charAt(i)) && i < str.length()-1){
                output += str.substring(i,i+1);
                counter++;
                i++;
            }

            output += "ay";
        }
        output = output.substring(counter);
        return output;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static boolean checkVowel(String str){
        boolean isVowelTrue;

        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i'
                || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
            isVowelTrue = true;
        }
        else{
            isVowelTrue = false;
        }
        return isVowelTrue;
    }
//----------------------------------------------------------------------------------------------------------------------



}

