package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "DISLIKES")
public class Dislike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dislike_id;
    private long dislike_by;
    private long dislike_to;

}
