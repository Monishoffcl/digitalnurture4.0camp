package com.mockitoexamp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) 
public class UserServiceTest {

    @Mock
    private UserServiceAPI userServiceAPI; 

    @InjectMocks
    private UserService userService; 

    @Test
    public void testFetchUserDetails() {

        when(userServiceAPI.getUserDetails("123")).thenReturn("Mocked user details for 123");

        String result = userService.fetchUserDetails("123");

        assertEquals("Mocked user details for 123", result);
        verify(userServiceAPI).getUserDetails("123"); 
    }
}
