public class AsalSayi {
    public static void main(String[] args) {
        boolean asalMi=true;
        for (int i=2;i<100;i++){

            for (int j=2;j<i/2+1;j++){
                if (i%j==0){
                    asalMi=false;
                }
            }
            if (asalMi){
                System.out.print(i +" ");
            }
            asalMi=true;
        }
    }
}
