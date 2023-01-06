package nl.logius.security.keycloak.authorization.model;

import io.quarkus.security.identity.SecurityIdentity;

public record User (String userName){

    public User(SecurityIdentity securityContext) {
        this(securityContext.getPrincipal().getName());//TODO
    }
}