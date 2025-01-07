package tee.spotify_clone_back.catalogcontext.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tee.spotify_clone_back.catalogcontext.domain.Favorite;
import tee.spotify_clone_back.catalogcontext.domain.FavoriteId;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);
}
