package dev.naimsulejmani.locationservicegr1.infrastructure.services;

public interface BaseService<T, Tid> extends ReadService<T, Tid>, WriteService<T, Tid> {
}
