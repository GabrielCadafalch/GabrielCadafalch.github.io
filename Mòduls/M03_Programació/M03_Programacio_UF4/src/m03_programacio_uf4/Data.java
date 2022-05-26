/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_programacio_uf4;

/**
 *
 * @author alumno
 */
public class Data {
    
    private int dia;
    private int mes;
    private int any;
    
    public void setData(int dd, int mm, int aa){
        this.dia = dd;
        this.mes = mm;
        this.any = aa;
    }
    public boolean esPrimerDeMes(){    
        return (dia == 1);
    }
    public boolean esAnterior(Data altre){
        if (altre.any > this.any)
            return true;
        else if (altre.any == this.any)
            if (altre.mes > this.mes)
                return true;
            else if (altre.mes == this.mes)
                if (altre.dia > this.dia)
                    return true;
        return false;
    }
    public boolean esAnyDeTraspas(){
        return any%4 == 0;
    }
    public String getData(){
        return dia + "/" + mes + "/" + any;
    }
}
