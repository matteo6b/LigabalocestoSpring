package demo.Repository;

import demo.Model.Equipo;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by mateo.bistuer on 19/10/2015.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo,Long> {



    public List<Equipo> findBydireccionLike(String direccion);
    Equipo findByName(String warriors);


}