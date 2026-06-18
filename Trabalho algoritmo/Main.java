import java.util.Scanner; 
 
public class Main { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       funcoes fu = new funcoes(); 
       System.out.println("Bem vindo ao PetFlow!"); 
        fu.home();
    System.out.println("\n========================================");
System.out.println("          AVALIAÇÃO DO PETFLOW          ");
System.out.println("========================================");
System.out.println("Sua opinião é muito importante para nós!");
System.out.println("Como você avalia sua experiência com o sistema?");
System.out.println();
System.out.println("1 ★ - Muito Insatisfeito");
System.out.println("2 ★ - Insatisfeito");
System.out.println("3 ★ - Neutro");
System.out.println("4 ★ - Satisfeito");
System.out.println("5 ★ - Muito Satisfeito");
System.out.print("\nDigite sua avaliação (1 a 5): ");

int nota = sc.nextInt();

while (nota < 1 || nota > 5) {
    System.out.print("Avaliação inválida. Digite uma nota entre 1 e 5: ");
    nota = sc.nextInt();
}

System.out.println();

switch (nota) {
    case 1:
        System.out.println("Lamentamos que sua experiência não tenha sido satisfatória.");
        System.out.println("Trabalharemos para melhorar nossos serviços.");
        break;

    case 2:
        System.out.println("Obrigado pelo seu feedback.");
        System.out.println("Sua avaliação nos ajuda a identificar pontos de melhoria.");
        break;

    case 3:
        System.out.println("Agradecemos sua avaliação.");
        System.out.println("Continuaremos aprimorando o sistema para oferecer uma experiência melhor.");
        break;

    case 4:
        System.out.println("Ficamos felizes que tenha tido uma boa experiência!");
        System.out.println("Obrigado por confiar no PetFlow.");
        break;

    case 5:
        System.out.println("Excelente!");
        System.out.println("Agradecemos sua confiança e preferência pelo PetFlow.");
        break;
}

System.out.println("\nObrigado por utilizar o PetFlow!");
System.out.println("Até a próxima!");
       
        
 
 
 
 
   } 
 
} 
 
