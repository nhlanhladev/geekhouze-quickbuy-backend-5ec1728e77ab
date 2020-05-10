package com.geekhouze.stockdb_spring_backend.util;

public class Response {

    private Class[] payload;

    public Response(Class[] payload) {
        this.payload = payload;
    }

    public Class[] getPayload() {
        return payload;
    }

    public void setPayload(Class[] payload) {
        this.payload = payload;
    }
}
