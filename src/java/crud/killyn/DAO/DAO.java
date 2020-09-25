/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.DAO;

import crud.entitis.TipoPqrs;
import java.util.List;

/**
 *
 * @author daniel
 */
public interface DAO <E>    {

    void create(E tipoPqrs);

    void edit(E tipoPqrs);

    void remove(E tipoPqrs);

    E find(Object id);

    List<E> findAll();

    List<E> findRange(int[] range);

    int count();
}
