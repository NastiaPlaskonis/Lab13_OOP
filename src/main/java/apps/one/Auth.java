package apps.one;

public class Auth {
    public User login() {
        int n = 10;
        if (n > 1) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }

    // public void processData(String user) {
    //    String country = user.getCountry();
        
    // }
}