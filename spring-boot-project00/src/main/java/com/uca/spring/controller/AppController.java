package com.uca.spring.controller;

import java.io.IOException;  
import java.time.LocalDate; 
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.uca.spring.util.Util;

import javassist.expr.NewArray;

@Controller
@RequestMapping("/")
public class AppController {
	
	//VArs globales del controlador

	//Action que se invoca al iniciar la app en la ruta del login (/)
  @GetMapping("/")
  public String getForm() {
	  
	  
    return "login.jsp";
  }
  
  
  //Actions para rutas (para botones):
  @GetMapping("/login")
  public String login() {
	  
	  //Al volver al login o al deslogearse para que reinicie el estudiante logeado
//	  carreraEstudianteLogeado = null;
//	  estudianteLogeado = null;
//	  estudianteExiste = false;
	  
	  //Limpiando las listas de las evaluaciones
//	  nombreActividades.clear();
//	  ponderacionActividades.clear();
//	  fechaActividades.clear();
//	  notaActividades.clear();
//	  listEvaluacionesSize = 0;
	  
    return "login.jsp";
  } 
  
  @PostMapping("/loginn")   
  public String login(@RequestParam("CARNET") String CARNET,
		  @RequestParam("PASSWORD") String PASSWORD, 
		  ModelMap modelMap){ 
	  
	  
	  if(CARNET.isEmpty() || PASSWORD.isEmpty()) {
		  modelMap.put("errorL","No deje espacios en blanco");
		  return "login.jsp";
	  }
	  else {
		  return "login.jsp";
	  }
	   
  } 
 
  //Al moverse a otra pagina:
  @GetMapping("/dataUpdate")
  public String dataUpdate() {
    return "dataUpdate.jsp";
  } 
  
  
  @GetMapping("/userUpdate")
  public String userUpdate() {
    return "userUpdate.jsp";
  } 
   
  
   
  
}

    
	  
   
    
  
  

