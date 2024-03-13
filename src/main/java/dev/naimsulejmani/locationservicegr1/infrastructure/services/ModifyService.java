package dev.naimsulejmani.locationservicegr1.infrastructure.services;

@FunctionalInterface
public interface ModifyService<T, Tid> {

    public T modify(Tid id, T item);
}
