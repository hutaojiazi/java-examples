package tutorial.example.day7;

public abstract class Animal implements AnimalBehavior {
    // parent class
    protected String head;
    protected String body;

    // public, private, protected

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
