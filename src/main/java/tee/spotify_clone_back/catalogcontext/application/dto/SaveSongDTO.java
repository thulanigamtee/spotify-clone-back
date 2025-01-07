package tee.spotify_clone_back.catalogcontext.application.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tee.spotify_clone_back.catalogcontext.application.vo.SongAuthorVO;
import tee.spotify_clone_back.catalogcontext.application.vo.SongTitleVO;

public record SaveSongDTO(@Valid SongTitleVO title,
                          @Valid SongAuthorVO author,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}