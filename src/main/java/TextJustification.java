import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<List<String>> lines = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;

        for (String word : words) {
            if (currentLineLength + word.length() + currentLine.size() > maxWidth) {
                //push current line
                lines.add(new ArrayList<>(currentLine));
                currentLine.clear();
                currentLineLength = 0;
            }

            currentLine.add(word);
            currentLineLength += word.length();
        }

        //append last line
        if (!currentLine.isEmpty()) {
            lines.add(new ArrayList<>(currentLine));
        }


        //2. Justify
        List<String> result = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            StringBuilder sb = new StringBuilder();

            int totalChars = line.stream().mapToInt(String::length).sum();
            int spacesNeeded = maxWidth - totalChars;

            //if last line or only one word -> left justified
            if (i == lines.size() - 1 || line.size() == 1) {
                sb.append(String.join(" ", line));
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                int gaps = line.size() - 1;
                int spacesPerGap = spacesNeeded / gaps;
                int extraSpaces = spacesNeeded % gaps;

                for (int j = 0; j < line.size(); j++) {
                    sb.append(line.get(j));
                    if (j < gaps) {
                        for (int s = 0; s < spacesPerGap; s++) {
                            sb.append(" ");
                        }
                        if (j < extraSpaces) sb.append(" ");
                    }
                }
            }

            result.add(sb.toString());

        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words, 16));
    }
}
