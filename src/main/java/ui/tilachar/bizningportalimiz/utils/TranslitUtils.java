package ui.tilachar.bizningportalimiz.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TranslitUtils {

    int[] cyr1 = new int[]{1040, 1240, 1041, 1042, 1042, 1170, 1043, 1044, 1045, 1045, 1045, 1046, 1174, 1047, 1048, 1048, 1050, 1178, 1051, 1051, 1052, 1186, 1053, 1054, 1256, 1055, 1056, 1064, 1065, 1057, 1058, 1059, 1198, 1060, 1061, 1210, 1063, 1062, 1069, 1070, 1071, 1049, 1098, 1066, 44, 59, 63, 1067, 1068};
    int[] cyr2 = new int[]{1072, 1241, 1073, 1074, 1074, 1171, 1075, 1076, 1077, 1077, 1077, 1078, 1175, 1079, 1080, 1080, 1082, 1179, 1083, 1083, 1084, 1187, 1085, 1086, 1257, 1087, 1088, 1096, 1097, 1089, 1090, 1091, 1199, 1092, 1093, 1211, 1095, 1094, 1101, 1102, 1103, 1081, 1098, 1066, 44, 59, 63, 1099, 1100};
    int[] lat1 = new int[]{65, 69, 66, 87, 86, 71, 71, 68, 203, 200, 278, 90, 74, 90, 73, 73, 75, 81, 76, 76, 77, 78, 78, 79, 214, 80, 82, 83, 83, 83, 84, 85, 220, 70, 88, 72, 67, 67, 203, 89, 89, 89, 39, 39, 44, 59, 63, 73, 39};
    int[] lat2 = new int[]{97, 101, 98, 119, 118, 103, 103, 100, 235, 232, 279, 122, 106, 122, 105, 105, 107, 113, 108, 108, 109, 110, 110, 111, 246, 112, 114, 115, 115, 115, 116, 117, 252, 102, 120, 104, 99, 99, 235, 121, 121, 121, 39, 39, 44, 59, 63, 105, 39};
    int[] lat3 = new int[]{0, 0, 0, 0, 0, 104, 0, 0, 0, 0, 0, 104, 0, 0, 0, 0, 0, 0, 0, 97, 0, 103, 0, 0, 0, 0, 0, 104, 104, 0, 0, 0, 0, 0, 0, 0, 104, 0, 0, 117, 97, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] arab1 = new int[]{65166, 65258, 65167, 64478, 64478, 65229, 1711, 65193, 64485, 64485, 64485, 1688, 65181, 65199, 65264, 65264, 65241, 65237, 65245, 65275, 65249, 64467, 65253, 65262, 64474, 64342, 65197, 65205, 65205, 65201, 65173, 64472, 64476, 65233, 65189, 65259, 64378, 65201, 64485, 64472, 65166, 65265, 0, 0, 1548, 1563, 1567, 65264, 0};
    int[] arab2 = new int[]{65166, 65258, 65169, 64478, 64478, 65231, 64404, 65193, 64487, 64487, 64487, 64394, 65183, 65199, 65164, 64489, 65243, 65239, 65247, 65275, 65251, 64469, 65255, 65262, 64474, 64344, 65197, 65207, 65207, 65203, 65175, 64472, 64476, 65235, 65191, 65259, 64380, 65203, 64487, 64472, 65166, 65267, 0, 0, 1548, 1563, 1567, 65164, 0};
    int[] arab3 = new int[]{65166, 65258, 65170, 64479, 64479, 65232, 64405, 65194, 64487, 64487, 64487, 64395, 65184, 65200, 65164, 64489, 65244, 65240, 65248, 65276, 65252, 64470, 65256, 65262, 64474, 64345, 65198, 65208, 65208, 65204, 65176, 64472, 64476, 65236, 65192, 65260, 64381, 65204, 64487, 64472, 65166, 65268, 0, 0, 1548, 1563, 1567, 65164, 0};
    int[] arab4 = new int[]{65166, 65258, 65168, 64479, 64479, 65230, 64403, 65194, 64485, 64485, 64485, 64395, 65182, 65200, 65264, 65264, 65242, 65238, 65246, 65276, 65250, 64468, 65254, 65262, 64474, 64343, 65198, 65206, 65206, 65202, 65174, 64472, 64476, 65234, 65190, 64429, 64379, 65202, 64485, 64472, 65166, 65266, 0, 0, 1548, 1563, 1567, 65264, 0};
    int[] arab5 = new int[]{65165, 65257, 65169, 64478, 64478, 65231, 64404, 65193, 64486, 64486, 64340, 64394, 65183, 65199, 65163, 64488, 65243, 65239, 65247, 65275, 65251, 64469, 65255, 65261, 64473, 64344, 65197, 65207, 65207, 65203, 65175, 64471, 64475, 65235, 65191, 64428, 64380, 65203, 64340, 64472, 65166, 65267, 0, 0, 1548, 1563, 1567, 65163, 0};
    int[] arab6 = new int[]{65165, 65257, 65167, 64478, 64478, 65229, 1711, 65193, 64484, 64484, 64484, 1688, 65181, 65199, 65263, 65263, 65241, 65237, 65245, 65275, 65249, 64467, 65253, 65261, 64473, 64342, 65197, 65205, 65205, 65201, 65173, 64471, 64475, 65233, 65189, 64428, 64378, 65201, 1744, 64472, 65166, 65265, 0, 0, 1548, 1563, 1567, 65263, 0};
    int[] arab7 = new int[]{65163, 65163, 0, 0, 0, 0, 0, 0, 65163, 65163, 65163, 0, 0, 0, 65163, 65163, 0, 0, 0, 0, 0, 0, 0, 65163, 65163, 0, 0, 0, 0, 0, 0, 65163, 65163, 0, 0, 0, 0, 0, 65163, 65267, 65267, 0, 0, 0, 0, 0, 0, 65163, 0};
    int[] arab8 = new int[]{49, 49, 0, 49, 49, 0, 0, 49, 0, 0, 0, 49, 0, 49, 0, 0, 0, 0, 0, 49, 0, 0, 0, 49, 49, 0, 49, 0, 0, 0, 0, 49, 49, 0, 0, 0, 0, 0, 0, 49, 49, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] arab9 = new int[]{1575, 1749, 1576, 1739, 0, 1594, 1711, 1583, 1744, 0, 0, 1580, 0, 1586, 1609, 0, 1603, 1602, 1604, 0, 1605, 1709, 1606, 1608, 1734, 1662, 1585, 1588, 0, 1587, 1578, 1735, 1736, 0, 1582, 1726, 1670, 1587, 1744, 0, 0, 1610, 0, 0, 1548, 1563, 1609, 0};
    int chcount = 49;

    public static String TranslitLatCyr(String str) {
        String resstr = "";
        for (int i = 0; i < str.length(); i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == lat1[j]) || (str.charAt(i) == lat2[j]))
                    if ((lat3[j] == 0) || ((lat3[j] > 0) && (str.charAt(i + 1) == lat3[j]))) {
                        if (str.charAt(i) == lat1[j])
                            resstr = resstr + Character.toString(cyr1[j]);
                        else
                            resstr = resstr + Character.toString(cyr2[j]);
                        if (lat3[j] > 0) i++;
                        b = 1;
                        break;
                    }
            if (b == 0)
                resstr = resstr + str.charAt(i);
        }
        return resstr;
    }

    public static String TranslitCyrLat(String str) {
        String resstr = "";
        for (int i = 0; i < str.length(); i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == cyr1[j]) || (str.charAt(i) == cyr2[j])) {
                    if (str.charAt(i) == cyr1[j])
                        resstr = resstr + Character.toString(lat1[j]);
                    else
                        resstr = resstr + Character.toString(lat2[j]);
                    if (lat3[j] > 0) resstr = resstr + Character.toString(lat3[j]);
                    b = 1;
                    break;
                }
            if (b == 0)
                resstr = resstr + str.charAt(i);
        }
        return resstr;
    }

    public static String TranslitArabCyr(String str) {
        String resstr = "";
        str = " " + str + " ";
        int s = 1;
        for (int i = 1; i < str.length() - 1; i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == arab1[j]) || (str.charAt(i) == arab2[j]) || (str.charAt(i) == arab3[j]) || (str.charAt(i) == arab4[j]) || (str.charAt(i) == arab5[j]) || (str.charAt(i) == arab6[j]) || (str.charAt(i) == arab9[j])) {
                    if (str.charAt(i) == 65163) {
                        int bc = 0;
                        for (int k = 10; k < 188; k++)
                            if (str.charAt(i - 1) == k) {
                                bc = 1;
                                break;
                            }
                        if (bc == 1) break;
                    }
                    if ((cyr1[j] == 1049) && (str.charAt(i + 1) == 65166)) {
                        i++;
                        j--;
                    }
                    if ((cyr1[j] == 1049) && (str.charAt(i + 1) == 64472)) {
                        i++;
                        j = j - 2;
                    }
                    if (s == 1)
                        resstr = resstr + Character.toString(cyr1[j]);
                    else
                        resstr = resstr + Character.toString(cyr2[j]);
                    s = 0;
                    if ((str.charAt(i) == 65275) || (str.charAt(i) == 65276))
                        resstr = resstr + Character.toString(1072);
                    b = 1;
                    break;
                }
            if (b == 0)
                if (str.charAt(i) != 1574)
                    if (str.charAt(i) != 65163) {
                        resstr = resstr + str.charAt(i);
                        if ((str.charAt(i) == 46) || (str.charAt(i) == 10)) s = 1;
                    }
        }
        return resstr;
    }

    public static String TranslitCyrArab(String str) {
        str = " " + str + " ";
        String resstr = "";
        int s = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == cyr1[j]) || (str.charAt(i) == cyr2[j])) {
                    b = 1;
                    int l = 0;
                    int r = 0;
                    if (arab1[j] == 0) break;
                    if ((cyr1[j] == 1070) || (cyr1[j] == 1071)) l = 1;
                    else
                        for (int k = 10; k < 63; k++) {
                            if (str.charAt(i - 1) == k) l = 1;
                            if (str.charAt(i + 1) == k) r = 1;
                        }
                    if ((cyr1[j] == 1051) && (str.charAt(i + 1) == 1072)) {
                        i++;
                        j++;
                    }
                    if ((l == 1) && (r == 1)) {
                        if (arab7[j] > 0) resstr = resstr + Character.toString(arab7[j]);
                        resstr = resstr + Character.toString(arab1[j]);
                        s = 0;
                        break;
                    }
                    if (l == 1) {
                        if (arab7[j] > 0) resstr = resstr + Character.toString(arab7[j]);
                        resstr = resstr + Character.toString(arab2[j]);
                        s = arab8[j];
                        break;
                    }
                    if (r == 1) {
                        if (s == 0) resstr = resstr + Character.toString(arab4[j]);
                        else resstr = resstr + Character.toString(arab6[j]);
                        s = 0;
                        break;
                    }
                    if (s == 0) resstr = resstr + Character.toString(arab3[j]);
                    else resstr = resstr + Character.toString(arab5[j]);
                    s = arab8[j];
                    break;
                }
            if (b == 0) {
                resstr = resstr + str.charAt(i);
                s = 0;
            }
        }
        return resstr;
    }

    public static String TranslitArabLat(String str) {
        String resstr = "";
        str = " " + str;
        int s = 1;
        for (int i = 1; i < str.length(); i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == arab1[j]) || (str.charAt(i) == arab2[j]) || (str.charAt(i) == arab3[j]) || (str.charAt(i) == arab4[j]) || (str.charAt(i) == arab5[j]) || (str.charAt(i) == arab6[j]) || (str.charAt(i) == arab9[j])) {
                    if (str.charAt(i) == 65163) {
                        int bc = 0;
                        for (int k = 10; k < 188; k++)
                            if (str.charAt(i - 1) == k) {
                                bc = 1;
                                break;
                            }
                        if (bc == 1) break;
                    }
                    if (s == 1)
                        resstr = resstr + Character.toString(lat1[j]);
                    else
                        resstr = resstr + Character.toString(lat2[j]);
                    if (lat3[j] > 0) resstr = resstr + Character.toString(lat3[j]);
                    s = 0;
                    b = 1;
                    break;
                }
            if (b == 0)
                if (str.charAt(i) != 1574)
                    if (str.charAt(i) != 65163) {
                        resstr = resstr + str.charAt(i);
                        if ((str.charAt(i) == 46) || (str.charAt(i) == 10)) s = 1;
                    }
        }
        return resstr;
    }

    public static String TranslitLatArab(String str) {
        str = " " + str + " ";
        String resstr = "";
        int s = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            int b = 0;
            for (int j = 0; j < chcount; j++)
                if ((str.charAt(i) == lat1[j]) || (str.charAt(i) == lat2[j]))
                    if ((lat3[j] == 0) || ((lat3[j] > 0) && (str.charAt(i + 1) == lat3[j]))) {
                        b = 1;
                        int l = 0;
                        int r = 0;
                        if (arab1[j] == 0) break;
                        else
                            for (int k = 10; k < 63; k++) {
                                if (str.charAt(i - 1) == k) l = 1;
                                if (str.charAt(i + 1) == k) r = 1;
                            }
                        if ((lat1[j] == 76) && (str.charAt(i + 1) == 97)) j++;
                        if (lat3[j] > 0) i++;
                        if ((l == 1) && (r == 1)) {
                            if (arab7[j] > 0) resstr = resstr + Character.toString(arab7[j]);
                            resstr = resstr + Character.toString(arab1[j]);
                            s = 0;
                            break;
                        }
                        if (l == 1) {
                            if (arab7[j] > 0) resstr = resstr + Character.toString(arab7[j]);
                            resstr = resstr + Character.toString(arab2[j]);
                            s = arab8[j];
                            break;
                        }
                        if (r == 1) {
                            if (s == 0) resstr = resstr + Character.toString(arab4[j]);
                            else resstr = resstr + Character.toString(arab6[j]);
                            s = 0;
                            break;
                        }
                        if (s == 0) resstr = resstr + Character.toString(arab3[j]);
                        else resstr = resstr + Character.toString(arab5[j]);
                        s = arab8[j];
                        break;
                    }
            if (b == 0) {
                resstr = resstr + str.charAt(i);
                s = 0;
            }
        }
        return resstr;
    }
}
