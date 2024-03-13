package dev.naimsulejmani.locationservicegr1.infrastructure.services;

@FunctionalInterface
public interface CreateService<T> {
    public T add(T item);
}
