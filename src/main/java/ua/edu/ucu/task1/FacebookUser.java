package ua.edu.ucu.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class FacebookUser {
    private String email;
    private String userCountry;
    private String userActiveTime;

    public String getUserMail(){

        return email;
    }
    public String getCountry(){
        return userCountry;

    }
    public String getLastActiveTime(){
        return userActiveTime;
    }
}
