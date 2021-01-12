public class Sentence {
    private String sentence;
    private ElementsType type;

    public Sentence() {
        this.sentence = "";
    }

    public Sentence(String sentence, ElementsType type) {
        this.sentence = sentence;
        this.type = type;
    }

    public void addWord(Word word){
        String newWord = word.getWord().toLowerCase();
        if(word.getType().equals(ElementsType.START)) {

            this.sentence = this.sentence.toLowerCase();
            newWord = newWord.substring(0, 1).toUpperCase() + newWord.substring(1);
            this.sentence = newWord + " " + this.sentence;

        } else if (word.getType().equals(ElementsType.END)){

            this.sentence = this.sentence + newWord + ". ";

        } else if (word.getType().equals(ElementsType.REGULAR)){

            this.sentence = this.sentence + newWord + " ";
        }
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public ElementsType getType() {
        return type;
    }

    public void setType(ElementsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return sentence;
    }

    public void print (){
        System.out.println(this.sentence);
    }

}
