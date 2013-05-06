package inter;
import lexer.*; import symbols.*;

public class Op extends Expr {

   public Op(Token tok, Type p)  { super(tok, p); }

   public Expr reduce() {
	  //System.out.println("Imprimo toString de op");
      Expr x = gen();
      Temp t = new Temp(type);
	  //emit( t.toString() + " = " + x.toString() );
	  emit("( " + x.op + " , "+ x.toString() + " , " + t.toString() + " )");
      return t;
   }
}