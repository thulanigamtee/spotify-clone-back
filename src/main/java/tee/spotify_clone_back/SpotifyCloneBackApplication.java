package tee.spotify_clone_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${user.dir}/.env")
public class SpotifyCloneBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyCloneBackApplication.class, args);
	}

}
