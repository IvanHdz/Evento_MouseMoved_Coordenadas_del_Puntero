/**
 *
 * @author Ivan
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puntero extends JFrame{
    private final JPanel p1;
    private final JLabel l1;
    
    public Puntero(){
        super("Viruz Blog: La Biblioteca de Java");
        setSize(600,600);
        p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        l1 = new JLabel("Coordenadas del raton");
        add(l1,BorderLayout.SOUTH);
        addEventos();
        add(p1);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public void addEventos(){
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
           public void mouseMoved(MouseEvent evento){
             l1.setText(String.format("Sus coordenadas son [%d, %d]",
                  //getX y getY devuelve valores de las coordenadas del puntero.
                     evento.getX(),evento.getY()));
            }
         });
    }
}
