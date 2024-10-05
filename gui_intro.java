import javax.swing.JOptionPane;

public class gui_intro {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("enter your name :");
        //JOptionPane.showMessageDialog(null,"hello"+name);

        float age=Float.parseFloat(JOptionPane.showInputDialog("how old are you:"));
        //JOptionPane.showMessageDialog(null,"your age is:"+age);

        double height=Double.parseDouble(JOptionPane.showInputDialog("what is your height:"));

        JOptionPane.showMessageDialog(null,"hello "+name);
        JOptionPane.showMessageDialog(null,"your age is "+age);
        JOptionPane.showMessageDialog(null,"you are "+height+"cm");
        JOptionPane.showMessageDialog(null,"your are foking nup  "+name);
    }


}
