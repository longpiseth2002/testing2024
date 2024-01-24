import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String magenta="\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";
        String black = "\u001B[30m";
        String blueBackGround = "\u001B[44m";
        String redBackGround = "\u001B[41m";
        Scanner scanner = new Scanner(System.in);
        System.out.print(blueBackGround + " Input n : " + reset);
        int n = scanner.nextInt();
        int[] score = new int[n];


        for(int i=0 ; i<score.length ; i++ ){
            System.out.print(red+"  Enter element of score " + (i+1) +" : ");
            score[i]= scanner.nextInt();
        }
        int i=0;
        int avg =0;
        int sum=0;
        for (int s:score) {
            if(s%2==0) {
                System.out.print(s + "\t\t");
                avg+=s;
                i++;
            }
            sum+=s;
        }

        System.out.println("-".repeat(100));
        System.out.println(" All element ");
        System.out.println(Arrays.toString(score));

        System.out.println("  Total : " + sum);
        System.out.println("  Average : " + sum/ score.length + reset);


        System.out.println("-".repeat(100));
        System.out.println();
        System.out.println(" Even numbers : " );



        System.out.println("\n Average of even number : " +(double) avg/i);
        System.out.println("-".repeat(100) +"\n\n");

        System.out.println(" Odd number : ");
        for (int s:score) {

            if(s%2==1) {
                System.out.print(s + "\t\t");
                avg+=s;
                i++;
            }
        }
        System.out.println("\n Average of odd number : " +(double) avg/i);
        System.out.println("-".repeat(100) + "\n\n");

        int max = score[0] ;
        int min = score[0];
        for(int j=0 ; j<n ; j++){
            if(max<score[j]){
                max=score[j];
            }
            if(min>score[j])
            {
                min=score[j];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("-".repeat(100));


        for (int k=0 ; k<score.length ; k++ ){
            for(int l=k+1 ; l<score.length ; l++ ){
                if(score[k] > score[l]){
                    int temp = score[k];
                    score[k] = score[l];
                    score[l] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(score));


        System.out.println("  Array 2D");
        int [][] table = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };



        System.out.println("\nFor loop");
        for(int u=0 ; u<table.length ;u++){
            for(int y=0 ; y<table.length ; y++){
                System.out.print("\t"+table[u][y]);
            }
            System.out.println();
        }

        System.out.println("\nForeach loop");
        for (int[] row:table) {
            for (int col:row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }

        System.out.println("\nRevers Column ");
        for(int u=table.length-1 ; u>=0 ;u--){
            for(int y=0 ; y<table.length ; y++){
                System.out.print("\t"+table[u][y]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Hello world");
    }
}
