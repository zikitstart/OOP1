public class Main {
    public static void main(String[] args) {

        int year = 2022;
        Human maxim = new Human(-35,"Максим","Минск","бренд-менеджер");
        Human ania = new Human(29,"Аня","Москва","методист образовательных программ");
        Human katia = new Human(28,"Катя","Калининград","продакт-менеджер");
        Human artem = new Human(27,"Артём","Москва","директор по развитию бизнеса");

        System.out.println("Задание-1.");

        System.out.println("Привет! Меня зовут " + maxim.getName() +
                ". Я из города " + maxim.getTown() +
                ". Я родился в " + (year - maxim.getYearOfBirth()) +
                " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + ania.getName() +
                ". Я из города " + ania.getTown() +
                ". Я родился в " + (year - ania.getYearOfBirth()) +
                " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katia.getName() +
                ". Я из города " + katia.getTown() +
                ". Я родился в " + (year - katia.getYearOfBirth()) +
                " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.getName() +
                ". Я из города " + artem.getTown() +
                ". Я родился в " + (year - artem.getYearOfBirth()) +
                " году. Будем знакомы!");

        System.out.println("Задание-2.");

        System.out.println("Привет! Меня зовут " + maxim.getName() +
                ". Я из города " + maxim.getTown() +
                ". Мне " + maxim.getYearOfBirth() +
                " лет." + " Я работаю на должности " + maxim.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + ania.getName() +
                ". Я из города " + ania.getTown() +
                ". Мне " + ania.getYearOfBirth() +
                " лет." + " Я работаю на должности " + ania.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katia.getName() +
                ". Я из города " + katia.getTown() +
                ". Мне " + katia.getYearOfBirth() +
                " лет." + " Я работаю на должности " + katia.getJob() +
                ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.getName() +
                ". Я из города " + artem.getTown() +
                ". Мне " + artem.getYearOfBirth() +
                " лет." + " Я работаю на должности " + artem.getJob() +
                ". Будем знакомы!");


        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия");
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");

        System.out.println("Задание-3.");
        System.out.println(lada.getBrand() + " " + lada.getModel() + ", " + lada.getProductionYear() +
                " год выпуска, страна сборки " + lada.getProductionCountry() + "," + lada.getColor() +
                " цвет, объем двигателя - " + lada.getEngineVolume() + " литра.");
        System.out.println(audi.getBrand() + " " + audi.getModel() + ", " + audi.getProductionYear() +
                " год выпуска, страна сборки " + audi.getProductionCountry() + "," + audi.getColor() +
                " цвет, объем двигателя - " + audi.getEngineVolume() + " литра.");
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getProductionYear() +
                " год выпуска, страна сборки " + bmw.getProductionCountry() + "," + bmw.getColor() +
                " цвет, объем двигателя - " + bmw.getEngineVolume() + " литра.");
        System.out.println(kia.getBrand() + " " + kia.getModel() + ", " + kia.getProductionYear() +
                " год выпуска, страна сборки " + kia.getProductionCountry() + "," + kia.getColor() +
                " цвет, объем двигателя - " + kia.getEngineVolume() + " литра.");
        System.out.println(hyundai.getBrand() + " " + hyundai.getModel() + ", " + hyundai.getProductionYear() +
                " год выпуска, страна сборки " + hyundai.getProductionCountry() + "," + hyundai.getColor() +
                " цвет, объем двигателя - " + hyundai.getEngineVolume() + " литра.");
    }
}