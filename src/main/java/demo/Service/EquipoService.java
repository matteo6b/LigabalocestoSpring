package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mateo.bistuer on 21/10/2015.
 */
@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private LigaRepository ligaRepository;

    public void liga(){
        Liga liga =new Liga();
        liga.setName("NBA");
      ;
     ligaRepository.save(liga);
    }


    public void temporada(){
        Temporada temporada= new Temporada();
        Calendar cal2=Calendar.getInstance();
        cal2.set(2015, Calendar.DECEMBER, 31);
        Date startDate2=cal2.getTime();
        temporada.setFecha(startDate2);
        temporada.setName("2015");
      temporada.setLiga(ligaRepository.findByName("NBA"));

   temporada.getEquipos().add(equipoRepository.findByName("warriors"));
        temporada.getEquipos().add(equipoRepository.findByName("lakers"));
        temporada.getEquipos().add(equipoRepository.findByName("BULLS"));
        temporada.getEquipos().add(equipoRepository.findByName("wolves"));

        temporadaRepository.save(temporada);

    }


    public void warriors() {
        Equipo equipo = new Equipo();
        equipo.setName("warriors");
        equipo.setDireccion("San Fracisco");
        Calendar w = Calendar.getInstance();
        w.set(1985, Calendar.JANUARY, 8);
        Date startD = w.getTime();
        equipo.setFecha(startD);

        equipoRepository.save(equipo);

        Jugador jugador = new Jugador();
        jugador.setName("Curry");
        jugador.setPosicion("Base");
        jugador.setCanastasTotal(200);
        jugador.setAsistenciasTotal(50);
        jugador.setRebotesTotal(25);
        Calendar cal=Calendar.getInstance();
        cal.set(1985, Calendar.JANUARY, 8);
        Date startDate=cal.getTime();
        jugador.setFecha(startDate);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);

        Jugador jugador1 = new Jugador();
        jugador1.setName("thomson");
        jugador1.setPosicion("alero");
        jugador1.setCanastasTotal(80);
        jugador1.setAsistenciasTotal(10);
        jugador1.setRebotesTotal(40);
        Calendar cal1=Calendar.getInstance();
        cal1.set(1991, Calendar.NOVEMBER, 6);
        Date startDate1=cal1.getTime();
        jugador1.setFecha(startDate1);
        jugador1.setEquipo(equipo);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setName("Barnes");
        jugador2.setPosicion("alero");
        jugador2.setCanastasTotal(70);
        jugador2.setAsistenciasTotal(25);
        jugador2.setRebotesTotal(35);
        Calendar cal2=Calendar.getInstance();
        cal2.set(1993, Calendar.DECEMBER, 31);
        Date startDate2=cal2.getTime();
        jugador2.setFecha(startDate2);
        jugador2.setEquipo(equipo);
        jugadorRepository.save(jugador2);

    }

    public void lakers() {
        Equipo equipo = new Equipo();
        equipo.setName("lakers");
        equipo.setDireccion("los angeles");
        Calendar w = Calendar.getInstance();
        w.set(1999, Calendar.MARCH, 2);
        Date startD = w.getTime();
        equipo.setFecha(startD);
        equipoRepository.save(equipo);

        Jugador jugador = new Jugador();
        jugador.setName("Kobe Bryant");
        jugador.setPosicion("alero");
        jugador.setCanastasTotal(800);
        jugador.setAsistenciasTotal(30);
        jugador.setRebotesTotal(400);
        Calendar cal=Calendar.getInstance();
        cal.set(1988, Calendar.DECEMBER, 8);
        Date startDate=cal.getTime();
        jugador.setFecha(startDate);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);

        Jugador jugador3 = new Jugador();
        jugador3.setName("young");
        jugador3.setPosicion("alero");
        jugador3.setCanastasTotal(500);
        jugador3.setAsistenciasTotal(40);
        jugador3.setRebotesTotal(200);
        Calendar cal3=Calendar.getInstance();
        cal3.set(1991, Calendar.DECEMBER, 29);
        Date startDate3=cal3.getTime();
        jugador3.setFecha(startDate3);
        jugador3.setEquipo(equipo);
        jugadorRepository.save(jugador3);



    }

    public void bulls() {
        Equipo equipo = new Equipo();
        equipo.setName("BULLS");
        equipo.setDireccion("chicago");
        Calendar w = Calendar.getInstance();
        w.set(1999, Calendar.MARCH, 2);
        Date startD = w.getTime();
        equipo.setFecha(startD);
        equipoRepository.save(equipo);

        Jugador jugador = new Jugador();
        jugador.setName("jordan");
        jugador.setPosicion("ala-PIVOT");
        jugador.setCanastasTotal(1000);
        jugador.setAsistenciasTotal(80);
        jugador.setRebotesTotal(800);
        Calendar cal=Calendar.getInstance();
        cal.set(1978, Calendar.DECEMBER, 8);
        Date startDate=cal.getTime();
        jugador.setFecha(startDate);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);


        Jugador jugador3 = new Jugador();
        jugador3.setName("pau gasol");
        jugador3.setPosicion("ala-pivot");
        jugador3.setCanastasTotal(500);
        jugador3.setAsistenciasTotal(40);
        jugador3.setRebotesTotal(200);
        Calendar cal3=Calendar.getInstance();
        cal3.set(1989, Calendar.JULY, 29);
        Date startDate3=cal3.getTime();
        jugador3.setFecha(startDate3);
        jugador3.setEquipo(equipo);
        jugadorRepository.save(jugador3);

    }

    public void wolves() {
        Equipo equipo = new Equipo();
        equipo.setName("wolves");
        equipo.setDireccion("mimesota");
        Calendar w = Calendar.getInstance();
        w.set(1993, Calendar.JUNE, 2);
        Date startD = w.getTime();
        equipo.setFecha(startD);
        equipoRepository.save(equipo);

        Jugador jugador = new Jugador();
        jugador.setName("ricky");
        jugador.setPosicion("base");
        jugador.setCanastasTotal(100);
        jugador.setAsistenciasTotal(500);
        jugador.setRebotesTotal(80);
        Calendar cal=Calendar.getInstance();
        cal.set(1958, Calendar.APRIL, 8);
        Date startDate=cal.getTime();
        jugador.setFecha(startDate);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);

        Jugador jugador1 = new Jugador();
        jugador1.setName("Wiggins");
        jugador1.setPosicion("pivot");
        jugador1.setCanastasTotal(800);
        jugador1.setAsistenciasTotal(40);
        jugador1.setRebotesTotal(90);
        Calendar cal3=Calendar.getInstance();
        cal3.set(1988, Calendar.MARCH, 9);
        Date startDat1e=cal3.getTime();
        jugador1.setFecha(startDat1e);
        jugador1.setEquipo(equipo);
        jugadorRepository.save(jugador1);

    }

    public void menphis() {
        Equipo equipo = new Equipo();
        equipo.setName("menphis grizzles");
        equipo.setDireccion("menphis");
        Calendar w = Calendar.getInstance();
        w.set(1991, Calendar.NOVEMBER, 29);
        Date startD = w.getTime();
        equipo.setFecha(startD);
        equipoRepository.save(equipo);

        Jugador jugador = new Jugador();
        jugador.setName("MARC GASOL");
        jugador.setPosicion("PIVOT");
        jugador.setCanastasTotal(750);
        jugador.setAsistenciasTotal(200);
        jugador.setRebotesTotal(90);
        Calendar cal=Calendar.getInstance();
        cal.set(1998, Calendar.JANUARY, 26);
        Date startDate=cal.getTime();
        jugador.setFecha(startDate);
        jugador.setEquipo(equipo);
        jugadorRepository.save(jugador);

        Jugador jugador4 = new Jugador();
        jugador4.setName("Zach Randolph");
        jugador4.setPosicion("pivot");
        jugador4.setCanastasTotal(800);
        jugador4.setAsistenciasTotal(5);
        jugador4.setRebotesTotal(90);
        Calendar cal4=Calendar.getInstance();
        cal4.set(1988, Calendar.MARCH, 2);
        Date startDate4=cal4.getTime();
        jugador4.setFecha(startDate4);
        jugador4.setEquipo(equipo);
        jugadorRepository.save(jugador4);

    }


    public  void consultasEntidades(){

        Calendar cal6=Calendar.getInstance();
        cal6.set(2015, Calendar.DECEMBER, 31);














        //consultas
        System.out.println(jugadorRepository.findBynameContaining("o"));


        System.out.println(jugadorRepository.findBycanastasTotalGreaterThan(100));
        System.out.println(jugadorRepository.findByasistenciasTotalBetween(20, 110));
        System.out.println(jugadorRepository.findByposicionLike("base"));
        System.out.println(jugadorRepository.findByfechaBefore(cal6.getTime()));

       /* System.out.println(jugadorRepository.findBycanastasTotalGreaterThanEqualAndfechaBefore(100,cal.getTime() ));*/

     /*2*/

        System.out.println(equipoRepository.findBydireccionLike("chicago"));
        System.out.println(jugadorRepository.findByEquipoNameLike("menphis grizzles"));
        Jugador jugador1 =jugadorRepository.findFirstByOrderByCanastasTotalDesc();
        System.out.println(jugador1);
        System.out.println(jugadorRepository.findJugadorPosicionLikeFromEquipo("lakers","alero"));
        System.out.println(jugadorRepository.findFirst5ByOrderByAsistenciasTotalDesc());
        System.out.println(jugadorRepository.findJugadorOrderByCanastasFromEquipo("warriors").get(0));






    }





}
