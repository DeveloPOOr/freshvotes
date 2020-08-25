package com.freshvotes.service;




import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

public class UserDetailServiceTest {

    @Test
    public void generateEncodedPassword() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123";
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
        assertEquals(rawPassword, encodedPassword);


}


}
