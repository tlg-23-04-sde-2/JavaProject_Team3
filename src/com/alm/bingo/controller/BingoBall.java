package com.alm.bingo.controller;

import java.util.Random;

public enum BingoBall {
    B1(1), B2(2), B3(3), B4(4),B5(5),B6(6),B7(7),B8(8),B9(9),B10(10),B11(11),B12(12),B13(13),B14(14),B15(15),
    I1(16),I2(17), I3(18),I4(19),I5(20),I6(21),I7(22),I8(23),I9(24),I10(25),I11(26),I12(27),I13(28),I14(29),I15(30),
    N1(31),N2(32), N3(33),N4(34),N5(35),N6(36),N7(37),N8(38),N9(39),N10(40),N11(41),N12(42),N13(43),N14(44),N15(45),
    G1(46),G2(47),G3(48),G4(49),G5(50),G6(51),G7(52),G8(53),G9(54),G10(55),G11(56),G12(57),G13(58),G14(59),G15(60),
    O1(61),O2(62),O3(63),O4(64),O5(65),O6(66),O7(67),O8(68),O9(69),O10(70),O11(71),O12(72),O13(73),O14(74),O15(75);

    private final int number;
    private static final BingoBall[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    private BingoBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    // Method to get random ball
    public static BingoBall getRandomBall() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

}