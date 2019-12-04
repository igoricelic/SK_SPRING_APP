package rs.raf.skapp.domain.dto;

import lombok.Data;
import rs.raf.skapp.domain.Page;
import rs.raf.skapp.domain.Post;
import rs.raf.skapp.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class UserResDto {

    private String firstName;

    private String lastName;

    private String email;

    private List<PostDto> posts;

    private List<String> pages;

    public UserResDto(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.posts = new ArrayList<>();
        for(Post post: user.getPosts()) {
            posts.add(new PostDto(post));
        }
        this.pages = user.getPages().stream().map(Page::getName).collect(Collectors.toList());
    }

}
