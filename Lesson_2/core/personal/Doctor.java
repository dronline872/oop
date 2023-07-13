package Lesson_2.core.personal;

import Lesson_2.core.clients.Animal;

public class Doctor {
    public void diagnose(Animal animal) {
        System.out.println("Диагностика " + animal.getName() + "...");
        System.out.println("Диагностика завершена для " + animal.getName() + ".");
    }

    public void prescribeMedication(Animal animal) {
        System.out.println("Назначение лекарств для " + animal.getName() + "...");
        System.out.println("Лекарства назначены для " + animal.getName() + ".");
    }

    public void performSurgery(Animal animal) {
        System.out.println("Хирургическое вмешательство для " + animal.getName() + "...");
        System.out.println("Операция завершена для " + animal.getName() + ".");
    }

    public void consultColleagues(Animal animal) {
        System.out.println("Консультация с коллегами для " + animal.getName() + "...");
        System.out.println("Консультация завершена для " + animal.getName() + ".");
    }

    public void updateMedicalRecords(Animal animal) {
        System.out.println("Обновление медицинских записей для " + animal.getName() + "...");
        System.out.println("Медицинские записи обновлены для " + animal.getName() + ".");
    }
}