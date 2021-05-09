package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView zpracujIndex(VypoctyForm vyplnenyFormular) {
        ModelAndView DrzakNaDataAJmenoStranky = new ModelAndView("vysledek");
        DrzakNaDataAJmenoStranky.addObject("vek", vyplnenyFormular.getVek());
        DrzakNaDataAJmenoStranky.addObject("vzdelani", vyplnenyFormular.getVzdelani());
        DrzakNaDataAJmenoStranky.addObject("jazyky", vyplnenyFormular.getJazyky());
        DrzakNaDataAJmenoStranky.addObject("pivo", vyplnenyFormular.getPivo());
        DrzakNaDataAJmenoStranky.addObject("vareni", vyplnenyFormular.getVareni());
        int pocetVelbloudu = 0;
        if (vyplnenyFormular.getVek() <= 50) {
            pocetVelbloudu = pocetVelbloudu + 5;
        }
        if (vyplnenyFormular.getJazyky() <= 2 && vyplnenyFormular.getJazyky() > 1) {
            pocetVelbloudu = pocetVelbloudu + 3;
        }
        if (vyplnenyFormular.getJazyky() > 2) {
            pocetVelbloudu = pocetVelbloudu + 5;
        }
        if (vyplnenyFormular.getVzdelani() == 3) {
            pocetVelbloudu = pocetVelbloudu + 2;
        }
        if (vyplnenyFormular.getVzdelani() == 4) {
            pocetVelbloudu = pocetVelbloudu + 5;
        }
        if (vyplnenyFormular.getVzdelani() == 5) {
            pocetVelbloudu = pocetVelbloudu + 10;
        }
        if (vyplnenyFormular.getPivo() == 1) {
            pocetVelbloudu = pocetVelbloudu - 5;
        }
        if (vyplnenyFormular.getPivo() == 2) {
            pocetVelbloudu = pocetVelbloudu - 2;
        }
        if (vyplnenyFormular.getPivo() == 3) {
            pocetVelbloudu = pocetVelbloudu;
        }
        if (vyplnenyFormular.getPivo() == 4) {
            pocetVelbloudu = pocetVelbloudu + 1;
        }
        if (vyplnenyFormular.getPivo() == 5) {
            pocetVelbloudu = pocetVelbloudu + 20;
        }
        if (vyplnenyFormular.getVareni() == 1) {
            pocetVelbloudu = pocetVelbloudu + 50;
        }
        DrzakNaDataAJmenoStranky.addObject("pocetVelbloudu", pocetVelbloudu);
        return DrzakNaDataAJmenoStranky;

    }
}
