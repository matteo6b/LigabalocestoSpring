package demo.Repository;

import demo.Model.Jugador;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.*;

/**
 * Created by usu21 on 05/10/2015.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long> {

    public List<Jugador> findBynameContaining (String name);
    public List<Jugador> findBycanastasTotalGreaterThan(Integer canastasTotal);
    public List<Jugador> findByasistenciasTotalBetween(Integer minasistenciasTotal,Integer maxasistenciasTotal);
    public List<Jugador> findByposicionLike (String posicion);
    public List<Jugador> findByfechaBefore (Date fecha);
   public  List<Jugador> findByEquipoNameLike(String equipo);
   @Query("SELECT j FROM Jugador j where j.equipo.name = :equipoName and j.posicion=:posicion ")
    List<Jugador> findJugadorPosicionLikeFromEquipo(@Param("equipoName") String name, @Param("posicion") String nam);
    public  List<Jugador> findFirst5ByOrderByAsistenciasTotalDesc();
    @Query("SELECT j FROM Jugador j where j.equipo.name = :equipoName order by j.canastasTotal desc ")
    List<Jugador> findJugadorOrderByCanastasFromEquipo(@Param("equipoName") String equipoName);


   Jugador findFirstByOrderByCanastasTotalDesc();
   /* public  List<Jugador> findByEquipoPosicionandNombreLike(String equipo,String posicion);*/

    /*public List<Jugador> findBycanastasTotalGreaterThanEqualAndfechaBefore(Integer canastasTotal,Date fecha);*/

}
