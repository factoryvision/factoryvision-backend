package webproject.factoryvision.domain.board.entity;

import jakarta.persistence.*;
import lombok.*;
import webproject.factoryvision.domain.user.entity.User;
import webproject.factoryvision.global.entity.BaseEntity;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    private String content;
    private String nickname;
}
