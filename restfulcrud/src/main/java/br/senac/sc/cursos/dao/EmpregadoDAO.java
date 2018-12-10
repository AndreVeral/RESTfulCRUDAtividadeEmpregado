package br.senac.sc.cursos.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.senac.sc.cursos.model.*;
public class EmpregadoDAO {
	private static final Map<String, Empregado> empMap = new HashMap<String, Empregado>();
	 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Empregado emp1 = new Empregado("E01", "Joao", "Garçom");
        Empregado emp2 = new Empregado("E02", "Pedro", "Cozinheiro");
        Empregado emp3 = new Empregado("E03", "Manoel", "Faxineiro");
 
        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
    }
 
    public static Empregado getEmpregado(	String empNo) {
        return empMap.get(empNo);
    }
 
    public static Empregado addEmpregado(Empregado emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static Empregado updateEmpregado(Empregado emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static void deleteEmpregado(String empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Empregado> getTodosEmpregados() {
        Collection<Empregado> c = empMap.values();
        List<Empregado> list = new ArrayList<Empregado>();
        list.addAll(c);
        return list;
    }
     
    List<Empregado> list;
 
}

