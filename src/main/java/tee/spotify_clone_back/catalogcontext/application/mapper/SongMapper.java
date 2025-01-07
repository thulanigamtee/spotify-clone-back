package tee.spotify_clone_back.catalogcontext.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import tee.spotify_clone_back.catalogcontext.application.dto.ReadSongInfoDTO;
import tee.spotify_clone_back.catalogcontext.application.dto.SaveSongDTO;
import tee.spotify_clone_back.catalogcontext.application.vo.SongAuthorVO;
import tee.spotify_clone_back.catalogcontext.application.vo.SongTitleVO;
import tee.spotify_clone_back.catalogcontext.domain.Song;

@Mapper(componentModel = "spring")
public interface SongMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "publicId", ignore = true)
    Song saveSongDTOToSong(SaveSongDTO saveSongDTO);

    @Mapping(target = "favorite", ignore = true)
    ReadSongInfoDTO songToReadSongInfoDTO(Song song);

    default SongTitleVO stringToSongTitleVO(String title){
        return new SongTitleVO(title);
    }

    default SongAuthorVO stringToSongAuthorVO(String author){
        return new SongAuthorVO(author);
    }

    default String songTitleVOToString(SongTitleVO title) {
        return title.value();
    }

    default String songAuthorVOToString(SongAuthorVO author) {
        return author.value();
    }
}
