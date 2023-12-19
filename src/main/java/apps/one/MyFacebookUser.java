package apps.one;

import java.time.LocalDate;

public class MyFacebookUser implements User{

    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getUserActiveTime().toLocalDate();
        
    }
}