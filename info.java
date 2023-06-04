class info{
    public static void main(String[] args) {
        int f1=0,f2=1,f3;
        System.out.println(f1);
        System.out.println(f2);
        int a=15;
        for(int i=0;i<a;i++){
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
}
