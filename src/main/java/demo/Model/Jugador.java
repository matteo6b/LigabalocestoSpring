package demo.Model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by usu21 on 05/10/2015.
 */
@Entity

public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String name;

    @Column
    private Date fecha;

    @Column
    private Integer canastasTotal;

    @Column
    private Integer rebotesTotal;
    @Column
    private Integer asistenciasTotal;

    @Column
    private String posicion;

   @ManyToOne
    private Equipo equipo;
    public Jugador(String name,Date fecha, Integer canastasTotal, Integer rebotesTotal,Integer asistenciasTotal, String posicion){
        this.name=name;
        this.fecha=fecha;
        this.canastasTotal=canastasTotal;
        this.rebotesTotal=rebotesTotal;
        this.asistenciasTotal=asistenciasTotal;
        this.posicion=posicion;




    }



    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Jugador(){

    }

    public Integer getAsistenciasTotal() {
        return asistenciasTotal;
    }

    public Integer getRebotesTotal() {
        return rebotesTotal;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCanastasTotal() {
        return canastasTotal;
    }

    public void setCanastasTotal(Integer canastasTotal) {
        this.canastasTotal = canastasTotal;
    }

    public Integer getRebotesTotal(int i) {
        return rebotesTotal;
    }

    public void setRebotesTotal(Integer rebotesTotal) {
        this.rebotesTotal = rebotesTotal;
    }

    public Integer getAsistenciasTotal(int i) {
        return asistenciasTotal;
    }

    public void setAsistenciasTotal(Integer asistenciasTotal) {
        this.asistenciasTotal = asistenciasTotal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fecha=" + fecha +
                ", canastasTotal=" + canastasTotal +
                ", rebotesTotal=" + rebotesTotal +
                ", asistenciasTotal=" + asistenciasTotal +
                ", posicion='" + posicion + '\'' +

                '}';
    }




}

