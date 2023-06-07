package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.dto.JwtResponseDto;
import com.innowise.springemployeedataaccounting.dto.LoginDto;
import com.innowise.springemployeedataaccounting.jwt.JwtUtil;
import com.innowise.springemployeedataaccounting.model.Employee;
import com.innowise.springemployeedataaccounting.service.JwtAuthUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class JwtAuthController {

    private AuthenticationManager authenticationManager;
    private JwtAuthUserDetailsService jwtAuthUserDetailsService;
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public JwtResponseDto login(@RequestBody LoginDto loginDto) {
        var usernamePasswordAuthToken = new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword());
        authenticationManager.authenticate(usernamePasswordAuthToken);

        UserDetails userDetails = jwtAuthUserDetailsService.loadUserByUsername(loginDto.getEmail());
        String token = jwtUtil.generateToken(userDetails);

        return new JwtResponseDto(token);
    }

    @PostMapping("/logout")
    @ResponseStatus(HttpStatus.OK)
    public void logout() {
    }

}
