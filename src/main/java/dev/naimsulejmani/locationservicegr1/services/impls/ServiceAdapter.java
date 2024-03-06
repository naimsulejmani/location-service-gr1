package dev.naimsulejmani.locationservicegr1.services.impls;

import dev.naimsulejmani.locationservicegr1.services.HasId;
import dev.naimsulejmani.locationservicegr1.services.Serviceable;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class ServiceAdapter<T , Tid> implements Serviceable<T, Tid> {
    private final JpaRepository<T, Tid> repository;

    public ServiceAdapter(JpaRepository<T, Tid> repository) {
        this.repository = repository;
    }

    @Override
    public T add(T item) {
//        var itemFound = findById(item.getId());
//        if (itemFound != null)
//            throw new RuntimeException("Entity Already exists!");
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
            throw new EntityNotFoundException("Entity not found");
        }
        return item.get();
    }

    @Override
    public T modify(Tid id, T item) {
        this.findById(id);
        return repository.save(item);
    }
}
