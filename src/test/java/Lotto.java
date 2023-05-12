public class Lotto {
    public static void main(String[] args){
        System.out.println("show lotto");
        int a1 =0,a2=0,a3=0,a4=0,a5 = 0;

        for(int i=0;i<500;i++) {
            int x = (int) (Math.random() * 5 + 1);
            switch(x){
                case 1 : a1++;break;
                case 2 : a2++;break;
                case 3 : a3++;break;
                case 4 : a4++;break;
                case 5 : a5++;break;
                default: System.out.println("default");
            }
            System.out.print(x + " ");
            if((i+1) % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("1이 나온 경우 : " + a1);
        System.out.println("2이 나온 경우 : " + a2);
        System.out.println("3이 나온 경우 : " + a3);
        System.out.println("4이 나온 경우 : " + a4);
        System.out.println("5이 나온 경우 : " + a5);
    }
}
