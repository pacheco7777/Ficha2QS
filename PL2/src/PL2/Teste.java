package PL2;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Utente> lista = new ArrayList<Utente>();
		Scanner input = new Scanner(System.in);
		menu();
		int op = input.nextInt();
		 while(op!=0)
	        {
	            switch(op)
	            {
	                case 1:
	                	System.out.println("Nome");
	                	String nome = input.next();
	                	System.out.println("Género");
	                	String genero = input.next();
	                	System.out.println("Idade");
	                	int idade = input.nextInt();
	                	System.out.println("Altura");
	                	float alt = input.nextFloat();
	                	System.out.println("Peso");
	                	int peso = input.nextInt();
	                	for(int i = 0;i<lista.size();i++)
	                	{
	                		if(lista.get(i).getNome().equals(nome))
	                		{
	                			System.out.println("O nome inserido já existe! Insira outro nome");
	                			nome = input.next();
	                		}
	                		
	                	}
	                	Utente u = new Utente(nome,genero,idade,alt,peso);
	                	u.getIMC();
	                	lista.add(u);
	                	System.out.println("Utente inserido no sistema com sucesso!");
	                break;
	                case 2:
	                {
	                	for(int i = 0;i<lista.size();i++)
	                	{
	                		System.out.println(lista.get(i).toString());
	                	}
	                }
	                break;
	                case 3:
	                {
	                	int existe = 0;
	                	System.out.println("Insira o nome de utente para ver o seu grau de obesidade:");
	                	String n = input.next();
	                	for(int i = 0;i<lista.size();i++)
	                	{
	                		if(lista.get(i).getNome().equals(n))
	                		{
	                			existe = 1;
	                			Utente temp = lista.get(i);
	                			if(temp.getIMC()<=19)
	                			{
	                				System.out.println("O utente possui um peso abaixo do normal.");
	                			}
	                			else if(temp.getIMC()<=25)
	                			{
	                				System.out.println("O utente tem o peso normal.");
	                			}
	                			else if(temp.getIMC()<=30)
	                			{
	                				System.out.println("O utente está em excesso de peso.");
	                			}
	                			else 
	                			{
	                				System.out.println("O utente está obeso.");
	                			}
	                			
	                		}
	                		if(existe == 0)
	                		{
	                			System.out.println("Utente não encontrado!");
	                		}
	                	}
	                }
	                break;
	                case 4:
	                {
	                	int exist = 0;
	                	System.out.println("Insira o nome de utente para ver o estado de saúde:");
	                	String no = input.next();
	                	for(int i = 0;i<lista.size();i++)
	                	{
	                		if(lista.get(i).getNome().equals(no))
	                		{
	                			exist = 1;
	                			int pe = lista.get(i).getPeso();
	                			float al = lista.get(i).getAltura();
	                			lista.get(i).estadoSaude(pe, al);
	                		}
	                	}
	                	if(exist == 0)
                		{
                			System.out.println("Utente não encontrado!");
                		}
	                }
	                break;
	            }
	            menu();
	    		op = input.nextInt();
	        }
		
	}
	public static void menu()
	{
		System.out.println("***MENU***");
		System.out.println("1 - Inserir novo utente");
		System.out.println("2 - Imprimir dados de todos os utentes");
		System.out.println("3 - Determinar grau de obesidade para um utente");
		System.out.println("4 - Determinar estado de saúde de um utente");
		System.out.println("0 - Sair");
		System.out.println("**********");
	}
}