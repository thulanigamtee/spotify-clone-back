package tee.spotify_clone_back.usercontext.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tee.spotify_clone_back.usercontext.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

}
