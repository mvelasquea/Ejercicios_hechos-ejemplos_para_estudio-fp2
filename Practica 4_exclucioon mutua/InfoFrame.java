import javax.swing.*;
import java.awt.*;

public class InfoFrame extends JFrame {
    private JTextArea textArea;

    public InfoFrame(String title, String content, String additionalInfo) {
        setTitle(title);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear el área de texto una sola vez
        this.textArea = new JTextArea();
        this.textArea.setEditable(false);
        this.textArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Cambia el tipo de fuente y el tamaño

        JScrollPane scrollPane = new JScrollPane(this.textArea);
        add(scrollPane);

        setLocationRelativeTo(null);
        setVisible(true);

        // Establecer el contenido directamente en el JTextArea
        String styledContent = content + "\n" + additionalInfo;
        this.textArea.setText(styledContent);
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
