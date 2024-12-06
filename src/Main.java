

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int count=0;
        int counter=0;
        String sentence="Salam sabahin xeyr  necesen, necesen Salam coxsagol yaxsiyam";
        String clear=sentence.toLowerCase().replaceAll("[,\\.]", "");
        String  [] array=clear.split(" ");

        ArrayList<String> letters=new ArrayList<>();
        HashMap<String,Integer> map_letters=new HashMap<>();
        for(String letter:array)  {
            if(letter.equals("salam")) {
                count++;
                map_letters.put("salam",count);

            }else if(letter.equals("necesen")) {
                counter++;
                map_letters.put("necesen",counter);
            }
        }
        System.out.println(map_letters.get("salam"));
        System.out.println(map_letters.get("necesen"));

    }

}
