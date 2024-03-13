package dev.naimsulejmani.locationservicegr1.controllers;

import dev.naimsulejmani.locationservicegr1.dtos.RoleDto;
import dev.naimsulejmani.locationservicegr1.entities.Role;
import dev.naimsulejmani.locationservicegr1.infrastructure.controllers.BaseController;
import dev.naimsulejmani.locationservicegr1.mappers.RoleMapper;
import dev.naimsulejmani.locationservicegr1.services.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/roles")
public class RoleController extends BaseController<Role, Integer, RoleDto> {

    public RoleController(RoleService service, RoleMapper mapper) {
        super(service, mapper);
    }
}















