package nl.qien.weekopdrachtYahtzeeSimple;

public class Dobbelsteen {
    int werpen() {
        int dobbelSteen = (int) (Math.random() * 6 + 1);
        return dobbelSteen;
    }
}
