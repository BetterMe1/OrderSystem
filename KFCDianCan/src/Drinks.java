/**
 * 饮品类
 * @author lenovo
 *
 */
public abstract class Drinks extends AbstractFood implements Food{
	 public void printMessage(){
	        System.out.println("--"+this.kind+"  单价："+this.price+
	                "  数量："+this.num+"  合计："+this.totalPrice());
	    }
}
