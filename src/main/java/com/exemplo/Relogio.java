package main.java.com.exemplo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {

	private boolean formato24Horas = true;
    private Date horaAtual;
    private Date inicioIntervalo;
    private Date fimIntervalo;

    public String getHora() {
        SimpleDateFormat dateFormat = formato24Horas ? new SimpleDateFormat("HH:mm:ss") : new SimpleDateFormat("hh:mm:ss a");
        return dateFormat.format(horaAtual);
    }

    public void reiniciarMeiaNoite() {
        horaAtual = new Date();
        horaAtual.setHours(0);
        horaAtual.setMinutes(0);
        horaAtual.setSeconds(0);
    }

    public void marcarInicioIntervalo() {
        inicioIntervalo = new Date();
    }

    public void marcarFimIntervalo() {
        fimIntervalo = new Date();
    }

    public String tempoDecorrido() {
        long diferencaMillis = fimIntervalo.getTime() - inicioIntervalo.getTime();
        int segundos = (int) (diferencaMillis / 1000) % 60;
        int minutos = (int) ((diferencaMillis / (1000 * 60)) % 60);
        int horas = (int) ((diferencaMillis / (1000 * 60 * 60)) % 24);
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void setFormato24Horas(boolean formato24Horas) {
        this.formato24Horas = formato24Horas;
    }

}
