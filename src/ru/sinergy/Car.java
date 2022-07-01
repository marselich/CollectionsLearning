package ru.sinergy;

public class Car {
    String modal;

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getModal() {
        return modal;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modal='" + modal + '\'' +
                '}';
    }

    public Car(String modal) {
        this.modal = modal;
    }
}
