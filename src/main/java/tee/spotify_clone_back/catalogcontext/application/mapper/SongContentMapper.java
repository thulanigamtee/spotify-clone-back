package tee.spotify_clone_back.catalogcontext.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import tee.spotify_clone_back.catalogcontext.application.dto.SaveSongDTO;
import tee.spotify_clone_back.catalogcontext.application.dto.SongContentDTO;
import tee.spotify_clone_back.catalogcontext.domain.SongContent;

@Mapper(componentModel = "spring")
public interface SongContentMapper {

    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}