
public class AppStart
{
    public static void main(String[] args){
        Size size = Size.MEDIUM;
        System.out.println("Name: MEDIUM");
        System.out.println("toString():" + size.getDescription());
        System.out.println("Ordem: 1");
        System.out.println("Valor minimo : " + size.getMinValue());
        System.out.println("Valor maximo : " + size.getMaxValue());
        System.out.println("Código : " + size.getCode());
    }
}
