package br.senac.sc.cursos.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import br.senac.sc.cursos.dao.*;
import br.senac.sc.cursos.model.*;
 
@Path("/empregados")

public class EmpregadoService {
	// URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Empregado> getEmployees_JSON() {
        List<Empregado> listOfCountries = EmpregadoDAO.getTodosEmpregados();
        return listOfCountries;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empregado getEmployee(@PathParam("empNo") String empNo) {
        return EmpregadoDAO.getEmpregado(empNo);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empregado addEmployee(Empregado emp) {
        return EmpregadoDAO.addEmpregado(emp);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Empregado updateEmployee(Empregado emp) {
        return EmpregadoDAO.updateEmpregado(emp);
    }
 
    @DELETE
    @Path("/{empNo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEmployee(@PathParam("empNo") String empNo) {
        EmpregadoDAO.deleteEmpregado(empNo);
    }
}
