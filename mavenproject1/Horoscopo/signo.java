package com.mycompany.horoscopos;

public class signo {
private String signo;
private String prediccion;
public signo(){
    
}
public signo(String signo, String prediccion){
    this.signo=signo;
    this.prediccion=prediccion;
            
}

    public String getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    String getprediccion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
