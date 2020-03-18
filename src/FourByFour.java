public class FourByFour {
    public static void main(String [] args) {
//code to define an initially empty int 2D array,

        int [][] list = new int[5][5];
//minimum size 4x4
//code to output all original values

        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[0][4]);

        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[1][4]);

        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[2][4]);

        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
        System.out.println(list[3][4]);

        System.out.println(list[4][0]);
        System.out.println(list[4][1]);
        System.out.println(list[4][2]);
        System.out.println(list[4][3]);
        System.out.println(list[4][4]);


//code to change half the values to even positive numbers

        list[2][2] = 4;
        list[2][3]= 6;
        list[2][4] = 2;
        list[3][0] = 8;
        list[3][1] = 20;
        list[3][2] = 50;
        list[3][3] = 96;
        list[3][4]= 72;
        list[4][0] = 22;
        list[4][1] = 44;
        list[4][2]= 34;
        list[4][3]= 92;
        list[4][4] = 88;


//and the other half to negative odd numbers

        list[0][0] = -71;
        list[0][1] = -5;
        list[0][2] = -3;
        list[0][3] = -7;
        list[0][4] = -9;

        list[1][0] = -23;
        list[1][1] = -21;
        list[1][2] =- -43;
        list[1][3] = -99;
        list[1][4] = -77;

        list[2][0] = -65 ;
        list[2][1] = -45 ;


//code to output a blank line separating output sets

        System.out.println(" ");

//code to output all array elements

        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[0][4]);

        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[1][4]);

        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[2][4]);

        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
        System.out.println(list[3][4]);

        System.out.println(list[4][0]);
        System.out.println(list[4][1]);
        System.out.println(list[4][2]);
        System.out.println(list[4][3]);
        System.out.println(list[4][4]);


    }

}
