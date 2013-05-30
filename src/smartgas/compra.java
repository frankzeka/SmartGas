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
public class compra implements Serializable{
    int cod_compra;
    int cod_funcionario;
    int cod_fornecedor;
    Date data_compra;
    float valor_total;
    ArrayList <itens_compra> itenscompra;
}
