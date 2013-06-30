/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class venda implements Serializable{
    int cod_venda;
    int cod_cliente;
    int cod_funcionario;
    Date data_venda;
    float valor_total;
    ArrayList<itens_venda> itensVenda;
}

//