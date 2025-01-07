package tee.spotify_clone_back.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "tee.spotify_clone_back.usercontext.repository",
        "tee.spotify_clone_back.catalogcontext.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}