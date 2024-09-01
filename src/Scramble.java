import java.util.ArrayList;
import java.util.List;

public class Scramble{
    public static String scrambleWord(String word){
        String ans = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'A'){
                if(i != word.length()-1 && word.charAt(i+1) != 'A'){
                    ans += word.charAt(i+1) + "A";
                    i += 1;
                }else{
                    ans += "A";
                }
            }else{
                ans += word.charAt(i);
            }
        }

        return ans;
    }
    public static List<String> scrambleOrRemove(List<String> wordList){
       // ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < wordList.size(); i++){
            String scrambleWord = scrambleWord(wordList.get(i));
            if(scrambleWord.equals(wordList.get(i))){
                wordList.remove(scrambleWord);
                i--;
            } else{
                wordList.set(i,scrambleWord);
            }

        }
        return wordList;
    }
}
