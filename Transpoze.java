package transpoze;
public class Transpoze {

    public static void main(String[] args) {
        int matris[][]={{1,2,3},{4,5,6}};
        int transpoze[][]=new int [matris[0].length][matris.length];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoze[i][j]=matris[j][i];
                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println();
        }
        
        
        //algoritmik mantık doğru lakin bir yerdeki hata yüzünden kod patlıyor.
    }
    
}


       
     