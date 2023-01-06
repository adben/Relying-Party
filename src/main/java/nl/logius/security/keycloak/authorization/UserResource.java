package nl.logius.security.keycloak.authorization;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.security.identity.SecurityIdentity;
import nl.logius.security.keycloak.authorization.model.User;

@Path("/api/users")
public class UserResource {

    @Inject
    SecurityIdentity keycloakSecurityContext;

    @GET
    @Path("/me")
    public User me() {
        return new User(keycloakSecurityContext);
    }


}
