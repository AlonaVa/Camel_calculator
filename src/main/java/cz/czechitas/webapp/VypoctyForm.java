package cz.czechitas.webapp;

import org.apache.tomcat.util.collections.*;

public class VypoctyForm {

    private int vek;
    private int vzdelani;
    private int jazyky;
    private int pivo;
    private int vareni;

    public int getVek() {
        return vek;
    }

    public void setVek(int newValue) {
        vek = newValue;
    }

    public int getVzdelani() {
        return vzdelani;
    }

    public void setVzdelani(int newValue) {
        vzdelani = newValue;
    }

    public int getJazyky() {
        return jazyky;
    }

    public void setJazyky(int newValue) {
        jazyky = newValue;
    }

    public int getPivo() {
        return pivo;
    }

    public void setPivo(int newValue) {
        pivo = newValue;
    }

    public int getVareni() {
        return vareni;
    }

    public void setVareni(int newValue) {
        vareni = newValue;
    }

}
