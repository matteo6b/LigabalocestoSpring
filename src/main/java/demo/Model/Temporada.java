package demo.Model;

import javax.persistence.*;

import java.util.*;

/**
 * Created by usu21 on 13/10/2015.
 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column
    private Date fecha;
    @Column
    private String name;
    @ManyToOne
    private Liga liga;


    public String getName(String s) {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @ManyToMany
    private Set<Equipo> equipos=new HashSet<>();


    public Temporada(){}

    public Temporada(Date fecha) {
        this.fecha = fecha;
    }

  /*  public Set<Liga> getLigas() {
        return ligas;
    }
*/

    public Temporada(Date fecha, String name, Set<Equipo> equipos) {
        this.fecha = fecha;
        this.name = name;
        this.equipos = equipos;
    }

    public String getName() {
        return name;
    }
/*  public void setLigas(Set<Liga> ligas) {
        this.ligas = ligas;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
/*   public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }*/

    /*public Temporada(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }*/

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", fecha=" + fecha +

                ", equipos=" + equipos +
                '}';
    }
}
