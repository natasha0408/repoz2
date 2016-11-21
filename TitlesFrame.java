import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author natalia
 */
public class TitlesFrame 
extends JFrame
{
    /**
     * Конструктор для класса TitlesFrame;
     */
  public TitlesFrame()
  {
    initUI();
  }
/**
 * Метод для вывода графического интерфейся пользователя;
 */
  private void initUI()
  {
    setTitle("РљСЂРёРІС‹Рµ С„РёРіСѓСЂС‹");
    setDefaultCloseOperation(3);
    add(new TitlesPanel(57));
    setSize(350, 350);
    setLocationRelativeTo(null);
  }
/**
 * Главный метод программы;
 * @param args указывает главный класс программы;
 */
  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        TitlesFrame ps = new TitlesFrame();
        ps.setVisible(true);
      }
    });
  };

    
    
}
