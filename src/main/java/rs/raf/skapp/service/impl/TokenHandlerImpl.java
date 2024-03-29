package rs.raf.skapp.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import rs.raf.skapp.service.tokenHandlerservice;

@Service
public class TokenHandlerImpl implements tokenHandlerservice {

    private static final String KEY = "a4B4SjAKwXCP9H37a4B4SjAKwXCP9H37a4B4SjAKwXCP9H37";

    @Override
    public String getTokenByEmail(String email) {
        return Jwts.builder().setSubject(email)
                .signWith(SignatureAlgorithm.HS512, KEY)
                .compact();
    }

    @Override
    public String getEmailByToken(String token) {
        return Jwts.parser().setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
