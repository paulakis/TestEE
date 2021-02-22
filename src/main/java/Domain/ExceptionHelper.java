package Domain;

import java.sql.Timestamp;
import java.util.Date;

public class ExceptionHelper {

    public String reason;
    public int status;
    public Timestamp timestamp;

    public ExceptionHelper(String reason, int status, Timestamp timestamp) {
        this.reason = reason;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
