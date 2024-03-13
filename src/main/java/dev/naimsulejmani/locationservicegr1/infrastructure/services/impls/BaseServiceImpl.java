package dev.naimsulejmani.locationservicegr1.infrastructure.services.impls;

import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.NotFoundException;
import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import dev.naimsulejmani.locationservicegr1.infrastructure.services.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T extends HasId<Tid>, Tid> implements BaseService<T, Tid> {
    protected final JpaRepository<T, Tid> repository;

    public BaseServiceImpl(JpaRepository<T, Tid> repository) {
        this.repository = repository;
    }

    @Override
    public T add(T item) {
        var itemFound = repository.findById(item.getId());
        if (itemFound.isPresent())
            throw new AlreadyExistException("Entity already exists!");
        return repository.save(item);
    }

    @Override
    public T deleteById(Tid id) {
        T item = this.findById(id);
        repository.delete(item);
        return item;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(Tid id) {
        Optional<T> item = repository.findById(id);
        if (item.isEmpty()) {
            throw new NotFoundException("Entity not found");
        }
        return item.get();
    }

    @Override
    public T modify(Tid id, T item) {
        this.findById(id);
        return repository.save(item);
    }
}
