// Бирюков Виктор
// ДЗ №7 Иммитация Больницы

// Определение Класс "Пациент"

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }
}

// Определение Класс "План лечения"

class TreatmentPlan {
    private int planCode;

    public TreatmentPlan(int planCode) {
        this.planCode = planCode;
    }

    public int getPlanCode() {
        return planCode;
    }
}

// Определение Класс "Врач"

abstract class Doctor {
    public abstract void treat();
}

// Класс "Хирург"

class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию.");
    }
}

// Класс "Терапевт"

class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт проводит общий осмотр и назначает лечение.");
    }
}

// Класс "Паталогоанатом"

class Patalogy extends Doctor {
    @Override
    public void treat() {
        System.out.println("Паталогоанатом проводит осмотр тела.");
    }
}

// Класс "Клиника"

class Clinic {
    public void assignDoctor(Patient patient) {
        int planCode = patient.getTreatmentPlan().getPlanCode();
        Doctor doctor;

        if (planCode == 1) {
            doctor = new Surgeon();
        } else if (planCode == 2) {
            doctor = new Patalogy();
        } else {
            doctor = new Therapist();
        }

        System.out.println("Пациент " + patient.getName() + " получил назначение от врача.");
        doctor.treat();
    }
}
class ClinicSimulation {
    public static void main(String[] args) {
        // Создание объектов пациента и плана лечения
        TreatmentPlan plan1 = new TreatmentPlan(1);
        TreatmentPlan plan2 = new TreatmentPlan(2);
        TreatmentPlan plan3 = new TreatmentPlan(3);

        Patient patient1 = new Patient("Василий", plan1);
        Patient patient2 = new Patient("Александр Григорьевич", plan2);
        Patient patient3 = new Patient("Иван", plan3);

        // Создание объекта клиники

        Clinic clinic = new Clinic();

        // Назначение врача и выполнение лечения для каждого пациента

        clinic.assignDoctor(patient1);
        clinic.assignDoctor(patient2);
        clinic.assignDoctor(patient3);
    }
}