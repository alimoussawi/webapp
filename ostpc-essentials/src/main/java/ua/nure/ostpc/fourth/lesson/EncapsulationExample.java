package ua.nure.ostpc.fourth.lesson;

import java.util.ArrayList;
import java.util.List;

class Circuit {
    private int voltage;
    private int power;
    private int luminess;

    public Circuit(int voltage, int power, int luminess) {
        this.setLuminess(luminess);
        this.setPower(power);
        this.setVoltage(voltage);
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        if (voltage < 0) {
            this.voltage = 777;
            return;
        }

        if (voltage > 100) {
            this.voltage = 100;
            return;
        }

        this.voltage = voltage;
    }

    public int getPower() {
        if (this.power < 0) {
            return 0;
        }

        if (this.power > 100) {
            return 100;
        }

        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLuminess() {
        return luminess;
    }

    public void setLuminess(int luminess) {
        if (luminess < 0) {
            this.luminess = 0;
            return;
        }

        if (luminess > 100) {
            this.luminess = 100;
            return;
        }

        this.luminess = luminess;
    }
}

class Room {
    private List<Circuit> circuits = new ArrayList<>();

    public int amountOfCircuits() {
        return this.circuits.size();
    }

    public void addNewCircuit(Circuit circuit) {
        if (circuit == null) {
            return;
        }

        this.circuits.add(circuit);
    }

    public void examinateRoom() {
        this.circuits.forEach(item -> {
            System.out.println(item.getLuminess());
            System.out.println(item.getPower());
            System.out.println(item.getVoltage());
        });
    }

    public void removeCircuit(Circuit circuit) {
        this.circuits.remove(circuit);
    }
}

class ElectricityMaster {
    public void insertHighVoltageCircuit(Room room) {
        Circuit circuit = new Circuit(40, 80, 10);
        room.addNewCircuit(circuit);
    }

    public void insertInvalidCircuit(Room room) {
        Circuit circuit = new Circuit(-40, -80, 10);
        room.addNewCircuit(circuit);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Room room = new Room();
        ElectricityMaster electricityMaster = new ElectricityMaster();
        electricityMaster.insertHighVoltageCircuit(room);
        electricityMaster.insertInvalidCircuit(room);
        room.examinateRoom();
    }
}
