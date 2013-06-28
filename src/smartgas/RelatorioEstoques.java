/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgas;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author info48
 */
public class RelatorioEstoques {
    public void executa() throws Exception {
        ArrayList <produto> fichario = new ArrayList <produto>();
        try{
            ObjectInputStream arqEntrada = new ObjectInputStream(new FileInputStream(new File("produto.ser")));
            fichario = (ArrayList<produto>) arqEntrada.readObject();
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Problema com a Classe", "SmartGas", JOptionPane.ERROR_MESSAGE);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Gerando Arquivo de Dados", "SmartGas", JOptionPane.INFORMATION_MESSAGE);
            File arquivo = new File("produto.ser");
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(telaproduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado", "SmartGas", JOptionPane.INFORMATION_MESSAGE);
    }

                Document doc = null;
	        OutputStream os = null;             
        
		
        try {
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
			
            //cria a stream de saída
            os = new FileOutputStream("estoque.pdf");
			
            //associa a stream de saída ao 
            PdfWriter.getInstance(doc, os);
			
            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
            Paragraph p = new Paragraph("Relatório Estoque", f);
            p.setAlignment(Element.ALIGN_CENTER);
            doc.add(p);
           //Prepara os Dados
            int total = fichario.size();
           produto ficha = new produto();
           PdfPTable table = new PdfPTable(4);
           PdfPCell header = new PdfPCell(new Paragraph("Lista de Produtos no estoque"));
           header.setColspan(4);
           table.addCell(header);
           table.addCell("Tipo");
           table.addCell("Peso");
           table.addCell("Preço Unitário");
           table.addCell("Quantidade");
           for (int x=0; x<total;x++){
               ficha = fichario.get(x);
               table.addCell(ficha.tipo);
               table.addCell(Integer.toString(ficha.peso));
               table.addCell(Float.toString(ficha.precounitario));
               table.addCell(Integer.toString(ficha.quantidade));
           }
           doc.add(table); 

        } finally {
            if (doc != null) {
                //fechamento do documento
                doc.close();
            }
            if (os != null) {
               //fechamento da stream de saída
               os.close();
            }
            
            // abrindo o arquivo pelo sistema
             
            try {
                File pdf = new File("estoque.pdf");
                Desktop.getDesktop().open(pdf);
            } catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
            }  
        }
  
	    
            } 
            
  
	    }     
    
