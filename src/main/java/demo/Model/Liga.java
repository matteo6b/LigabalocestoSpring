package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by usu21 on 13/10/2015.
 */
@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;
    @OneToMany(mappedBy = "liga")
    Set<Temporada> temporadas = new HashSet<>();

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public Liga(){}

    public Liga(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
