package dev.naimsulejmani.locationservicegr1.services.impls;

import dev.naimsulejmani.locationservicegr1.entities.User;
import dev.naimsulejmani.locationservicegr1.repositories.UserRepository;
import dev.naimsulejmani.locationservicegr1.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserBaseServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    public UserBaseServiceImpl(UserRepository repository) {
        super(repository);
    }
}
