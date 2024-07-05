package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionEXCEPTION extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeDuracionEXCEPTION(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }

}
