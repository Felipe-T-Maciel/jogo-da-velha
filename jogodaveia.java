import java.util.Scanner;
import javax.swing.JOptionPane;
public class addonJogodaveia {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] jogoDaVelha = new String[3][3];
        int vezJogador=0;
        int i=0,j=0;
        String coluna="",linha="";
        boolean[][] X = new boolean[3][3], O = new boolean[3][3];
        int contadorJogadas=0;
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                X[i][j] = true;
                O[i][j] = true;
                jogoDaVelha[i][j]= " (  ) ";
            }
        }

        JOptionPane.showMessageDialog(null,"O JOGO COMEÇOU");

        do{
            coluna = JOptionPane.showInputDialog("Coluna: ");
            linha = JOptionPane.showInputDialog("Linha: ");
            if(coluna==null || linha==null){
                JOptionPane.showMessageDialog(null,"Jogo cancelado");
            }
            else{
                i = Integer.parseInt(coluna);
                j = Integer.parseInt(linha);
                if(i>=0 && i<=2 & j>=0 && j<=2){
                    contadorJogadas++;
                    if(vezJogador%2==0){
                        if(X[i][j] == false || O[i][j] == false){
                            JOptionPane.showMessageDialog(null,"Jogada invalida");
                        }
                        else{
                            vezJogador++;
                            jogoDaVelha[i][j] = " (x) ";
                            X[i][j] = false;
                            imprimi(jogoDaVelha);
                        }
                    }
                    else{
                        if(X[i][j] == false || O[i][j] == false){
                            JOptionPane.showMessageDialog(null,"Jogada invalida");
                        }
                        else{
                            vezJogador++;
                            jogoDaVelha[i][j] = " (O) ";
                            O[i][j] = false;
                            imprimi(jogoDaVelha);

                        }
                            
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Jogada invalida");
                }
            }
        }while(verificaX(X)==false & verificaX(O)==false & contadorJogadas<9 & coluna!=null & linha != null);

        if(verificaX(X) == true){
            JOptionPane.showMessageDialog(null,"Jogador 'X' venceu");
        }
        else if(verificaX(O) == true){
            JOptionPane.showMessageDialog(null,"Jogador 'O' venceu");
        }
        else if(coluna!=null || linha!=null){
            JOptionPane.showMessageDialog(null,"Velha");
        }
    }

    public static void imprimi(String[][] jogoDaVelha){ 
        JOptionPane.showMessageDialog(null,"      0     1     2\n 0 "+jogoDaVelha[0][0]+jogoDaVelha[1][0]+jogoDaVelha[2][0]+"\n 1 "+jogoDaVelha[0][1]+jogoDaVelha[1][1]+jogoDaVelha[2][1]+"\n 2 "+jogoDaVelha[0][2]+jogoDaVelha[1][2]+jogoDaVelha[2][2]+"\n");
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
