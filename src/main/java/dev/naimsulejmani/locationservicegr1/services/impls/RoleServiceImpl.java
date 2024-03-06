package dev.naimsulejmani.locationservicegr1.services.impls;

import dev.naimsulejmani.locationservicegr1.entities.Role;
import dev.naimsulejmani.locationservicegr1.repositories.RoleRepository;
import dev.naimsulejmani.locationservicegr1.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceAdapter<Role, Integer> implements RoleService {
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
