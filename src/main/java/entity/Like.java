package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Like {
    @Id
    private long like_id;
    private long like_by;
    private long like_to;

    public long getLike_id() { return like_id; }

    public void setLike_id(long like_id) { this.like_id = like_id; }

    public long getLike_by() { return like_by; }

    public void setLike_by(long like_by) { this.like_by = like_by; }

    public long getLike_to() { return like_to; }

    public void setLike_to(long like_to) { this.like_to = like_to; }
}
