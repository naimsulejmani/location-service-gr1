package dev.naimsulejmani.locationservicegr1.controllers;

import dev.naimsulejmani.locationservicegr1.mappers.Convertable;
import dev.naimsulejmani.locationservicegr1.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<TEntity, Tid, TDto> {
    private final BaseService<TEntity, Tid> service;
    private final Convertable<TEntity, TDto> mapper;

    public BaseController(BaseService<TEntity, Tid> service, Convertable<TEntity, TDto> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<TDto>> findAll() {
        var entities = service.findAll();
        return ResponseEntity.ok(entities.stream().map(mapper::toDto).toList());
    }


    @GetMapping("/{id}")
    public ResponseEntity<TDto> findById(@PathVariable Tid id) {
        var entity = service.findById(id);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @PostMapping
    public ResponseEntity<TDto> add(@RequestBody TDto dto) {
        var entity = mapper.toEntity(dto);
        entity = service.add(entity);
        return ResponseEntity.status(201).body(mapper.toDto(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TDto> modify(@PathVariable Tid id, @RequestBody TDto dto) {
        var entity = mapper.toEntity(dto);
        entity = service.modify(id, entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TDto> removeById(@PathVariable Tid id) {
        var entity = service.deleteById(id);
        return ResponseEntity.ok(mapper.toDto(entity));
    }
}












