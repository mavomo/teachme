package io.teachme.application

import org.junit.Test

class ApplicationTest {


    @Test
    void should_create_a_user_with_a_username() {
        Application app = new Application();

        User user = app.createUser("username");
            
        assert user != null
        assert user.name == "username"
    }
}
