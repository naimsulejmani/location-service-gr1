package dev.naimsulejmani.locationservicegr1.mappers;

public interface Convertable<TEntity, TDto> {
    public TEntity toEntity(TDto dto);
    public TDto toDto(TEntity entity);
}
