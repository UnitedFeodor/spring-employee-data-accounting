package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.dto.MapStructMapper;
import com.innowise.springemployeedataaccounting.dto.RoleDto;
import com.innowise.springemployeedataaccounting.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@AllArgsConstructor
public class RoleController {
    private RoleService roleService;
    private MapStructMapper mapper;

    @GetMapping("")
    public List<RoleDto> getAllRoles() {
        return mapper.roleListToRoleDtoList(roleService.getAllRoles());
    }
}
