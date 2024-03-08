package dev.naimsulejmani.locationservicegr1.controllers;


import dev.naimsulejmani.locationservicegr1.dtos.UserDto;
import dev.naimsulejmani.locationservicegr1.entities.User;
import dev.naimsulejmani.locationservicegr1.mappers.Convertable;
import dev.naimsulejmani.locationservicegr1.mappers.UserMapper;
import dev.naimsulejmani.locationservicegr1.services.BaseService;
import dev.naimsulejmani.locationservicegr1.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController extends BaseController<User, Long, UserDto> {
    public UserController(UserService service, UserMapper mapper) {
        super(service, mapper);
    }
//    private final UserService service;
//    private final UserMapper mapper;
//
//    public UserController(UserService service, UserMapper mapper) {
//        this.service = service;
//        this.mapper = mapper;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserDto>> findAll() {
//        var users = service.findAll();
//        return ResponseEntity.ok(users.stream().map(mapper::toDto).toList());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<UserDto> findById(@PathVariable long id) {
//        var user = service.findById(id);
//        return ResponseEntity.ok(mapper.toDto(user));
//    }
//
//    @PostMapping
//    public ResponseEntity<UserDto> add(@RequestBody UserDto userDto) {
//        var user = mapper.toEntity(userDto);
//        user = service.add(user);
//        URI uri = URI.create("http://localhost:8080/api/users/" + user.getId());
//        return ResponseEntity.created(uri).body(mapper.toDto(user));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<UserDto> modify(@PathVariable long id, @RequestBody UserDto userDto) {
//        if (id != userDto.getId()) {
//            throw new RuntimeException("Te dhena jo korrekte!");
//        }
//        var user = mapper.toEntity(userDto);
//        user = service.modify(id, user);
//
//        return ResponseEntity.ok(mapper.toDto(user));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<UserDto> removeById(@PathVariable long id) {
//        var user = service.deleteById(id);
//        return ResponseEntity.ok(mapper.toDto(user));
//    }
}






















