import java.io.PrintWriter;
 class printwriter2{
    public static void main(String args[]){
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Hello world!");
        pw.print("this is a");
        pw.print("print statement .");
        pw.close();
    }
    }