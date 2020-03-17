
public class pedro {
  String nome;
  double SalarioBruto;
  double imposto;
  double salariol;
  double salarioAu;
  void salarioL() {
	  salariol = SalarioBruto - imposto;
  }
  void salarioA(double salarioA) {
	  salarioAu = salariol + salarioA;
  }
}
