package demo.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 * Created by usu21 on 13/10/2015.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
   private Long id;

    @Column
   private String name;
    @Column
    private String direccion;
    @Column
    protected Date fecha;
   @OneToMany(mappedBy = "equipo")
    Set<Jugador> jugadores = new HashSet<>();

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @ManyToMany(mappedBy="equipos")
    private Set<Temporada> temporadas= new HashSet<>();

    public Equipo(){
        
    }

    public Equipo(String name, String direccion, Date fecha) {
        this.name = name;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fecha=" + fecha +

                '}';
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
  /*  public Equipo(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;

    }*/

  /*  public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }*/


  /*  public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }*/

}
