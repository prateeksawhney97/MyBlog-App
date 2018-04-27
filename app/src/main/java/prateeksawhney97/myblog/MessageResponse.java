package prateeksawhney97.myblog;

import com.google.gson.annotations.SerializedName;

public class MessageResponse {
    @SerializedName("message")
    String message;
    public String getMessage(){
        return message;
    }
}
