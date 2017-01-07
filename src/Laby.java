import java.awt.Graphics;

public class Laby {

	private static char[][] laby = new char [32][28];

	public static char [][] Gene(int [] pos, int [] posfr){


		for (int i=0; i<28; i++ ){
			laby[0][i]= '#';
			laby[31][i]= '#';
		}
		for (int i=0; i<32; i++ ){
			laby[i][0]= '#';
			laby[i][27]= '#';
		}

		laby[2][2]='#';
		laby[2][3]='#';
		laby[2][4]='#';
		laby[2][5]='#';
		laby[3][2]='#';
		laby[3][3]='#';
		laby[3][4]='#';
		laby[3][5]='#';
		laby[4][2]='#';
		laby[4][3]='#';
		laby[4][4]='#';
		laby[4][5]='#';

		laby[2][7]='#';
		laby[2][8]='#';
		laby[2][9]='#';
		laby[2][10]='#';
		laby[2][11]='#';
		laby[3][7]='#';
		laby[3][8]='#';
		laby[3][9]='#';
		laby[3][10]='#';
		laby[3][11]='#';
		laby[4][7]='#';
		laby[4][8]='#';
		laby[4][9]='#';
		laby[4][10]='#';
		laby[4][11]='#';

		laby[1][13]='#';
		laby[2][13]='#';
		laby[3][13]='#';
		laby[1][14]='#';
		laby[2][14]='#';
		laby[3][14]='#';

		laby[2][16]='#';
		laby[2][17]='#';
		laby[2][18]='#';
		laby[2][19]='#';
		laby[2][20]='#';
		laby[3][16]='#';
		laby[3][17]='#';
		laby[3][18]='#';
		laby[3][19]='#';
		laby[3][20]='#';
		laby[4][13]='#';
		laby[4][14]='#';
		laby[4][16]='#';
		laby[4][17]='#';
		laby[4][18]='#';
		laby[4][19]='#';
		laby[4][20]='#';

		laby[2][22]='#';
		laby[2][23]='#';
		laby[2][24]='#';
		laby[2][25]='#';
		laby[3][22]='#';
		laby[3][23]='#';
		laby[3][24]='#';
		laby[3][25]='#';
		laby[4][22]='#';
		laby[4][23]='#';
		laby[4][24]='#';
		laby[4][25]='#';

		laby[6][2]='#';
		laby[6][3]='#';
		laby[6][4]='#';
		laby[6][5]='#';
		laby[7][2]='#';
		laby[7][3]='#';
		laby[7][4]='#';
		laby[7][5]='#';

		laby[6][25]='#';
		laby[6][24]='#';
		laby[6][23]='#';
		laby[6][22]='#';
		laby[7][25]='#';
		laby[7][24]='#';
		laby[7][23]='#';
		laby[7][22]='#';

		laby[6][7]='#';
		laby[7][7]='#';
		laby[8][7]='#';
		laby[9][7]='#';
		laby[10][7]='#';
		laby[11][7]='#';
		laby[12][7]='#';
		laby[13][7]='#';

		laby[6][8]='#';
		laby[7][8]='#';
		laby[8][8]='#';
		laby[9][8]='#';
		laby[10][8]='#';
		laby[11][8]='#';
		laby[12][8]='#';
		laby[13][8]='#';

		laby[9][9]='#';
		laby[10][9]='#';
		laby[9][10]='#';
		laby[10][10]='#';
		laby[9][11]='#';
		laby[10][11]='#';
		laby[10][13]='#';
		laby[10][14]='#';

		laby[6][10]='#';
		laby[6][11]='#';
		laby[6][12]='#';
		laby[6][13]='#';
		laby[6][14]='#';
		laby[6][15]='#';
		laby[6][16]='#';
		laby[6][17]='#';
		laby[7][10]='#';
		laby[7][11]='#';
		laby[7][12]='#';
		laby[7][13]='#';
		laby[7][14]='#';
		laby[7][15]='#';
		laby[7][16]='#';
		laby[7][17]='#';
		laby[8][13]='#';
		laby[8][14]='#';
		laby[9][13]='#';
		laby[9][14]='#';

		laby[6][19]='#';
		laby[7][19]='#';
		laby[8][19]='#';
		laby[9][19]='#';
		laby[10][19]='#';
		laby[11][19]='#';
		laby[12][19]='#';
		laby[13][19]='#';

		laby[6][20]='#';
		laby[7][20]='#';
		laby[8][20]='#';
		laby[9][20]='#';
		laby[10][20]='#';
		laby[11][20]='#';
		laby[12][20]='#';
		laby[13][20]='#';

		laby[9][16]='#';
		laby[10][16]='#';
		laby[9][17]='#';
		laby[10][17]='#';
		laby[9][18]='#';
		laby[10][18]='#';

		laby[9][1]='#';
		laby[9][2]='#';
		laby[9][3]='#';
		laby[9][4]='#';
		laby[9][5]='#';
		laby[10][5]='#';
		laby[11][5]='#';
		laby[12][5]='#';
		laby[13][5]='#';
		laby[14][1]='#';
		laby[14][2]='#';
		laby[14][3]='#';
		laby[14][4]='#';
		laby[14][5]='#';

		laby[16][1]='#';
		laby[16][2]='#';
		laby[16][3]='#';
		laby[16][4]='#';
		laby[16][5]='#';
		laby[17][5]='#';
		laby[18][5]='#';
		laby[19][5]='#';
		laby[20][5]='#';
		laby[20][4]='#';
		laby[20][3]='#';
		laby[20][2]='#';
		laby[20][1]='#';

		laby[16][7]='#';
		laby[17][7]='#';
		laby[18][7]='#';
		laby[19][7]='#';
		laby[20][7]='#';
		laby[16][8]='#';
		laby[17][8]='#';
		laby[18][8]='#';
		laby[19][8]='#';
		laby[20][8]='#';

		laby[20][10]='#';
		laby[20][11]='#';
		laby[20][12]='#';
		laby[20][13]='#';
		laby[20][14]='#';
		laby[20][15]='#';
		laby[20][16]='#';
		laby[20][17]='#';
		laby[19][10]='#';
		laby[19][11]='#';
		laby[19][12]='#';
		laby[19][13]='#';
		laby[19][14]='#';
		laby[19][15]='#';
		laby[19][16]='#';
		laby[19][17]='#';
		laby[21][13]='#';
		laby[21][14]='#';
		laby[22][13]='#';
		laby[22][14]='#';
		laby[23][13]='#';
		laby[23][14]='#';

		laby[16][19]='#';
		laby[17][19]='#';
		laby[18][19]='#';
		laby[19][19]='#';
		laby[20][19]='#';
		laby[16][20]='#';
		laby[17][20]='#';
		laby[18][20]='#';
		laby[19][20]='#';
		laby[20][20]='#';

		laby[9][26]='#';
		laby[9][25]='#';
		laby[9][24]='#';
		laby[9][23]='#';
		laby[9][22]='#';
		laby[10][22]='#';
		laby[11][22]='#';
		laby[12][22]='#';
		laby[13][22]='#';
		laby[14][26]='#';
		laby[14][25]='#';
		laby[14][24]='#';
		laby[14][23]='#';
		laby[14][22]='#';

		laby[16][22]='#';
		laby[16][23]='#';
		laby[16][24]='#';
		laby[16][25]='#';
		laby[16][26]='#';
		laby[17][22]='#';
		laby[18][22]='#';
		laby[19][22]='#';
		laby[20][22]='#';
		laby[20][23]='#';
		laby[20][24]='#';
		laby[20][25]='#';
		laby[20][26]='#';

		laby[22][7]='#';
		laby[22][8]='#';
		laby[22][9]='#';
		laby[22][10]='#';
		laby[22][11]='#';
		laby[23][7]='#';
		laby[23][8]='#';
		laby[23][9]='#';
		laby[23][10]='#';
		laby[23][11]='#';

		laby[22][2]='#';
		laby[22][3]='#';
		laby[22][4]='#';
		laby[22][5]='#';
		laby[23][2]='#';
		laby[23][3]='#';
		laby[23][4]='#';
		laby[23][5]='#';
		laby[24][4]='#';
		laby[24][5]='#';
		laby[25][4]='#';
		laby[25][5]='#';
		laby[26][4]='#';
		laby[26][5]='#';

		laby[26][1]='#';
		laby[25][1]='#';
		laby[26][2]='#';
		laby[25][2]='#';

		laby[28][2]='#';
		laby[29][2]='#';
		laby[28][3]='#';
		laby[29][3]='#';
		laby[28][4]='#';
		laby[29][4]='#';
		laby[28][5]='#';
		laby[29][5]='#';
		laby[28][6]='#';
		laby[29][6]='#';
		laby[28][7]='#';
		laby[29][7]='#';
		laby[28][8]='#';
		laby[29][8]='#';
		laby[28][9]='#';
		laby[29][9]='#';
		laby[28][10]='#';
		laby[29][10]='#';
		laby[28][11]='#';
		laby[29][11]='#';
		laby[29][13]='#';
		laby[29][14]='#';
		laby[27][7]='#';
		laby[26][7]='#';
		laby[27][8]='#';
		laby[26][8]='#';
		laby[25][8]='#';
		laby[25][7]='#';

		laby[25][10]='#';
		laby[25][11]='#';
		laby[25][12]='#';
		laby[25][13]='#';
		laby[25][14]='#';
		laby[25][15]='#';
		laby[25][16]='#';
		laby[25][17]='#';
		laby[26][10]='#';
		laby[26][11]='#';
		laby[26][12]='#';
		laby[26][13]='#';
		laby[26][14]='#';
		laby[26][15]='#';
		laby[26][16]='#';
		laby[26][17]='#';
		laby[27][13]='#';
		laby[27][14]='#';
		laby[28][13]='#';
		laby[28][14]='#';

		laby[28][16]='#';
		laby[29][16]='#';
		laby[28][17]='#';
		laby[29][17]='#';
		laby[28][18]='#';
		laby[29][18]='#';
		laby[28][19]='#';
		laby[29][19]='#';
		laby[28][20]='#';
		laby[29][20]='#';
		laby[28][21]='#';
		laby[29][21]='#';
		laby[28][22]='#';
		laby[29][22]='#';
		laby[28][23]='#';
		laby[29][23]='#';
		laby[28][24]='#';
		laby[29][24]='#';
		laby[28][25]='#';
		laby[29][25]='#';
		laby[27][19]='#';
		laby[26][19]='#';
		laby[27][20]='#';
		laby[26][20]='#';
		laby[25][19]='#';
		laby[25][20]='#';

		laby[22][16]='#';
		laby[22][17]='#';
		laby[22][18]='#';
		laby[22][19]='#';
		laby[22][20]='#';
		laby[23][16]='#';
		laby[23][17]='#';
		laby[23][18]='#';
		laby[23][19]='#';
		laby[23][20]='#';

		laby[26][26]='#';
		laby[25][26]='#';
		laby[26][25]='#';
		laby[25][25]='#';

		laby[22][22]='#';
		laby[22][23]='#';
		laby[22][24]='#';
		laby[22][25]='#';
		laby[23][22]='#';
		laby[23][23]='#';
		laby[23][24]='#';
		laby[23][25]='#';
		laby[24][22]='#';
		laby[24][23]='#';
		laby[25][22]='#';
		laby[25][23]='#';
		laby[26][22]='#';
		laby[26][23]='#';

		laby[19][0]=' ';
		laby[18][0]=' ';
		laby[17][0]=' ';
		laby[19][27]=' ';
		laby[18][27]=' ';
		laby[17][27]=' ';

		laby[15][0]=' ';
		laby[12][0]=' ';
		laby[13][0]=' ';
		laby[11][0]=' ';
		laby[10][0]=' ';
		laby[15][27]=' ';
		laby[12][27]=' ';
		laby[13][27]=' ';
		laby[10][27]=' ';
		laby[11][27]=' ';

		laby[13][10]='#';
		laby[13][11]='#';
		laby[13][12]='#';
		laby[13][15]='#';
		laby[13][16]='#';
		laby[13][17]='#';
		laby[14][10]='#';
		laby[15][10]='#';
		laby[16][10]='#';
		laby[17][10]='#';
		laby[17][11]='#';
		laby[17][12]='#';
		laby[17][13]='#';
		laby[17][14]='#';
		laby[17][15]='#';
		laby[17][16]='#';
		laby[17][17]='#';
		laby[16][17]='#';
		laby[15][17]='#';
		laby[14][17]='#';
		laby[13][17]='#';

		//int tab [] = new int [2];
		//tab = Pacman.getPos();
		//laby[24][14] = 'D';

		for (int k=0; k<32; k++){
			for (int j=0; j<28; j++){
				if (laby[k][j]=='D'){
					laby[k][j]= 'V';
				}
			}
		}
		laby[pos[0]][pos[1]] = 'D';

		laby[posfr[0]][posfr[1]] = 'R';

		//System.out.print(tab [0] + "=======" + tab[1]);

		for (int k=0; k<32; k++){
			for (int j=0; j<28; j++){
				if (laby[k][j]!='#' && laby[k][j]!='D'&& laby[k][j]!='V'){
					laby[k][j]='P';
				}
			}
		}

		for (int k=9; k<32; k++){
			for (int j=0; j<28; j++){
				if (k >9 && k < 20){
					if (j<6 || j>21){
						if (laby[k][j] != '#'){
							laby[k][j]= ' ';
						}
					}
				}
				if ( k >8 && k < 21){
					if (j>6 && j< 21){
						if (laby[k][j] != '#'){
							laby[k][j]= ' ';
						}
					}
				}
			}
		}

		return(laby);
	}


	public static boolean [][] GeneBool(char laby [][]){
		boolean [][] labybool = new boolean [32][28];
		for (int k =0; k<32; k ++){
			for (int j=0; j <28; j++){
				if (laby [k][j] == '#'){
					if(k > 14 && k < 18)
						if (j > 11 && j < 18)
							labybool[k][j] = false;
				}
				else{
					labybool[k][j] = true;
				}
			}
		}
		return labybool;
	}
	public static void Afficher(char laby [][]){
		for (int k=0; k<32; k++){
			for (int j=0; j<28; j++){
				if (j!=27){
					System.out.print(laby[k][j]);
				}
				else{
					System.out.println(laby[k][j]);
				}
			}
		}
	}

	public static void Afficherbool(boolean laby [][]){
		for (int k=0; k<32; k++){
			for (int j=0; j<28; j++){
				if (j!=27){
					System.out.print(laby[k][j]+ "\t");
				}
				else{
					System.out.println(laby[k][j]);
				}
			}
		}
	}

	public static char [][] getLaby(){
		return laby;
	}
//public static void main(String[] args){
	//Afficher(Gene(Pacman.getPos()));
	//Afficherbool(GeneBool(Gene()));
//}





//Graphics g;

//public void ConstGraph(char laby [][]){
	//for (int k=0; k<9; k++){
	//for (int j=0; j<9; j++){
	//if (laby[k][j] == '#'){
	//Panneau.setX(k*100);
	//Panneau.setY(j*100);
	//Panneau.paintComponent(g);
	//}
	//	}
	//}

//}

//public static void main(String[] args){
	//Afficher(Gene());
//}


}