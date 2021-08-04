package groupID.FirstMaven;


import java.util.Objects;

public class Comment{
    public String comment;
    public int time;

    public Comment(String comment, int time) {
        this.comment = comment;
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return time == comment.time && Objects.equals(this.comment, comment.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, time);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "name='" + comment + '\'' +
                ", time=" + time +
                '}';
    }
}
