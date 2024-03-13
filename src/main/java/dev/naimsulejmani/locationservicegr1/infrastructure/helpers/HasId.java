package dev.naimsulejmani.locationservicegr1.infrastructure.helpers;

@FunctionalInterface
public interface HasId<Tid> {

    public Tid getId();
}
