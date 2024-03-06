package dev.naimsulejmani.locationservicegr1.services;

@FunctionalInterface
public interface ModifyService<T, Tid> {

    public T modify(Tid id, T item);
}
