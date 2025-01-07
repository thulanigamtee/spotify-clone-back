package tee.spotify_clone_back.catalogcontext.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tee.spotify_clone_back.catalogcontext.domain.SongContent;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {

    Optional<SongContent> findOneBySongPublicId(UUID publicId);

}
