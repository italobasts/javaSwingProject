package cliente;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author italo
 */
public class TableModelCliente extends AbstractTableModel{

    private ArrayList<Cliente> listaDeClientes;
    private String[] coluna = {"codigo","nome","cpf"};
    
    public TableModelCliente(){
    this.listaDeClientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente c){
      this.listaDeClientes.add(c);
      fireTableDataChanged();
}
       public void removerCliente(int rowIndex){
       this.listaDeClientes.remove(rowIndex);
        fireTableDataChanged();
       
               }
    
       public Cliente getCliente(int rowIndex){
       
       
       return this.listaDeClientes.get(rowIndex);
       
       }
    @Override
    public int getRowCount() {
        return this.listaDeClientes.size();
    }

    @Override
    public int getColumnCount() {
     return coluna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return this.listaDeClientes.get(rowIndex).getCodigo();
           case 1:
               return this.listaDeClientes.get(rowIndex).getNome();
           case 2:
               return this.listaDeClientes.get(rowIndex).getCpf();
           default:
               return this.listaDeClientes.get(rowIndex);
       }
    }
    
    public String getColumnName(int columnIndex){
    return this.coluna[columnIndex];
    }
    
}