/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.horoscopos;
import java.util.ArrayList;
/**
 *
 * @author LATITUDE
 */
public class zodiaco implements Esoterica {
    ArrayList <signo> signo;
    public zodiaco(){
        this.signo=new ArrayList();
        signo.add(new signo("Acuario",
"Horoscopo de Hoy Acuario. Ten cabeza y no hagas tonterías si vas a hacer algo de ejercicio. "
                + "No te compares con otros deportistas que llevan más tiempo entrenando. "
                + "Lo único que conseguirás será lesionarte. "));
        signo.add(new signo("Piscis",
"Horoscopo de Hoy Piscis. Tendrás una tarde muy complicada con varios compromisos a los que no puedes fallar."
                + " Son todos importantes, así que no puedes ausentarte en ninguno de ellos."));
        signo.add(new signo("Aries",
"oroscopo de Hoy Aries. Te conviene mantener la cabeza fría, "
                + "sobre todo en lo que se refiere a controlar tus emociones. "
                + "En algún momento te acordarás de alguna persona que ya no está a tu lado. "
                + "Tendrás que pedir un pequeño incremento de sueldo. "));
        signo.add(new signo("Tauro",
"Horoscopo de Hoy Tauro. Te encuentras en pleno ciclo de transformación personal. "
                + "Parece ser que te renovarás tanto interiormente como en tus hábitos diarios. "
                + "Eso sí, quedarán muchas cosas por pulir. Eres una persona con gran poder de decisión. "));
        signo.add(new signo("Géminis", 
"Horoscopo de Hoy Geminis. Te sientes demasiado cansado después de practicar ejercicio. "
                + "Es importante que te hidrates bien con dos litros de agua. "
                + "También puedes ingerir algo de bebida isotónica. Piensa únicamente en ti. "
                + "Aunque parezca un poco egoísta."));
        signo.add(new signo ("Cáncer",
"Horoscopo de Hoy Cancer. Es un día para disfrutar. Olvídate de los malos gestos o palabras. "
                + "La vida resulta más simple, pero en ocasiones nos gusta complicárnosla. "
                + "Habrá discusiones inútiles que no te llevarán a ningún sitio. "));
        signo.add(new signo("Leo",
"Horoscopo de Hoy Leo. Eres una persona a la que le gusta innovar. "
                + "Por eso hoy tienes previsto sorprender a unos invitados con un plato de comida novedoso. "
                + "Será la primera vez que lo hagas. Te harán un contrato de poco tiempo en una empresa."));
        signo.add(new signo("Virgo",
"Horoscopo de Hoy Virgo. Dedica un tiempo a correr, nadar o simplemente caminar. "
                + "Lo importante es que no te detengas. "
                + "El deporte te alargará la vida y te sentirás con más vitalidad. "
                + "Te vendría bien canalizar tu espíritu emprendedor."));
        signo.add (new signo("Libra",
"Horoscopo de Hoy Libra. Busca actividades que te mantengan entretenido y ocupado. "
                + "Prefieres estar solo antes que mal acompañado. "
                + "Hay ciertas personas que se pasan todo el día hablando de sus penurias. "
                + "La necesidad de ser previsor es important."));
        signo.add(new signo("Escorpio",
"Horoscopo de Hoy Escorpio. Si te sientes muy agobiado, lo mejor es que llegues a casa y desconectes del exterior. "
                + "Apaga el teléfono y prepárate una cena especial. Hoy te la has ganado. "
                + "Aprovecha todas las fiestas y eventos sociales para dejarte ver. "));
        signo.add(new signo("Sagitario",
"Horoscopo de Hoy Sagitario. Defiende con argumentos cualquier crítica que realicen sobre ti "
                + "o alguien de tu entorno. "
                + "Ten en cuenta que hay mucha gente que envidia tu situación personal. "));
        signo.add (new signo("Capricornio",
"Horoscopo de Hoy Capricornio. Te sentirás mal porque no puedes ayudar a un familiar "
                + "que te pide una cantidad de dinero que tú también necesitas. "
                + "Más adelante intentarás prestarle algo. "
                + "Intenta realizar tu trabajo lo mejor posible."));
    }
    public String futuro(String parametro){
        String futurot="";
        for(signo s:signo){
            if(parametro.equalsIgnoreCase(s.getSigno())){
                futurot=s.getprediccion();
            }
        }
        return futurot;
    }
    
}
