package demo;

import demo.Service.EquipoService;
import demo.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBaloncestoApplication {
    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context =   SpringApplication.run(LigaBaloncestoApplication.class, args);

        equipoService = context.getBean(EquipoService.class);
        equipoService.warriors();
        equipoService.bulls();
        equipoService.lakers();
        equipoService.wolves();
        equipoService.menphis();
        equipoService.liga();
        equipoService.temporada();
        equipoService.consultasEntidades();

    }
}
