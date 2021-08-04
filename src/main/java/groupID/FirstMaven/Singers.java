package groupID.FirstMaven;

import java.util.Objects;

public class Singers {
    private String name;
    private int voices;

    public Singers() {
    }

    public Singers(String name, int voices) {
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
        return "Singers{" +
                "name='" + name + '\'' +
                ", voices=" + voices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singers singers = (Singers) o;
        return voices == singers.voices && Objects.equals(name, singers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voices);
    }
}
