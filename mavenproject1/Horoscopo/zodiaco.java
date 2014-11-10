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
"Horoscopo de Hoy Acuario. Ten cabeza y no hagas tonter�as si vas a hacer algo de ejercicio. "
                + "No te compares con otros deportistas que llevan m�s tiempo entrenando. "
                + "Lo �nico que conseguir�s ser� lesionarte. "));
        signo.add(new signo("Piscis",
"Horoscopo de Hoy Piscis. Tendr�s una tarde muy complicada con varios compromisos a los que no puedes fallar."
                + " Son todos importantes, as� que no puedes ausentarte en ninguno de ellos."));
        signo.add(new signo("Aries",
"oroscopo de Hoy Aries. Te conviene mantener la cabeza fr�a, "
                + "sobre todo en lo que se refiere a controlar tus emociones. "
                + "En alg�n momento te acordar�s de alguna persona que ya no est� a tu lado. "
                + "Tendr�s que pedir un peque�o incremento de sueldo. "));
        signo.add(new signo("Tauro",
"Horoscopo de Hoy Tauro. Te encuentras en pleno ciclo de transformaci�n personal. "
                + "Parece ser que te renovar�s tanto interiormente como en tus h�bitos diarios. "
                + "Eso s�, quedar�n muchas cosas por pulir. Eres una persona con gran poder de decisi�n. "));
        signo.add(new signo("G�minis", 
"Horoscopo de Hoy Geminis. Te sientes demasiado cansado despu�s de practicar ejercicio. "
                + "Es importante que te hidrates bien con dos litros de agua. "
                + "Tambi�n puedes ingerir algo de bebida isot�nica. Piensa �nicamente en ti. "
                + "Aunque parezca un poco ego�sta."));
        signo.add(new signo ("C�ncer",
"Horoscopo de Hoy Cancer. Es un d�a para disfrutar. Olv�date de los malos gestos o palabras. "
                + "La vida resulta m�s simple, pero en ocasiones nos gusta complic�rnosla. "
                + "Habr� discusiones in�tiles que no te llevar�n a ning�n sitio. "));
        signo.add(new signo("Leo",
"Horoscopo de Hoy Leo. Eres una persona a la que le gusta innovar. "
                + "Por eso hoy tienes previsto sorprender a unos invitados con un plato de comida novedoso. "
                + "Ser� la primera vez que lo hagas. Te har�n un contrato de poco tiempo en una empresa."));
        signo.add(new signo("Virgo",
"Horoscopo de Hoy Virgo. Dedica un tiempo a correr, nadar o simplemente caminar. "
                + "Lo importante es que no te detengas. "
                + "El deporte te alargar� la vida y te sentir�s con m�s vitalidad. "
                + "Te vendr�a bien canalizar tu esp�ritu emprendedor."));
        signo.add (new signo("Libra",
"Horoscopo de Hoy Libra. Busca actividades que te mantengan entretenido y ocupado. "
                + "Prefieres estar solo antes que mal acompa�ado. "
                + "Hay ciertas personas que se pasan todo el d�a hablando de sus penurias. "
                + "La necesidad de ser previsor es important."));
        signo.add(new signo("Escorpio",
"Horoscopo de Hoy Escorpio. Si te sientes muy agobiado, lo mejor es que llegues a casa y desconectes del exterior. "
                + "Apaga el tel�fono y prep�rate una cena especial. Hoy te la has ganado. "
                + "Aprovecha todas las fiestas y eventos sociales para dejarte ver. "));
        signo.add(new signo("Sagitario",
"Horoscopo de Hoy Sagitario. Defiende con argumentos cualquier cr�tica que realicen sobre ti "
                + "o alguien de tu entorno. "
                + "Ten en cuenta que hay mucha gente que envidia tu situaci�n personal. "));
        signo.add (new signo("Capricornio",
"Horoscopo de Hoy Capricornio. Te sentir�s mal porque no puedes ayudar a un familiar "
                + "que te pide una cantidad de dinero que t� tambi�n necesitas. "
                + "M�s adelante intentar�s prestarle algo. "
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
