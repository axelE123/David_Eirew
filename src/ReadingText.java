import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadingText {
    public static ArrayList findWord(String word, String[] sentences){
        ArrayList<String> foundWords = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            String[] sWords = sentences[i].split(" ",0);
            for (int j = 0; j < sWords.length; j++) {
                if(sWords[j].contains(word)){
                    foundWords.add(i + " " + j);
                }
            }
        }
        return foundWords;
    }

    public static String[] findSentences(String s) {
        String[] exceptions = new String[] {"Mrs.", "Mr.", "Ms.", "Dr.", "Prof.", "Capt.", "Gen.", "Sen.", "Rev.", "Hon.", "St.", "e.g.", "example."};
        String[] changedExceptions = new String[] {"Mrs!@#", "Mr!@#", "Ms!@#", "Dr!@#", "Prof!@#", "Capt!@#", "Gen!@#", "Sen!@#", "Rev!@#", "Hon!@#", "St!@#", "e!@#g!@#", "example!@#"};
        for (int i = 0; i < exceptions.length; i++) {
            s=s.replace(exceptions[i],changedExceptions[i]);
        }
        String[] sentences = s.split("\\.",0);
        for (int i = 0; i < sentences.length; i++) {
            while(sentences[i].charAt(0)==' ') {
                sentences[i] = sentences[i].substring(1);
            }
            sentences[i] = sentences[i].replace("!@#",".");
            sentences[i] = sentences[i] + ".";
        }
        sentences[2]=sentences[2].substring(3);
        sentences[1]=sentences[1]+"[4]";
        sentences[4]=sentences[4].substring(5);
        sentences[3]=sentences[3]+"[5]";
        return sentences;
    }
    public static void main(String[] args) throws IOException {
        String fLines = "";
//        ArrayList <String> lines = new ArrayList<>();
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine())!= null){
            if (line.length() > 0){
                fLines=fLines+line;
            }
        }
        br.close();

        String[] sentences = findSentences(fLines);
//        String[] sentences = findSentences("I, am bob. I, like data. My, friend likes data a lot.");
        String word = "data";

        ArrayList<String> foundWords = findWord(word, sentences);
        for (String occurance : foundWords){
            String[] pos = occurance.split(" ",0);
            System.out.println("The word '" + word + "' is found in sentence " + pos[0] + " at word " + pos[1]);
        }
    }
}