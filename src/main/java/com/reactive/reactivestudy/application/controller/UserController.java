package com.reactive.reactivestudy.application.controller;

import com.reactive.reactivestudy.application.request.UserRequest;
import com.reactive.reactivestudy.domain.user.User;
import com.reactive.reactivestudy.domain.user.UserDomainService;
import com.reactive.reactivestudy.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private final UserDomainService userDomainService;
  private final UserRepository userRepository;
  @PostMapping("/save")
  public Mono<Long> save(@RequestBody UserRequest request) {
    // return Mono.just(User.builder().name("paden").build());
    //return userDomainService.save(User.builder().name(request.getName()).build());
    // return userDomainService.save(User.builder().name("paden").build());
    return userRepository.count();
  }

  @GetMapping
  public Flux<User> all(){
    return userDomainService.findAll();
  }
}
