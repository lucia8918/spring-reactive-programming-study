package com.reactive.reactivestudy.domain.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserDomainService {

  private final UserRepository userRepository;

  @Transactional
  public Mono<User> create(User user) {
    return userRepository.save(user);
  }

  @Transactional
  public Flux<User> findAll(){
    return userRepository.findAll();
  }
}
