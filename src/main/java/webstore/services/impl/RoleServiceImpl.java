package webstore.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstore.models.Role;
import webstore.repositories.RoleRepository;
import webstore.services.RoleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        return roleRepository.findByRole(name);
    }

    @Override
    public List<Role> rolesForNewUser() {
        List<Role> roles = new ArrayList<>();
        Role roleUser = findByName("ROLE_USER");
        if(roleUser == null){
            roleUser = new Role();
            roleUser.setRole("ROLE_USER");
        }
        roles.add(roleUser);
        return roles;
    }
}
