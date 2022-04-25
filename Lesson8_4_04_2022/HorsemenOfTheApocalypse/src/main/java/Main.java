public class Main {

    public static void main(String[] args) {
        HorcemanClass m0 = HorcemanClass.getInstance(TypeHorceman.CONQUEST);
        HorcemanClass m1 = HorcemanClass.getInstance(TypeHorceman.FAMINE);
        HorcemanClass m2 = HorcemanClass.getInstance(TypeHorceman.CONQUEST);
        System.out.println(m0.getName());
        System.out.println(m1.getName());
        System.out.println(m2.getName());
    }
}
