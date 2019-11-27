package org.dominokit.website.layout.shared.model;

import org.dominokit.jacksonapt.annotation.JSONMapper;

@JSONMapper
public class LayoutResponse{

    private String serverMessage;

    public LayoutResponse() {
    }

    public LayoutResponse(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }
}
