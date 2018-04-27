package prateeksawhney97.myblog;

import com.google.gson.annotations.SerializedName;

public class AuthenticationRequest {
    @SerializedName("username")
    String username;
    @SerializedName("password")
    String password;
    public AuthenticationRequest(String username, String password){
        this.username=username;
        this.password=password;
    }
}
