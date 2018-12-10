package br.senac.sc.cursos.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "empregado")
@XmlAccessorType(XmlAccessType.FIELD)
public class Empregado {
	private String empNo;
    private String empName;
    private String posicao;
 
    
    public Empregado() {
 
    }
 
    public Empregado(String empNo, String empNome, String posicao) {
        this.empNo = empNo;
        this.empName = empNome;
        this.posicao = posicao;
    }
 
    public String getEmpNo() {
        return empNo;
    }
 
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
 
    public String getEmpName() {
        return empName;
    }
 
    public void setEmpName(String empNome) {
        this.empName = empNome;
    }
 
    public String getPosicao() {
        return posicao;
    }
 
    public void setPosicao(String position) {
        this.posicao = position;
    }
}
