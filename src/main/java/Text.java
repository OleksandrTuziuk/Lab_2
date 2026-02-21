public class Text {
    final private String text;

    public Text(String t) {
        this.text = t;
    }

    public Text() {
        this.text = "";
    }

    private int getNumberOfLetters(char l, String s) {
        int numberOfLetters = 0;
        for (char c : s.toCharArray()) {
            if (c == l) {
                numberOfLetters++;
            }
        }
        return numberOfLetters;
    }

    public String sort(char l) {
        final String[] splited = this.text.split(" ");

        for (int i = 1; i < splited.length; i++) {
            final int numberOfLettersI = getNumberOfLetters(l, splited[i]);
            for (int c = 0; c < i; c++) {
                final int numberOfLettersC = getNumberOfLetters(l, splited[c]);
                if (numberOfLettersI < numberOfLettersC) {
                    final String temp = splited[c];
                    splited[c] = splited[i];
                    for (int d = i; d > c + 1; d--) {
                        splited[d] = splited[d - 1];
                    }
                    splited[c + 1] = temp;
                    break;
                }
            }
        }
        return String.join(" ", splited);
    }
}
