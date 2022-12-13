import java.util.Scanner;
public class jogodaveia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] jogoDaVelha = new String[3][3];
        int vezJogador=0,i=0,j=0;
        boolean[][] X = new boolean[3][3];
        boolean[][] O = new boolean[3][3];
        int contadorJogadas=0;


        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                jogoDaVelha[i][j]= "   ";
            }
        }

        jogoDaVelha[0][1] = " x ";
        System.out.println("\nLembre-se as coordenadas são dadas apartir do 0,\nExemplo Coluna: 0 | Linha: 1\n Como sera imprimido:");
        imprimi(jogoDaVelha);

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                X[i][j] = true;
                O[i][j] = true;
                jogoDaVelha[i][j]= "   ";
            }
        }

        System.out.println("Agora é sua vez\n\n====== Jogo Da Velha ======");

        while(verificaX(X)==false & verificaX(O)==false & contadorJogadas<9){
            System.out.println("\nColuna: ");
            i=scan.nextInt();
            System.out.println("Linha: ");
            j=scan.nextInt();
            if(i>=0 && i<=2 & j>=0 && j<=2){
                contadorJogadas++;
                if(vezJogador%2==0){
                    if(X[i][j] == false || O[i][j] == false){
                        System.out.println("Jogada invalida");
                    }
                    else{
                        vezJogador++;
                        jogoDaVelha[i][j] = " x ";
                        X[i][j] = false;
                        imprimi(jogoDaVelha);
                    }
                }
                else{
                    if(X[i][j] == false || O[i][j] == false){
                        System.out.println("Jogada invalida");
                    }
                    else{
                        vezJogador++;
                        jogoDaVelha[i][j] = " O ";
                        O[i][j] = false;
                        imprimi(jogoDaVelha);
                    }
                        
                }
            }
            else{
                System.out.println("Jogada Invalida");
            }
        }

        if(verificaX(X) == true){
            System.out.println("Jogador 'X' venceu");
        }
        else if(verificaX(O) == true){
            System.out.println("Jogador 'O' venceu");
        }
        else{
            System.out.println("Velha");
        }
    }

    public static void imprimi(String[][] jogoDaVelha){
        System.out.println(jogoDaVelha[0][0]+"|"+jogoDaVelha[1][0]+"|"+jogoDaVelha[2][0]);
        System.out.println(jogoDaVelha[0][1]+"|"+jogoDaVelha[1][1]+"|"+jogoDaVelha[2][1]);
        System.out.println(jogoDaVelha[0][2]+"|"+jogoDaVelha[1][2]+"|"+jogoDaVelha[2][2]);
    }

    public static boolean verificaX(boolean[][] X){

        if(X[0][0] == false & X[1][1] == false & X[2][2] == false){
            return  true;
        }
        if(X[2][0] == false & X[1][1] == false & X[0][2] == false){
            return  true;
        }
        if(X[0][0] == false & X[0][1] == false & X[0][2] == false){
            return  true;
        }
        if(X[1][0] == false & X[1][1] == false & X[1][2] == false){
            return  true;
        }
        if(X[2][0] == false & X[2][1] == false & X[2][2] == false){
            return  true;
        }
        if(X[0][0] == false & X[1][1] == false & X[2][2] == false){
            return  true;
        }
        if(X[0][0] == false & X[1][0] == false & X[2][0] == false){
            return  true;
        }
        if(X[0][1] == false & X[1][1] == false & X[2][1] == false){
            return  true;
        }
        if(X[0][2] == false & X[1][2] == false & X[2][2] == false){
            return  true;
        }
        return false;
    }

    public static boolean verificaO(boolean[][] O){

        if(O[0][0] == false & O[1][1] == false & O[2][2] == false){
            return  true;
        }
        if(O[2][0] == false & O[1][1] == false & O[0][2] == false){
            return  true;
        }
        if(O[0][0] == false & O[0][1] == false & O[0][2] == false){
            return  true;
        }
        if(O[1][0] == false & O[1][1] == false & O[1][2] == false){
            return  true;
        }
        if(O[2][0] == false & O[2][1] == false & O[2][2] == false){
            return  true;
        }
        if(O[0][0] == false & O[1][1] == false & O[2][2] == false){
            return  true;
        }
        if(O[0][0] == false & O[1][0] == false & O[2][0] == false){
            return  true;
        }
        if(O[0][1] == false & O[1][1] == false & O[2][1] == false){
            return  true;
        }
        if(O[0][2] == false & O[1][2] == false & O[2][2] == false){
            return  true;
        }
        return false;
    }
        
}
//"# jogo-da-velha"
