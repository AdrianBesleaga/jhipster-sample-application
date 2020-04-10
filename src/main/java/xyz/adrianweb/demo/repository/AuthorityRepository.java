package xyz.adrianweb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.adrianweb.demo.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
