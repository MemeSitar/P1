
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[121];
        predavalnice[0] = new Tretja.Avditorna("A1", 110);
        predavalnice[1] = new Tretja.Garaza("G1", 148, 176);
        predavalnice[2] = new Tretja.Racunalnica("R1", 33, 14);
        predavalnice[3] = new Tretja.Garaza("G2", 189, 491);
        predavalnice[4] = new Tretja.Racunalnica("R2", 66, 58);
        predavalnice[5] = new Tretja.Racunalnica("R3", 76, 17);
        predavalnice[6] = new Tretja.Avditorna("A2", 27);
        predavalnice[7] = new Tretja.Racunalnica("R4", 68, 65);
        predavalnice[8] = new Tretja.Avditorna("A3", 148);
        predavalnice[9] = new Tretja.Garaza("G3", 121, 136);
        predavalnice[10] = new Tretja.Racunalnica("R5", 16, 8);
        predavalnice[11] = new Tretja.Racunalnica("R6", 27, 22);
        predavalnice[12] = new Tretja.Racunalnica("R7", 31, 5);
        predavalnice[13] = new Tretja.Racunalnica("R8", 43, 29);
        predavalnice[14] = new Tretja.Avditorna("A4", 32);
        predavalnice[15] = new Tretja.Avditorna("A5", 202);
        predavalnice[16] = new Tretja.Garaza("G4", 88, 181);
        predavalnice[17] = new Tretja.Racunalnica("R9", 60, 50);
        predavalnice[18] = new Tretja.Racunalnica("R10", 14, 14);
        predavalnice[19] = new Tretja.Avditorna("A6", 207);
        predavalnice[20] = new Tretja.Garaza("G5", 224, 495);
        predavalnice[21] = new Tretja.Garaza("G6", 227, 419);
        predavalnice[22] = new Tretja.Racunalnica("R11", 17, 10);
        predavalnice[23] = new Tretja.Garaza("G7", 152, 104);
        predavalnice[24] = new Tretja.Garaza("G8", 251, 140);
        predavalnice[25] = new Tretja.Avditorna("A7", 98);
        predavalnice[26] = new Tretja.Garaza("G9", 65, 296);
        predavalnice[27] = new Tretja.Avditorna("A8", 14);
        predavalnice[28] = new Tretja.Racunalnica("R12", 46, 28);
        predavalnice[29] = new Tretja.Racunalnica("R13", 63, 63);
        predavalnice[30] = new Tretja.Garaza("G10", 294, 248);
        predavalnice[31] = new Tretja.Garaza("G11", 129, 191);
        predavalnice[32] = new Tretja.Avditorna("A9", 49);
        predavalnice[33] = new Tretja.Racunalnica("R14", 74, 34);
        predavalnice[34] = new Tretja.Avditorna("A10", 276);
        predavalnice[35] = new Tretja.Racunalnica("R15", 16, 6);
        predavalnice[36] = new Tretja.Racunalnica("R16", 34, 2);
        predavalnice[37] = new Tretja.Racunalnica("R17", 66, 35);
        predavalnice[38] = new Tretja.Avditorna("A11", 190);
        predavalnice[39] = new Tretja.Avditorna("A12", 163);
        predavalnice[40] = new Tretja.Racunalnica("R18", 93, 68);
        predavalnice[41] = new Tretja.Avditorna("A13", 99);
        predavalnice[42] = new Tretja.Avditorna("A14", 292);
        predavalnice[43] = new Tretja.Racunalnica("R19", 56, 2);
        predavalnice[44] = new Tretja.Racunalnica("R20", 39, 38);
        predavalnice[45] = new Tretja.Garaza("G12", 231, 306);
        predavalnice[46] = new Tretja.Racunalnica("R21", 14, 7);
        predavalnice[47] = new Tretja.Garaza("G13", 120, 337);
        predavalnice[48] = new Tretja.Garaza("G14", 220, 498);
        predavalnice[49] = new Tretja.Avditorna("A15", 90);
        predavalnice[50] = new Tretja.Avditorna("A16", 62);
        predavalnice[51] = new Tretja.Garaza("G15", 238, 428);
        predavalnice[52] = new Tretja.Racunalnica("R22", 67, 23);
        predavalnice[53] = new Tretja.Garaza("G16", 194, 435);
        predavalnice[54] = new Tretja.Garaza("G17", 248, 362);
        predavalnice[55] = new Tretja.Racunalnica("R23", 43, 38);
        predavalnice[56] = new Tretja.Racunalnica("R24", 49, 17);
        predavalnice[57] = new Tretja.Avditorna("A17", 76);
        predavalnice[58] = new Tretja.Racunalnica("R25", 92, 71);
        predavalnice[59] = new Tretja.Garaza("G18", 219, 152);
        predavalnice[60] = new Tretja.Avditorna("A18", 92);
        predavalnice[61] = new Tretja.Garaza("G19", 147, 354);
        predavalnice[62] = new Tretja.Racunalnica("R26", 86, 51);
        predavalnice[63] = new Tretja.Garaza("G20", 276, 245);
        predavalnice[64] = new Tretja.Avditorna("A19", 295);
        predavalnice[65] = new Tretja.Racunalnica("R27", 11, 9);
        predavalnice[66] = new Tretja.Avditorna("A20", 33);
        predavalnice[67] = new Tretja.Garaza("G21", 221, 175);
        predavalnice[68] = new Tretja.Avditorna("A21", 172);
        predavalnice[69] = new Tretja.Racunalnica("R28", 77, 18);
        predavalnice[70] = new Tretja.Racunalnica("R29", 67, 55);
        predavalnice[71] = new Tretja.Avditorna("A22", 175);
        predavalnice[72] = new Tretja.Avditorna("A23", 28);
        predavalnice[73] = new Tretja.Racunalnica("R30", 100, 57);
        predavalnice[74] = new Tretja.Avditorna("A24", 15);
        predavalnice[75] = new Tretja.Garaza("G22", 160, 133);
        predavalnice[76] = new Tretja.Racunalnica("R31", 65, 7);
        predavalnice[77] = new Tretja.Avditorna("A25", 191);
        predavalnice[78] = new Tretja.Avditorna("A26", 71);
        predavalnice[79] = new Tretja.Avditorna("A27", 89);
        predavalnice[80] = new Tretja.Avditorna("A28", 71);
        predavalnice[81] = new Tretja.Avditorna("A29", 121);
        predavalnice[82] = new Tretja.Racunalnica("R32", 87, 82);
        predavalnice[83] = new Tretja.Garaza("G23", 152, 267);
        predavalnice[84] = new Tretja.Avditorna("A30", 30);
        predavalnice[85] = new Tretja.Avditorna("A31", 39);
        predavalnice[86] = new Tretja.Avditorna("A32", 241);
        predavalnice[87] = new Tretja.Racunalnica("R33", 40, 21);
        predavalnice[88] = new Tretja.Avditorna("A33", 252);
        predavalnice[89] = new Tretja.Garaza("G24", 215, 388);
        predavalnice[90] = new Tretja.Garaza("G25", 286, 114);
        predavalnice[91] = new Tretja.Avditorna("A34", 56);
        predavalnice[92] = new Tretja.Racunalnica("R34", 34, 3);
        predavalnice[93] = new Tretja.Garaza("G26", 250, 474);
        predavalnice[94] = new Tretja.Racunalnica("R35", 16, 13);
        predavalnice[95] = new Tretja.Avditorna("A35", 69);
        predavalnice[96] = new Tretja.Racunalnica("R36", 58, 10);
        predavalnice[97] = new Tretja.Racunalnica("R37", 62, 24);
        predavalnice[98] = new Tretja.Garaza("G27", 281, 300);
        predavalnice[99] = new Tretja.Garaza("G28", 145, 145);
        predavalnice[100] = new Tretja.Garaza("G29", 113, 168);
        predavalnice[101] = new Tretja.Garaza("G30", 179, 107);
        predavalnice[102] = new Tretja.Racunalnica("R38", 33, 24);
        predavalnice[103] = new Tretja.Racunalnica("R39", 72, 56);
        predavalnice[104] = new Tretja.Garaza("G31", 277, 273);
        predavalnice[105] = new Tretja.Avditorna("A36", 69);
        predavalnice[106] = new Tretja.Racunalnica("R40", 73, 60);
        predavalnice[107] = new Tretja.Racunalnica("R41", 42, 15);
        predavalnice[108] = new Tretja.Racunalnica("R42", 44, 5);
        predavalnice[109] = new Tretja.Avditorna("A37", 14);
        predavalnice[110] = new Tretja.Avditorna("A38", 156);
        predavalnice[111] = new Tretja.Garaza("G32", 167, 388);
        predavalnice[112] = new Tretja.Avditorna("A39", 29);
        predavalnice[113] = new Tretja.Garaza("G33", 151, 144);
        predavalnice[114] = new Tretja.Avditorna("A40", 79);
        predavalnice[115] = new Tretja.Garaza("G34", 65, 245);
        predavalnice[116] = new Tretja.Garaza("G35", 139, 381);
        predavalnice[117] = new Tretja.Garaza("G36", 235, 370);
        predavalnice[118] = new Tretja.Avditorna("A41", 114);
        predavalnice[119] = new Tretja.Racunalnica("R43", 90, 61);
        predavalnice[120] = new Tretja.Avditorna("A42", 144);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}
