/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_G5.Reto3_G5.Interface;


import Reto3_G5.Reto3_G5.Model.Cliente;
import org.springframework.data.repository.CrudRepository;



/**
 *
 * @author LB
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
