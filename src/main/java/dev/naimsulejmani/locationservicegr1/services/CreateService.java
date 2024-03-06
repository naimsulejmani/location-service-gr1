package dev.naimsulejmani.locationservicegr1.services;

@FunctionalInterface
public interface CreateService<T> {
    public T add(T item);
}
