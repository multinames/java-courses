package app.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> {
    @JsonProperty
    private boolean success;
    @JsonProperty
    private T message;

    public Response(){}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", message=" + message +
                '}';
    }
}
