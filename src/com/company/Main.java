package com.company;

import clasess.Prism;
import clasess.Prisms;
import clasess.Square;
import clasess.Squares;

public class Main {
    /**
     *
     * Создать класс квадрат, члены класса – длина стороны. Предусмотреть в классе методы
     * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
     * – правильная квадратная призма с высотой H, добавить в класс метод определения объема фигуры,
     * перегрузить методы расчета площади и вывода сведений о фигуре. Написать программу,
     * демонстрирующую работу с этими классами: дано N квадратов и M призм, найти квадрат с максимальной
     * площадью и призму с максимальной диагональю.
     */
    public static void main(String[] args)
    {
        final int N = 30;
        final int M = 30;
        Squares squares = new Squares(N);
        Prisms prisms = new Prisms(M);
        for (int i = 0; i < N; i++) {
            squares.add(new Square((int) (Math.random() * 20 + 1)));
        }
        for (int i = 0; i < M; i++) {
            prisms.add(new Prism((int) (Math.random() * 20 + 1), (int) (Math.random() * 20 + 1)));
        }
        System.out.println(squares);
        System.out.println("MaxSquare = " + squares.getMaxSquare());
        System.out.println("\n");
        System.out.println(prisms);
        System.out.println("MaxDiagonal: " + prisms.getMaxDiagonal());
    }
}

