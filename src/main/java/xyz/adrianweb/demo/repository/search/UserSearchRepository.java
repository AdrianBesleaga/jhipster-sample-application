package xyz.adrianweb.demo.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import xyz.adrianweb.demo.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
