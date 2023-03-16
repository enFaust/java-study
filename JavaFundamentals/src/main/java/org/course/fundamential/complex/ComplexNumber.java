package org.course.fundamential.complex;

/**
 * Сделать имплементацию текущего интерфейса, которая будет описывать
 * комплексные числа с двумя частями - действительной и мнимой.
 *
 * Нужно реализовать:
 * 1. Конструктор с одним параметром (Новое число по действительной части)
 * 2. Конструктор с двумя параметрами (По действительной и мнимой части)
 * 3. Сложение
 * 4. Вычитание
 * 5. Умножение
 * 6. Деление
 * 7. Получение модуля
 * 8. Метод toString для получения результата
 *
 */
public interface ComplexNumber {
    ComplexNumber getSum(ComplexNumber number);
    ComplexNumber getSubtract(ComplexNumber number);
    ComplexNumber getMultiply(ComplexNumber number);
    ComplexNumber getDivide(ComplexNumber number);
    ComplexNumber getModule(ComplexNumber number);
}
