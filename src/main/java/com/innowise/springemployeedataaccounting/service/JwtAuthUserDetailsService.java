package com.innowise.springemployeedataaccounting.service;

import com.innowise.springemployeedataaccounting.dao.EmployeeRepository;
import com.innowise.springemployeedataaccounting.model.Employee;
import com.innowise.springemployeedataaccounting.model.EmployeeUserDetails;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JwtAuthUserDetailsService implements UserDetailsService {

    private EmployeeRepository employeeRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee userFromDatabase = employeeRepo.findByEmail(username);
        if (userFromDatabase == null) {
            throw new UsernameNotFoundException("User not found with email: " + username);
        }
        return new EmployeeUserDetails(userFromDatabase);
    }
}
