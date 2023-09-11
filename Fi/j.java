import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class MeuApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Define a cor do círculo para vermelho
        g.setColor(Color.RED);

        // Desenha um círculo na tela
        g.fillOval(100, 100, 50, 50);
    }
}
