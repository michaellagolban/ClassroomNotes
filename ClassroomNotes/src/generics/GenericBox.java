/*
 * Generic Box
 */
package generics;

/**
 *
 * @author Michaela
 */
public class GenericBox<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
    
}
