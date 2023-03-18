package com.digitalmedia.users.repository;

import com.digitalmedia.users.model.KeycloakUser;
import com.digitalmedia.users.model.User;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Repository
public class KeycloakUserRepository implements IUserRepository{

    @Autowired
    private Keycloak keycloakClient;

    @Value("${dh.keycloak.realm}")
    private String realm;

    @Override
    public User validateAndGetUser(String username) {
        return null;
    }

    @Override
    public Optional<User> getUserExtra(String username) {
        return Optional.empty();
    }

    @Override
    public User saveUserExtra(User userExtra) {
        return null;
    }
}
