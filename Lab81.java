public class Lab81 {
    public static void main(String[] args) {
        try{
            int c = 4 / 0;
        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


//    finally {
//            System.out.println("helllp");
//        }


    }
}