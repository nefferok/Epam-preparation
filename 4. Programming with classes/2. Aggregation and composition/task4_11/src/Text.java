public class Text {
    String sentences;
    ElementsType type;

    public Text(String sentenses) {
        this.sentences = sentenses;
        this.type = ElementsType.REGULAR;
    }

    public Text() {
        this.sentences = "";
        this.type = ElementsType.REGULAR;
    }

    public void addSentence(Sentence newSentence){

        if(newSentence.getType().equals(ElementsType.START)) {

            this.sentences = "\t" + newSentence + " " + this.sentences;

        } else if (newSentence.getType().equals(ElementsType.END)){

            this.sentences = this.sentences + newSentence + "\n";

        } else if (newSentence.getType().equals(ElementsType.REGULAR)){

            this.sentences = this.sentences + newSentence + " ";
        }
    }

    public String getSentenses() {
        return sentences;
    }

    public void setSentenses(String sentenses) {
        this.sentences = sentenses;
    }

    public ElementsType getType() {
        return type;
    }

    public void setType(ElementsType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return sentences;
    }
    public void print (){
        System.out.println(this.sentences);
    }
}
