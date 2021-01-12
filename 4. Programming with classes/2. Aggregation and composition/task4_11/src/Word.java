public class Word {
    String word;
    ElementsType type;

    public Word (){
        this.word = "";
        this.type = ElementsType.REGULAR;
    }

    public Word(String word) {
        this.word = word;
        this.type = ElementsType.REGULAR;
    }

    public Word(String word, ElementsType type) {
        this.word = word;
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ElementsType getType() {
        return type;
    }

    public void setType(ElementsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return word ;
    }
    public void print (){
        System.out.println(this.word);
    }

}
