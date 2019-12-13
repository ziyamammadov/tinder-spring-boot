package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table (name = "messages")
public class Message {
    @Id
    private long message_id;
    private long sender;
    private long receiver;
    private String message;
    private String date;

    public long getMessage_id() { return message_id; }

    public void setMessage_id(long message_id) { this.message_id = message_id; }

    public long getSender() { return sender; }

    public void setSender(long sender) { this.sender = sender; }

    public long getReceiver() { return receiver; }

    public void setReceiver(long receiver) { this.receiver = receiver; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }
}
