package dev.naimsulejmani.locationservicegr1.infrastructure.services;

@FunctionalInterface
public interface DeleteService<T, Tid> {

    public T deleteById(Tid id);
}
