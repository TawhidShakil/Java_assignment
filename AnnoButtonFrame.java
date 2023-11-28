import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AnnoButtonFrame extends JFrame
{
    private final JButton plainJButton;
    private final JButton fancyJButton;
        
    public AnnoButtonFrame()
    {   
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("abc.jpg"));
        Icon bug2 = new ImageIcon(getClass().getResource("abc.jpg"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);


        plainJButton.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(AnnoButtonFrame.this, String.format("You pressed: %s",event.getActionCommand()));
        }
    });


    }

    
    

    public static void main(String[] args)
    {
        AnnoButtonFrame buttonFrame = new AnnoButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
}
