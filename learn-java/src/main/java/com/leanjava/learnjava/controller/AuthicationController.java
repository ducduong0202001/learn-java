package com.leanjava.learnjava.controller;

import com.leanjava.learnjava.dto.request.ApiReponse;
import com.leanjava.learnjava.dto.request.AuthenticationRequest;
import com.leanjava.learnjava.dto.request.IntrospectRequest;
import com.leanjava.learnjava.dto.response.AuthenticationResponse;
import com.leanjava.learnjava.dto.response.IntrospectResponse;
import com.leanjava.learnjava.service.AuthenticationService;
import com.nimbusds.jose.JOSEException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class AuthicationController {
    AuthenticationService authenticationService;


    @PostMapping("/log-in")
    public ApiReponse<AuthenticationResponse> authenticate(@RequestBody  AuthenticationRequest request){
        var result = authenticationService.authenticated((request));
        return ApiReponse.<AuthenticationResponse>builder()
                .result(result)
                .build();
    }

    @PostMapping("/introspect")
    public ApiReponse<IntrospectResponse> authenticate(@RequestBody IntrospectRequest request)
            throws JOSEException, ParseException {
        var result = authenticationService.introspect((request));
        return ApiReponse.<IntrospectResponse>builder()
                .result(result)
                .build();
    }
}
