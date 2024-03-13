package dev.naimsulejmani.locationservicegr1.infrastructure.services;

public interface ReadService<T, Tid> extends FindOneService<T, Tid>, FindAllService<T> {
}
