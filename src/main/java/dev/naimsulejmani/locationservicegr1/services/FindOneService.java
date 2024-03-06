package dev.naimsulejmani.locationservicegr1.services;


@FunctionalInterface
public interface FindOneService<T, Tid> {
    public T findById(Tid id);
}
