package tom.module01;

/**
 * @author tom;
 * @create 2022/6/9 16:54
 */
public class Templates {

    private static final int I=9;//prsf
    public static final int N = 9;//psf
    public static final int NN = 2;//psfi
    public static final String SSD = "";//psfs



    public static void main(String[] args) {//psvm
        int asd = 20;
        System.out.println();//sout-----打印语句
        System.out.println("args = [" + args + "]");//soutp-----打印参数列表
        System.out.println("Templates.main");//soutm-----打印方法名
        System.out.println("asd = " + asd);//soutv------打印最近的变量
        System.out.println("");//"".sout-----------打印xxx

    }

    public void funtion(){
        System.out.println("Templates.funtion");
        String s = new String();
        String[] arr = new String[]{"tom","jerry","lili"};
        for (String ignored : arr) {//arr.for
        }
        for (int i = 0; i < arr.length; i++) {//arr.fori
        }
        for (int i = arr.length - 1; i >= 0; i--) {//arr.forr
        }
        if (arr == null) {//ifn
        }
        if (arr == null) {//arr.null
        }
        if (arr != null) {//inn
        }
    }

}
