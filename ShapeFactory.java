import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.*;


/**
 *
 * @author natalia
 */
public class ShapeFactory {
  public Shape shape;
  public BasicStroke stroke;
  public Paint paint;
  public int width = 25;
  public int height = 25;
/**
 * 
 * конструкто класса ShapeFactory создаЄт фигуру
 * @param shape_type параметр указывает какую фигуру рисовать
 */
  public ShapeFactory(int shape_type) {
    this.stroke = new BasicStroke(3.0F);
    switch (shape_type / 10) {
    case 1:
      this.shape = createStar(3, new Point(0, 0), this.width / 2.0D, this.width / 2.0D);
      break;
    case 3:
      this.shape = createStar(5, new Point(0, 0), this.width / 2.0D, this.width / 4.0D);
      break;
    case 5:
      this.shape = new Rectangle2D.Double(-this.width / 2.0D, -this.height / 2.0D, this.width, this.height);
      break;
    case 7:
      GeneralPath path = new GeneralPath();
      double tmp_height = Math.sqrt(2.0D) / 2.0D * this.height;
      path.moveTo(-this.width / 2, -tmp_height);
      path.lineTo(0.0D, -tmp_height);
      path.lineTo(this.width / 2, tmp_height);
      path.closePath();
      this.shape = path;
      break;
    case 9:
      this.shape = new Arc2D.Double(this.width / 2.0D, this.height / 2.0D, this.width, this.height, 300.0D, 300.0D, 
        2);
      break;
    case 2:
    case 4:
    case 6:
    case 8:
    default:
      throw new Error("type is nusupported");
    }
    switch (shape_type % 10) { case 1:
      this.stroke = new BasicStroke(3.0F);
      break;
    case 3:
      break;
    case 4:
      this.stroke = new BasicStroke(7.0F);
      break;
    case 7:
      this.paint = new GradientPaint(
       - this.width,  - this.height, Color.white, 
        this.width, this.height, Color.gray, true);
      break;
    case 8:
      this.paint = Color.gray;
      break;
    case 2:
    case 5:
    case 6:
    default:
      throw new Error("type is nusupported");
    }
  }
/**
 * метод класса Shape дл€ рисовани€ фигуры
 * @param arms параметр задает количество углов фигуры
 * @param center точка определ€ет центр фигуры
 * @param rOuter радиус внешней части фигуры
 * @param rInner радиус внешней части фигуры
 * @return метод возвращает экземпл€р класса Shape
 */
  private static Shape createStar(int arms, Point center, double rOuter, double rInner)
  {
    double angle = 3.141592653589793D / arms;

    GeneralPath path = new GeneralPath();

    for (int i = 0; i < 2 * arms; i++)
    {
      double r = (i & 0x1) == 0 ? rOuter : rInner;
      Point2D.Double p = new Point2D.Double(center.x + Math.cos(i * angle) * r, center.y + Math.sin(i * angle) * r);
      if (i == 0) path.moveTo(p.getX(), p.getY()); else
        path.lineTo(p.getX(), p.getY());
    }
    path.closePath();
    return path;
  }  
}
