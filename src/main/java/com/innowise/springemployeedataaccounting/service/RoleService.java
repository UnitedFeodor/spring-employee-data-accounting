package com.innowise.springemployeedataaccounting.service;

import com.innowise.springemployeedataaccounting.dao.RoleRepository;
import com.innowise.springemployeedataaccounting.model.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleService {
    private RoleRepository roleRepo;

    @Transactional
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }
}
