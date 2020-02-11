package app.entity;

public class Stub {
    private String answer;

    public Stub() {
    }

    public Stub(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Stub{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
