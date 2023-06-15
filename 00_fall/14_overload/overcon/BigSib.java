/*
Neverland (Diana Akhmedova + Ajax, Rin Fukuoka + Tape, Marcus Wu)
APCS
HW 14 - Customize Your Creation
2021-10-07

DISCO:
- Overloaded constructors use parameters, while default parameters do not.
QCC:
- N/A
*/

public class BigSib {
  private String helloMsg;

  public BigSib() {
    helloMsg = "Word up";
  }

  public BigSib(String msg) {
    helloMsg = msg;
  }

  public String greet(String name) {
    return(helloMsg + " " + name);
  }
}
