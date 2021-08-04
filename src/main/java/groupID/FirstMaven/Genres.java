package groupID.FirstMaven;

import java.util.Objects;

public class Genres {
    private String name;
    private int voices;

    public Genres(String name, int voices) {
        this.name = name;
        this.voices = voices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoices() {
        return voices;
    }

    public void setVoices(int voices) {
        this.voices = voices;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "name='" + name + '\'' +
                ", voices=" + voices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genres genres = (Genres) o;
        return voices == genres.voices && Objects.equals(name, genres.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voices);
    }
}
