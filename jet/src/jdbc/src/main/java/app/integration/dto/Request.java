package app.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request<T> {
    @JsonProperty
    private String service;
    @JsonProperty
    private T data;

    public Request(){}

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "service='" + service + '\'' +
                ", data=" + data +
                '}';
    }
}
