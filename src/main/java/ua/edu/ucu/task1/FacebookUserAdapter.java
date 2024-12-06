package ua.edu.ucu.task1;

public class FacebookUserAdapter implements User{

    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String email() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return facebookUser.getLastActiveTime();

    }
    @Override
    public String toString() {
        return "Email: "+ email() +", Country; "+getCountry();

    }
}
