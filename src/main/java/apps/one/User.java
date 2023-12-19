package apps.one;

import java.time.LocalDate;
public interface User {

    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();

}