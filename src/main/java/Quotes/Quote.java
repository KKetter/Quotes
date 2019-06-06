package Quotes;

public class Quote {
    public String[] tags;
    public String author;
    public String likes;
    public String text;

    public String toString(){
        return "\" " + this.text + "\nby " + this.author;
    }
}
