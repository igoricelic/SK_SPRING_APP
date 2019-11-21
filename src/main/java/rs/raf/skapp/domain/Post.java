package rs.raf.skapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

}
