package dev.naimsulejmani.locationservicegr1.services;

public interface WriteService<T, Tid> extends CreateService<T>, ModifyService<T, Tid>, DeleteService<T, Tid> {
}
