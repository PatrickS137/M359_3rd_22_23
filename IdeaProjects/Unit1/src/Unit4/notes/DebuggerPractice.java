package Unit4.notes;

public class DebuggerPractice {
    public static void main(String[] args) {
        int sum = 0;
        String name ="Shrek";
        for (int i = 0; i < 5; i++){
            sum += i;
        }
        revString(name);  //it will seem like nothing happened since value wasnt saved
        System.out.println(revString(name));  //prints the value
    }
    public static String revString(String str){
        String revStr = "";

        for (int i = str.length() - 1; i>= 0; i--){
            revStr += str.charAt(i);
        }

        return revStr;
    }

}


/*

If you search “Pig Latin” online, you will see there are many variations.  For consistency, we will follow this limited set of rules shown below.  You only need to worry about these three rules in your solution.
1. words beginning with consonants -> consonant/consonant cluster goes to end, add "ay"
cat -> atcay
black -> ackblay
2. words beginning with vowels -> add "yay" to the end
oval -> ovalyay
apple -> appleyay
3. words beginning with y -> treat y as a consonant
yellow -> ellowyay

For your lab, you need to create a PigLatin.java class that follows these criteria:
Create several static methods to assist in the conversion of a phrase from normal English to Pig Latin
toPigLatin
This method will accept the entire phrase from the tester program that needs to be converted.
This method must call translateWordToPigLatin
translateWordToPigLatin
This method will translate a single word.
This method must call at least one helper method to assist in the process of translating the word.
Helper method of your choice, to be called in translateWordToPigLatin.
Suggestion - use a helper method to check if one of the rules is true or false
The PigLatin class does not need to have any instance variables, do not create any.
The PigLatin class does not need a constructor, do not create one.



 */