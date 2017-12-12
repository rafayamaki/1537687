/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prova.prova.controller;

import com.prova.prova.entity.Carro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RAFAEL
 */
@Stateless
public class CarroFacade extends AbstractFacade<Carro> {

    @PersistenceContext(unitName = "com.prova_Prova_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarroFacade() {
        super(Carro.class);
    }
    
}
