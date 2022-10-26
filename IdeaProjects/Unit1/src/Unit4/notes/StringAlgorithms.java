package Unit4.notes;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        String output = "";
        for (int i = 0; i < mySchool.length(); i += 2) {
            output += mySchool.charAt(i);
        }
        System.out.println(output);
        // print the String mySchool in reverse (all characters on the same line)

        String output2 = "";
        for (int i = mySchool.length() - 1; i >= 0; i--) {
            output2 += mySchool.charAt(i);
        }
        System.out.println(output2);





         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "Monkey";

        String output3 = "";
        for (int i = 0; i < animal.length(); i ++) {
            output3 += animal.charAt(i);
            System.out.println(output3);
        }




        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb. ";
        phrase += "Mary had a little  lamb, its fleece was white as snow";


        // Print the amount of times the word "little" appears within phrase?

        int output4 = 0;
        for (int i = 0; i < phrase.length()-6; i++) {
            if (phrase.substring(i,i+6).equals("little")) {
                output4++;
            }
        }
        System.out.println(output4);



        // create a new String, or modify the existing String, that removes
        // the word "little" entirely


        int marker = 0;
        int j = 0;
        String output5 = "";
        for (int i = 0; i < phrase.length()-6; i++) {
            if (phrase.substring(i,i+6).equals("little")) {
                output5 += phrase.substring(marker, i-1);
                marker = i + 6;
                j = i;
            }
        }
        output5 += phrase.substring(j+7);
        System.out.println(output5);




        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        int marker2 = 0;
        int j2 = 0;
        String output6 = "";
        for (int i = 0; i < phrase.length()-6; i++) {
            if (phrase.substring(i,i+6).equals("little")) {
                output6 += phrase.substring(marker2, i);
                output6 += "BIG";
                marker2 = i + 6;
                j2 = i;
            }
        }
        output6 += phrase.substring(j2+7);
        System.out.println(output6);



    }
}