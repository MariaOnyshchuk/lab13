package ua.edu.ucu.task1;

import java.time.LocalDateTime;

public class Main {
    public static void Main(String[] args){
        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = null;
        switch(authMethod){
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("email@gmail.com", "Ukraine", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;

            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("email@gmail2.com", "USA", LocalDateTime.now().minusDays(1).toString());
                user = new TwitterUserAdapter(twitterUser);
                break;

            default:
                break;
        }
        MessageSender messageSender = new MessageSender();
        messageSender.send(user, " hello!");
    }
}
