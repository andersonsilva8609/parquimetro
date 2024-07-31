package br.com.fiap.parquimetro.model.enums;

import lombok.Getter;

import java.util.Iterator;

@Getter
public enum Status implements ch.qos.logback.core.status.Status {
    INATIVO(0), ATIVO(1);

    private int value;

    Status(int value){
        this.value = value;
    }

    public static Status fromValue(int value){
        for (Status status : Status.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Valor numérico inválido: " + value);
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEffectiveLevel() {
        return 0;
    }

    @Override
    public Object getOrigin() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    @Override
    public long getTimestamp() {
        return 0;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public void add(ch.qos.logback.core.status.Status child) {

    }

    @Override
    public boolean remove(ch.qos.logback.core.status.Status child) {
        return false;
    }

    @Override
    public Iterator<ch.qos.logback.core.status.Status> iterator() {
        return null;
    }
}
