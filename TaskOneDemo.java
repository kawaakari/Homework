package lesson10;

import java.util.HashMap;
import java.util.List;
import lesson10.TaskOneUtil;

public class TaskOneDemo {

    public static void main(String[] args) {
        String originalText = "If you really want to hear about it, the first thing you'll probably want to know is\n" +
                "where I was born, an what my lousy childhood was like, and how my parents were\n" +
                "occupied and all before they had me, and all that David Copperfield kind of crap, but I\n" +
                "don't feel like going into it, if you want to know the truth. In the first place, that stuff\n" +
                "bores me, and in the second place, my parents would have about two hemorrhages apiece\n" +
                "if I told anything pretty personal about them. They're quite touchy about anything like\n" +
                "that, especially my father. They're nice and all--I'm not saying that--but they're also\n" +
                "touchy as hell. Besides, I'm not going to tell you my whole goddam autobiography or\n" +
                "anything. I'll just tell you about this madman stuff that happened to me around last\n" +
                "Christmas just before I got pretty run-down and had to come out here and take it easy.";

        List<String> words = TaskOneUtil.splitTextIntoWords(originalText);
        HashMap<String, Integer> countedWords = TaskOneUtil.wordCount(words);
        System.out.println(countedWords);
    }
}