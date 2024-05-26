package com.zosh.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public ApiResponse() {
        super();
    }

    public ApiResponse(String message, boolean status) {
        super();
        this.message = message;
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private boolean status;

}
