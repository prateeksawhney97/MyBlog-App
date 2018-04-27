package prateeksawhney97.myblog;

import com.google.gson.annotations.SerializedName;

public class ErrorResponse {
    @SerializedName("error")
    String error;

    public ErrorResponse(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }
}
