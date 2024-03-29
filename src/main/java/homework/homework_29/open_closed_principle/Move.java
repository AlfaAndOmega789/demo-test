package homework.homework_29.open_closed_principle;

public interface Move {
    /**
     * Программные сущности должны быть открыты для расширения и закрыты для изменения.
     */

    /**
     * Исходя из принципа который выше,
     * мы добавляем дополнительный слой абстракции в виде интерфейса,
     * который можем использовать с другими классами
     */
    void run();
    void walk();
}
