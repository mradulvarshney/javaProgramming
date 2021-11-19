import com.automobile.twoWheeler.Hero;
import com.automobile.Honda;
import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero(sc.next(), sc.next(), sc.next(), sc.nextInt());
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		System.out.println(hero.getSpeed());
		hero.radio();

		System.out.println();

		Honda honda = new Honda(sc.next(), sc.next(), sc.next(), sc.nextInt());
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		System.out.println(honda.getSpeed());
		honda.cdplayer();

	}
}
