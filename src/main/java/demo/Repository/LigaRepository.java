package demo.Repository;

import demo.Model.Equipo;
import demo.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mateo.bistuer on 20/10/2015.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga,Long> {
    Liga findByName(String nba);


    /*public List<Jugador> findBycanastasTotalGreaterThanEqualAndfechaBefore(Integer canastasTotal,Date fecha);*/

}