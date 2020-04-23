package studios;

import java.util.HashMap;
import java.util.Map;

public class StudioTwo {

    public static void main(String[] args) {

        HashMap<Character, Integer> charList = new HashMap<>();
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = phrase.toCharArray();

        for (char singleChar : charactersInString) {
            if(charList.containsKey(singleChar)){
                int tempNum = charList.get(singleChar);
                charList.replace(singleChar, tempNum + 1);
            } else {
                charList.put(singleChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> singleCharOfList : charList.entrySet()) {
            System.out.println(singleCharOfList.getKey() + ": " + singleCharOfList.getValue());
        }

    }
}
