import java.io.Serializable;

public class Quote implements Serializable {

    private int quoteId;
    private int authorId;
    private String content;

    public Quote() {
    }

    public Quote(int quoteId, int authorId, String content) {
        this.quoteId = quoteId;
        this.authorId = authorId;
        this.content = content;
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}