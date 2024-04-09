package webproject.factoryvision.domain.alarm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;
import webproject.factoryvision.domain.user.entity.User;
import webproject.factoryvision.global.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alarm extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "user_info_id")
    private String userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_phone")
    private String phone;

    public void savedAlarm(String userId, String name, String phone, LocalDateTime createdAt) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.setCreatedAt(createdAt);
    }

}
