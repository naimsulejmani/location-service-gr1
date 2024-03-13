package dev.naimsulejmani.locationservicegr1.services.impls;

import dev.naimsulejmani.locationservicegr1.entities.Role;
import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr1.infrastructure.services.impls.BaseServiceImpl;
import dev.naimsulejmani.locationservicegr1.repositories.RoleRepository;
import dev.naimsulejmani.locationservicegr1.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleBaseServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {
    public RoleBaseServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role add(Role item) {
        var roleFound = getRepository().findByName(item.getName());

        if (roleFound.isPresent()) {
            throw new AlreadyExistException("Role with the same name already exists!");
        }
        return super.add(item);
    }

    private RoleRepository getRepository() {
        return (RoleRepository) repository;
    }
}
