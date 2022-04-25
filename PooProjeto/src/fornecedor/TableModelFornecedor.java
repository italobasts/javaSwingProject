package fornecedor;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelFornecedor extends AbstractTableModel{

    private ArrayList<Fornecedor> listaDeFornecedor;
    private String[] coluna = {"codigo","nome","cnpj"};
    
    public TableModelFornecedor(){
    this.listaDeFornecedor = new ArrayList<>();
    }
    
    public void adicionarFornecedor(Fornecedor c){
      this.listaDeFornecedor.add(c);
      fireTableDataChanged();
}
       public void removerFornecedor(int rowIndex){
       this.listaDeFornecedor.remove(rowIndex);
        fireTableDataChanged();
       
               }
    
       public Fornecedor getFornecedor(int rowIndex){
       
       
       return this.listaDeFornecedor.get(rowIndex);
       
       }
    @Override
    public int getRowCount() {
        return this.listaDeFornecedor.size();
    }

    @Override
    public int getColumnCount() {
     return coluna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return this.listaDeFornecedor.get(rowIndex).getCodigo();
           case 1:
               return this.listaDeFornecedor.get(rowIndex).getNome();
           case 2:
               return this.listaDeFornecedor.get(rowIndex).getCnpj();
           default:
               return this.listaDeFornecedor.get(rowIndex);
       }
    }
    
    public String getColumnName(int columnIndex){
    return this.coluna[columnIndex];
    }
    
}