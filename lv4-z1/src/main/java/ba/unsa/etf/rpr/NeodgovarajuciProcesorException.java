package ba.unsa.etf.rpr;

public class NeodgovarajuciProcesorException extends Exception{
    public NeodgovarajuciProcesorException() {
        super();
    }
    public NeodgovarajuciProcesorException(String poruka){
        super(poruka);
    }
    public NeodgovarajuciProcesorException(String poruka, Throwable uzrok) {
        super(poruka, uzrok);
    }

    public NeodgovarajuciProcesorException(Throwable uzrok) {
        super(uzrok);
    }
}
