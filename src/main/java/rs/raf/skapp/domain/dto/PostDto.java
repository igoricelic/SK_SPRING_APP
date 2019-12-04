package rs.raf.skapp.domain.dto;

import lombok.Data;
import rs.raf.skapp.domain.Post;

@Data
public class PostDto {

    private String title;

    private String text;

    public PostDto(Post post) {
        this.title = post.getTitle();
        this.text = post.getDescription();
    }

}
