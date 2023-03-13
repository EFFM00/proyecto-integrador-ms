package com.digitalmedia.users.repository;

import com.digitalmedia.users.model.User;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

public class KeycloakRepository implements IUserRepository{

    @Autowired
    private Keycloak client;

    @Value("${dh.keycloak.realm}")
    private String realm;

    @Override
    public User validateAndGetUser(String username) {

        UserRepresentation user = client.realm(realm).users().get(username).toRepresentation();
        return  user;
    };

    Optional<User> getUserExtra(String username);

    User saveUserExtra(User userExtra);

}
