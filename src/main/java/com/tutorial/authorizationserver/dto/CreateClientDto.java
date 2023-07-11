package com.tutorial.authorizationserver.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateClientDto {
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("authentication_methods")
    private Set<ClientAuthenticationMethod> authenticationMethods;
    @JsonProperty("authorization_grant_types")
    private Set<AuthorizationGrantType> authorizationGrantTypes;
    @JsonProperty("redirect_uris")
    private Set<String> redirectUris;
    @JsonProperty("scopes")
    private Set<String> scopes;
    @JsonProperty("require_proof_key")
    private boolean requireProofKey;
}
