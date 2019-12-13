package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "dislike")
public class Dislike {
    @Id
    private long dislike_id;
    private long dislike_by;
    private long dislike_to;

    public long getDislike_id() { return dislike_id; }

    public void setDislike_id(long dislike_id) { this.dislike_id = dislike_id; }

    public long getDislike_by() { return dislike_by; }

    public void setDislike_by(long dislike_by) { this.dislike_by = dislike_by; }

    public long getDislike_to() { return dislike_to; }

    public void setDislike_to(long dislike_to) { this.dislike_to = dislike_to; }
}
