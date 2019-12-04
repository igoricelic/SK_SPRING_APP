package rs.raf.skapp.service;

public interface tokenHandlerservice {

    String getTokenByEmail(String email);

    String getEmailByToken(String token);

}
