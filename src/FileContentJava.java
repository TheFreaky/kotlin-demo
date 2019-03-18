import java.time.LocalDateTime;
import java.util.Objects;

public class FileContentJava {
    private String name;
    private LocalDateTime date;
    private String content;

    public FileContentJava() {
    }

    public FileContentJava(String name, LocalDateTime date, String content) {
        this.name = name;
        this.date = date;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public FileContentJava setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public FileContentJava setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getContent() {
        return content;
    }

    public FileContentJava setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileContentJava that = (FileContentJava) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(date, that.date) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, content);
    }

    @Override
    public String toString() {
        return "FileContentJava{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
