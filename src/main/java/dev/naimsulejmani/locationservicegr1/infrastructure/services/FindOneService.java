package dev.naimsulejmani.locationservicegr1.infrastructure.services;


@FunctionalInterface
public interface FindOneService<T, Tid> {
    public T findById(Tid id);
}
