package ro.siit.generics;

public class Present<T> {
    private T content;
    public Present(T content) {
        this.content = content;
        // this.content  = new T();
    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
}
