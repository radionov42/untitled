public class Main {
    public static void main(String[] args) {
        boolean bool = true;
        String str = "String";
        char c1 = 'a';
        /* 0b либо 0B перед числом задает определение двоичного литерала
        * 0 перед числом задает определение восьмеричного литерала
        * 0x либо 0X перед числом задает определение шестнадцатиричного литерала
         */
        int a2 = 0b1;
        int a8 = 02;
        int a10 = 3;
        int a16 = 0x4;
        float fl = 5.631f; // для определения литерала float после заданных цифр пишется f
        double db = 3.5;
    System.out.println(""+bool+" "+c1+" "+a2+" "+a8+" "+a10+" "+a16+" "+fl+" "+db);
    }
}

