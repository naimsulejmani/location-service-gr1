package dev.naimsulejmani.locationservicegr1.infrastructure.services;

import java.util.List;

@FunctionalInterface
public interface FindAllService<T> {
    public List<T> findAll();
}
