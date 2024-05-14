package patientmanager;

import patient.Patient;

import java.util.ArrayList;

public class PatientManager {
    private ArrayList<Patient> patients;

    public PatientManager() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void removePatient(Patient patient) {
        this.patients.remove(patient);
    }

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    public Patient getPatient(int index) {
        return this.patients.get(index);
    }

    public int getSize() {
        return this.patients.size();
    }

    public void clear() {
        this.patients.clear();
    }

    public boolean isEmpty() {
        return this.patients.isEmpty();
    }

    public String toString() {
        return this.patients.toString();
    }

}
