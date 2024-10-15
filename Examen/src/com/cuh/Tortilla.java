package com.cuh;

class Tortilla {
    double gramos;
    String turno;

    public Tortilla(double gramos, String turno) {
        this.gramos = gramos;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Gramos: " + gramos + ", Turno: " + turno;
    }
}
