package ro.siit.patterns.creational.builder;

public class PoemBuilder {
    private String title;
    private String author;
    private String content;
    public PoemBuilder setTitle(String title){
        this.title = title;
        return this;
    }
    public PoemBuilder setAuthor(String author){
        this.author = author;
        return this;
    }
    public PoemBuilder setContent(String content){
        this.content = content;
        return this;
    }
    public Poem createPoem(){
        Poem poem = new Poem(title, author, content);
        return poem;
    }
}
