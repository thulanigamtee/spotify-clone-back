package tee.spotify_clone_back.usercontext.mapper;

import org.mapstruct.Mapper;

import tee.spotify_clone_back.usercontext.ReadUserDTO;
import tee.spotify_clone_back.usercontext.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
