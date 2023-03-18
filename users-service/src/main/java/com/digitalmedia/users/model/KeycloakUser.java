package com.digitalmedia.users.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KeycloakUser {
    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;

}
