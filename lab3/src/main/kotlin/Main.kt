fun main() {
    //создание с использованием вторичного конструктора
    val p1 = Person(Fio("Соколов Дмитрий Александрович"),63,"муж",Passport("7364","835407"),
        mutableListOf(Duty("Трубочист","6",15000)))
    println(p1.toString())

    //добавление обязанностей
    println("\nНовые обязанности:\n")
    p1.addDuty(Duty("Менеджер","10",20000))
    p1.addDuty(Duty("Пастух","20",30000))
    println(p1.toString())

    //удаление обязанностей
    println("\nУдаление обязанности:\n")
    p1.removeDuty("Менеджер")
    println(p1.toString())

    //использование первичного конструктора
    val p2 = Person(Fio("Анастасия Валерьевна Покровская"),13,"жен")
    println(p2.toString())

    //проверка валидности паспортных данных (неверный номер серии)
    val p3 = Person(Fio("Константин Игоревич Белкин"),40,"муж", Passport("84659","675648"))
    println(p3.toString())
}