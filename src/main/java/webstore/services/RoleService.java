package webstore.services;

import webstore.models.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);
    List<Role> rolesForNewUser();
}
