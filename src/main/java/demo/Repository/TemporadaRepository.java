package demo.Repository;

import demo.Model.Equipo;
import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mateo.bistuer on 20/10/2015.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada,Long> {
    Temporada findByName(String nba);


    /*public List<Jugador> findBycanastasTotalGreaterThanEqualAndfechaBefore(Integer canastasTotal,Date fecha);*/

}
