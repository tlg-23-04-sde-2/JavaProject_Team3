package com.alm.bingo.controller;

public enum BingoBall {
    // B values
    B1(1), B2(2), B3(3), B4(4), B5(5), B6(6), B7(7), B8(8), B9(9), B10(10),
    B11(11), B12(12), B13(13), B14(14), B15(15),
    // I values
    I16(16), I17(17), I18(18), I19(19), I20(20), I21(21), I22(22), I23(23),
    I24(24), I25(25), I26(26), I27(27), I28(28), I29(29), I30(30),
    // N values
    N31(31), N32(32), N33(33), N34(34), N35(35), N36(36), N37(37), N38(38),
    N39(39), N40(40), N41(41), N42(42), N43(43), N44(44), N45(45),
    // G values
    G46(46), G47(47), G48(48), G49(49), G50(50), G51(51), G52(52), G53(53),
    G54(54), G55(55), G56(56), G57(57), G58(58), G59(59), G60(60),
    // O values
    O61(61), O62(62), O63(63), O64(64), O65(65), O66(66), O67(67), O68(68),
    O69(69), O70(70), O71(71), O72(72), O73(73), O74(74), O75(75);

    private final int number;

    BingoBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}