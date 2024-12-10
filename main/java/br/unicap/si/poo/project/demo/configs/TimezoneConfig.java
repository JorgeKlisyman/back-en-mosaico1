package br.unicap.si.poo.project.demo.configs;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import java.util.TimeZone;

@Configuration
public class TimezoneConfig {
<<<<<<< HEAD

    @PostConstruct // essa anotação faz com que assim que a classe seja iniciada pelo spring o
                   // construtor dela seja executado com esse método, que configura a timezone do
                   // brasil
    // método pra converter em horário brasileiro
    public void timezoneConfig() {
=======
    
    @PostConstruct //essa anotação faz com que assim que a classe seja iniciada pelo spring o construtor dela seja executado com esse método, que configura a timezone do brasil
    //método pra converter em horário brasileiro
    public void timezoneConfig(){
>>>>>>> 0132d4a7878da37e1af32b083c959138a8595292
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

}
