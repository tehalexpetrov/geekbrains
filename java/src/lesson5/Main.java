package lesson5;

public class Main<staffArray> {

    public static final int SETSTAFF = 5;
    public static final int MIN_AGE = 40;

    public static void main(String[] args) {
        Staff staff1 = new Staff("Сергей Царев", 55, "Царь", "king@roga.ru", "89208886677", 1000000);
        Staff staff2 = new Staff("Алексей Сусоев", 40, "Боярин", "alexsusoeff@roga.ru", "89258563212", 90000);
        Staff staff3 = new Staff("Василий Пупкин", 25, "Холоп", "vasyapupkin@roga.ru", "89538126587", 15000);
        Staff staff4 = new Staff("Аркадий Брунов", 33, "Батрак", "arkadiop@roga.ru", "89192586345", 25000);
        Staff staff5 = new Staff("Зинаида Петровна", 65, "Горничная", "clean@roga.ru", "89155689631", 10000);


        Staff [] staffArray = new Staff[SETSTAFF];

        staffArray[0] = new Staff("Сергей Царев", 55, "Царь", "king@roga.ru", "89208886677", 1000000);
        staffArray[1] = new Staff("Алексей Сусоев", 40, "Боярин", "alexsusoeff@roga.ru", "89258563212", 90000);
        staffArray[2] = new Staff("Василий Пупкин", 25, "Холоп", "vasyapupkin@roga.ru", "89538126587", 15000);
        staffArray[3] = new Staff("Аркадий Брунов", 33, "Батрак", "arkadiop@roga.ru", "89192586345", 25000);
        staffArray[4] = new Staff("Зинаида Петровна", 65, "Горничная", "clean@roga.ru", "89155689631", 10000);

        for (Staff staff: staffArray) {
            if (staff.getAge() > MIN_AGE){
                staff.printStaffArray();
            }
        }
    }
}
