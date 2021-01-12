public class TextRealisation {
    public static void main(String[] args) {
        Word word1 = new Word ("this", ElementsType.START);
        Word word2 = new Word("is");
        Word word3 = new Word("FIRST",ElementsType.END);

        Sentence sentence1 = new Sentence();
        sentence1.setType(ElementsType.START);
        sentence1.addWord(word1);
        sentence1.addWord(word2);
        sentence1.addWord(word3);

        sentence1.print();

        sentence1.addWord(word1);

        sentence1.print();

        Sentence sentence2 = new Sentence("This is the second sentence.",ElementsType.REGULAR);
        Sentence sentence3 = new Sentence("This is new first sentence.",ElementsType.START);
        Sentence sentence4 = new Sentence("This is final sentence.",ElementsType.END);

        Text text = new Text();
        text.addSentence(sentence1);
        text.addSentence(sentence2);
        text.addSentence(sentence3);
        text.addSentence(sentence4);
        text.print();
    }
}
