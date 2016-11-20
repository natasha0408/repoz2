import javax.swing.JFrame;
import javax.swing.SwingUtilities;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natalia
 */
public class TitlesFrame 
extends JFrame
{
    /**
     * конструктор класса TitlesFrame
     */
  public TitlesFrame()
  {
    initUI();
  }
/**
 * метод осуществляет вывод на экран пользовательского окна с результатом работы программы
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
 * главный метод программы
 * @param args параметр указывает интерпретатору самый главный класс программы
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
