package section_2.e2_2;

import javax.swing.*;
import java.io.File;

class ImageViewerFrame extends JFrame {
    private final JLabel label;
    private final JFileChooser chooser;
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=300;

    public ImageViewerFrame()  {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        label = new JLabel();
        add(label);

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Plik");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Otwórz");
        menu.add(openItem);

        openItem.addActionListener(event ->{
            int result = chooser.showOpenDialog(null);

            if(result==JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        JMenuItem exitItem = new JMenuItem("Zakończ");
        menu.add(exitItem);

        exitItem.addActionListener(event -> System.exit(0));


    }
}