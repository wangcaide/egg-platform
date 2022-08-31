package xyz.wangcaide.egg.platform.auth;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoders;
import reactor.core.publisher.Mono;

public class JwkTest {

    public static void main(String[] args) {
        String issuerUri = "http://localhost:9000/oauth2/jwks";
//        ReactiveJwtDecoder jwtDecoder = ReactiveJwtDecoders.fromIssuerLocation(issuerUrl);
        ReactiveJwtDecoder jwtDecoder = NimbusReactiveJwtDecoder.withJwkSetUri(issuerUri).build();

        String token = "eyJraWQiOiIwYWIxNjM4OS1lNGI2LTRkMjAtOWZmNS04N2QxNzc5NjZmNWUiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImF1ZCI6Im1lc3NhZ2luZy1jbGllbnQiLCJuYmYiOjE2NTc1NTUzMDksInNjb3BlIjpbIm9wZW5pZCJdLCJpc3MiOiJodHRwOlwvXC9sb2NhbGhvc3Q6OTAwMCIsImV4cCI6MTY1NzU1NTYwOSwiaWF0IjoxNjU3NTU1MzA5fQ.o6DE9vBv8rWggbF6FDR1jnbEamUbT2kRnNXRy1ohw1xRx2XUKyequ7lOq13S2nC4CncNbyYCm8kLPx7Pc6GyuOowbsJH0D9oahsWitVMu47O_strgShdw4YM9XZfyxP6muORKAQ25BPqNa6Nk4dg3LP6Y3cQBhdn0gdy_ee_VANPsTle_YdKwdEWJjjFUYzx8nSru7YMMHK22_myXsMrHcog3FxxwI2NFc2ca41UeTxP8DY9h3DnF5IcvkBREynoH38a41D6vfhEi74p3_mdKfyAM05hc9llBXzdqW55SZZAywBXaH4nQEfdKscMlPC7utowMJhroGmAMLPo3JJkNw";
        jwtDecoder.decode(token).block();
        jwtDecoder.decode(token).block();
        try {
            jwtDecoder.decode(token + "1").block();
        } catch (Exception e) {
        }
        jwtDecoder.decode(token).block();
        jwtDecoder.decode(token).block();

        //        Jwt jwt = jwtDecoder.decode(token).block();
//        jwt.getHeaders().forEach((k, v) -> {
//            System.out.println(String.format("key -> %s, value -> %s", k, v));
//        });
//        System.out.println(jwt.getSubject());
    }

}
