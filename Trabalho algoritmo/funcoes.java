import java.util.Scanner;

public class funcoes {

    Scanner sc = new Scanner(System.in);

    int op, servico, ophome, j, i;
    int id[] = new int[99];

    String email, usuario, senha;
    String emailL, senhaL;
    String nomepet, animal, idadeP;
    String vact[] = new String[10];
    int prod;

    void iniciar() {

        System.out.println("Digite o que deseja fazer");
        System.out.println("1. Cadastro");
        System.out.println("2. Login");

        op = sc.nextInt();
        sc.nextLine(); // limpa Enter
    }

    void Cadastrar() {

        System.out.println("Digite seu email:");
        email = sc.nextLine();

        System.out.println("Digite o nome de usuário:");
        usuario = sc.nextLine();

        System.out.println("Digite sua senha:");
        senha = sc.nextLine();
    }

    void Login() {

        System.out.println("Digite seu email ou usuário:");
        emailL = sc.nextLine();

        System.out.println("Digite sua senha:");
        senhaL = sc.nextLine();
        if (emailL == usuario || emailL == email && senhaL == senha){
            home();
        }
        else {
            Login();
        }
    }

    void home() {

        System.out.println("\nDigite o serviço:");
        System.out.println("1. Cadastrar pet");
        System.out.println("2. Agendamento");
        System.out.println("3. Carteira veterinária");
        System.out.println("4. Adoção");
        System.out.println("5. Loja");
        System.out.println("6. Sair do programa.");

        ophome = sc.nextInt();
        sc.nextLine();

        switch (ophome) {

            case 1:
                pet();
                break;

            case 2:
                agendamento();
                break;

            case 3:
                carteira();
                break;

            case 4:
                adocao();
                break;

            case 5:
                loja();
                break;
            case 6:
                System.out.println("Programa encerrado");
                break;

            default:
                System.out.println("Opção inválida");
                home();
        }
    }

    void pet() {

        System.out.print("Nome do pet: ");
        nomepet = sc.nextLine();
        System.out.print("Animal: ");
        animal = sc.nextLine();
        System.out.print("Idade: ");
        idadeP = sc.nextLine();
        System.out.println("Pet cadastrado com sucesso!");
        home();
    }

    void agendamento() {

        System.out.println("Digite o serviço:");

        System.out.println("1. Banho");
        System.out.println("2. Tosa");
        System.out.println("3. Adestramento");
        System.out.println("4. Castração");
        System.out.println("5. Voltar");

        servico = sc.nextInt();


        switch(servico){

            case 1:
                System.out.println("Banho agendado");
                home();
                break;

            case 2:
                System.out.println("Tosa agendada");
                home();
                break;

            case 3:
                System.out.println("Adestramento agendado");
                home();
                break;

            case 4:
                System.out.println("Castração agendada");
                home();
                break;

            case 5:
                home();
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

    void carteira() {

        System.out.print("Seu pet tomou quantas vacinas? ");
        j = sc.nextInt();

        System.out.println("Digite as vacinas:");

        for(i = 0; i < j; i++){

            System.out.print("Vacina " + (i+1) + ": ");
            vact[i] = sc.nextLine();
        }

        System.out.println("\n----- Carteira Veterinária -----");

        System.out.println("Nome: " + nomepet);
        System.out.println("Animal: " + animal);
        System.out.println("Idade: " + idadeP);

        System.out.println("Vacinas:");

        for(i = 0; i < j; i++){

            System.out.println(vact[i]);
        }
        home();
    }

    void adocao(){

        System.out.println("Entrar em contato: (31) 4002-8922");
        home();
    }

    void loja(){
       
       System.out.println("-------- LOJA --------");
    System.out.println("1. Ração");
    System.out.println("2. Petisco");
    System.out.println("3. Bolinha");
    System.out.println("4. Brinquedo");
    System.out.println("5. Coleira");
    System.out.println("6. Caminha");
    System.out.println("7. Finalizar compra");

    prod = sc.nextInt();

    switch (prod) {
        case 1:
            System.out.println("Ração adicionada ao carrinho.");
            loja();
            break;
        case 2:
            System.out.println("Petisco adicionado ao carrinho.");
            loja();
            break;
        case 3:
            System.out.println("Bolinha adicionada ao carrinho.");
            loja();
            break;
        case 4:
            System.out.println("Brinquedo adicionado ao carrinho.");
            loja();
            break;
        case 5:
            System.out.println("Coleira adicionada ao carrinho.");
            loja();
            break;
        case 6:
            System.out.println("Caminha adicionada ao carrinho.");
            loja();
            break;
        case 7:
            System.out.println("Finalizando compra...");
            home();
            break;
        default:
            System.out.println("Opção inválida!");
        }
    }
        
 }
