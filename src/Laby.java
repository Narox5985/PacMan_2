import java.awt.Graphics;

public class Laby {

	private static char[][] laby = new char [31][28];


	public static char [][] Gene(int [] pos,  int [][] caractF, boolean fermetureCage, boolean reset){

		anciennePos = Pacman.getAnciennePos();

		for (int i=0; i<28; i++ ){
			laby[0][i]= '#';
			laby[30][i]= '#';
		}
		for (int i=0; i<31; i++ ){
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
		laby[11][7]='#';
		laby[12][7]='#';

		laby[6][8]='#';
		laby[7][8]='#';
		laby[8][8]='#';
		laby[9][8]='#';
		laby[10][8]='#';
		laby[11][8]='#';
		laby[13][8]='#';
		laby[12][8]='#';

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
		laby[13][19]='#';
		laby[12][19]='#';

		laby[6][20]='#';
		laby[7][20]='#';
		laby[8][20]='#';
		laby[9][20]='#';
		laby[10][20]='#';
		laby[11][20]='#';
		laby[13][20]='#';
		laby[12][20]='#';

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
		laby[11][8]='#';
		laby[12][5]='#';
		laby[13][1]='#';
		laby[13][2]='#';
		laby[13][3]='#';
		laby[13][4]='#';
		laby[13][5]='#';

		laby[15][1]='#';
		laby[15][2]='#';
		laby[15][3]='#';
		laby[15][4]='#';
		laby[15][5]='#';
		laby[16][5]='#';
		laby[17][5]='#';
		laby[18][5]='#';
		laby[19][5]='#';
		laby[19][4]='#';
		laby[19][3]='#';
		laby[19][2]='#';
		laby[19][1]='#';

		laby[15][7]='#';
		laby[16][7]='#';
		laby[17][7]='#';
		laby[18][7]='#';
		laby[19][7]='#';
		laby[15][8]='#';
		laby[16][8]='#';
		laby[17][8]='#';
		laby[18][8]='#';
		laby[19][8]='#';

		laby[19][10]='#';
		laby[19][11]='#';
		laby[19][12]='#';
		laby[19][13]='#';
		laby[19][14]='#';
		laby[19][15]='#';
		laby[19][16]='#';
		laby[19][17]='#';
		laby[18][10]='#';
		laby[18][11]='#';
		laby[18][12]='#';
		laby[18][13]='#';
		laby[18][14]='#';
		laby[18][15]='#';
		laby[18][16]='#';
		laby[18][17]='#';
		laby[20][13]='#';
		laby[20][14]='#';
		laby[21][13]='#';
		laby[21][14]='#';
		laby[22][13]='#';
		laby[22][14]='#';

		laby[15][19]='#';
		laby[16][19]='#';
		laby[17][19]='#';
		laby[18][19]='#';
		laby[19][19]='#';
		laby[15][20]='#';
		laby[16][20]='#';
		laby[17][20]='#';
		laby[18][20]='#';
		laby[19][20]='#';

		laby[9][26]='#';
		laby[9][25]='#';
		laby[9][24]='#';
		laby[9][23]='#';
		laby[9][22]='#';
		laby[10][22]='#';
		laby[11][22]='#';
		laby[13][7]='#';
		laby[12][22]='#';
		laby[13][26]='#';
		laby[13][25]='#';
		laby[13][24]='#';
		laby[13][23]='#';
		laby[13][22]='#';

		laby[15][22]='#';
		laby[15][23]='#';
		laby[15][24]='#';
		laby[15][25]='#';
		laby[15][26]='#';
		laby[16][22]='#';
		laby[17][22]='#';
		laby[18][22]='#';
		laby[19][22]='#';
		laby[19][23]='#';
		laby[19][24]='#';
		laby[19][25]='#';
		laby[19][26]='#';

		laby[21][7]='#';
		laby[21][8]='#';
		laby[21][9]='#';
		laby[21][10]='#';
		laby[21][11]='#';
		laby[22][7]='#';
		laby[22][8]='#';
		laby[22][9]='#';
		laby[22][10]='#';
		laby[22][11]='#';

		laby[21][2]='#';
		laby[21][3]='#';
		laby[21][4]='#';
		laby[21][5]='#';
		laby[22][2]='#';
		laby[22][3]='#';
		laby[22][4]='#';
		laby[22][5]='#';
		laby[23][4]='#';
		laby[23][5]='#';
		laby[24][4]='#';
		laby[24][5]='#';
		laby[25][4]='#';
		laby[25][5]='#';

		laby[25][1]='#';
		laby[24][1]='#';
		laby[25][2]='#';
		laby[24][2]='#';

		laby[27][2]='#';
		laby[28][2]='#';
		laby[27][3]='#';
		laby[28][3]='#';
		laby[27][4]='#';
		laby[28][4]='#';
		laby[27][5]='#';
		laby[28][5]='#';
		laby[27][6]='#';
		laby[28][6]='#';
		laby[27][7]='#';
		laby[28][7]='#';
		laby[27][8]='#';
		laby[28][8]='#';
		laby[27][9]='#';
		laby[28][9]='#';
		laby[27][10]='#';
		laby[28][10]='#';
		laby[27][11]='#';
		laby[28][11]='#';
		laby[28][13]='#';
		laby[28][14]='#';
		laby[26][7]='#';
		laby[25][7]='#';
		laby[26][8]='#';
		laby[25][8]='#';
		laby[24][8]='#';
		laby[24][7]='#';

		laby[24][10]='#';
		laby[24][11]='#';
		laby[24][12]='#';
		laby[24][13]='#';
		laby[24][14]='#';
		laby[24][15]='#';
		laby[24][16]='#';
		laby[24][17]='#';
		laby[25][10]='#';
		laby[25][11]='#';
		laby[25][12]='#';
		laby[25][13]='#';
		laby[25][14]='#';
		laby[25][15]='#';
		laby[25][16]='#';
		laby[25][17]='#';
		laby[26][13]='#';
		laby[26][14]='#';
		laby[27][13]='#';
		laby[27][14]='#';

		laby[27][16]='#';
		laby[28][16]='#';
		laby[27][17]='#';
		laby[28][17]='#';
		laby[27][18]='#';
		laby[28][18]='#';
		laby[27][19]='#';
		laby[28][19]='#';
		laby[27][20]='#';
		laby[28][20]='#';
		laby[27][21]='#';
		laby[28][21]='#';
		laby[27][22]='#';
		laby[28][22]='#';
		laby[27][23]='#';
		laby[28][23]='#';
		laby[27][24]='#';
		laby[28][24]='#';
		laby[27][25]='#';
		laby[28][25]='#';
		laby[26][19]='#';
		laby[25][19]='#';
		laby[26][20]='#';
		laby[25][20]='#';
		laby[24][19]='#';
		laby[24][20]='#';

		laby[21][16]='#';
		laby[21][17]='#';
		laby[21][18]='#';
		laby[21][19]='#';
		laby[21][20]='#';
		laby[22][16]='#';
		laby[22][17]='#';
		laby[22][18]='#';
		laby[22][19]='#';
		laby[22][20]='#';

		laby[25][26]='#';
		laby[24][26]='#';
		laby[25][25]='#';
		laby[24][25]='#';

		laby[21][22]='#';
		laby[21][23]='#';
		laby[21][24]='#';
		laby[21][25]='#';
		laby[22][22]='#';
		laby[22][23]='#';
		laby[22][24]='#';
		laby[22][25]='#';
		laby[23][22]='#';
		laby[23][23]='#';
		laby[24][22]='#';
		laby[24][23]='#';
		laby[25][22]='#';
		laby[25][23]='#';

		laby[18][0]=' ';
		laby[17][0]=' ';
		laby[16][0]=' ';
		laby[18][27]=' ';
		laby[17][27]=' ';
		laby[16][27]=' ';

		laby[14][0]=' ';
		laby[11][0]=' ';
		laby[12][0]=' ';
		laby[11][0]=' ';
		laby[10][0]=' ';
		laby[14][27]=' ';
		laby[11][27]=' ';
		laby[12][27]=' ';
		laby[10][27]=' ';
		laby[11][27]=' ';

		laby[12][10]='#';
		laby[12][11]='#';
		laby[12][12]='#';
		laby[12][15]='#';
		laby[12][16]='#';
		laby[12][17]='#';
		laby[13][10]='#';
		laby[14][10]='#';
		laby[15][10]='#';
		laby[16][10]='#';
		laby[16][11]='#';
		laby[16][12]='#';
		laby[16][13]='#';
		laby[16][14]='#';
		laby[16][15]='#';
		laby[16][16]='#';
		laby[16][17]='#';
		laby[15][17]='#';
		laby[14][17]='#';
		laby[13][17]='#';
		laby[12][17]='#';

		if (reset) {
			for (int k = 0; k < 31; k++) {
				for (int j = 0; j < 28; j++) {
					if (laby[k][j] == 'V' ) {
						laby[k][j] = 'P';
					}
				}
			}
		}



		for (int k=0; k<31; k++){
			for (int j=0; j<28; j++){
				if (laby[k][j]=='D'){
					laby[k][j]= 'V';
				}
			}
		}
		laby[anciennePos[0]][anciennePos[1]] = 'D';



		for (int k=0; k<31; k++){
			for (int j=0; j<28; j++){
				if (laby[k][j]!='#' && laby[k][j]!='D'&& laby[k][j]!='V'){
					laby[k][j]='P';
					if (k == 3 && j == 26) {
						laby[k][j] = 'Y';
					}
					if (k == 3  && j == 1) {
						laby[k][j] = 'Y';
					}
					if (k == 23 && j == 26) {
						laby[k][j] = 'Y';
					}
					if (k == 23  && j == 1) {
						laby[k][j] = 'Y';
					}


				}
			}
		}
		laby[12][13]='N';
		laby[12][14]='N';


		for (int k=9; k<31; k++){
			for (int j=0; j<28; j++){
				if (k >9 && k < 20){
					if (j<6 || j>21){
						if (laby[k][j] != '#'&& laby[k][j]!='D'&& laby[k][j]!='N'){
							laby[k][j]= ' ';
						}
					}
				}
				if ( k >8 && k < 21){
					if (j>6 && j< 21){
						if (laby[k][j] != '#'&& laby[k][j]!='D'&& laby[k][j]!='N'){
							laby[k][j]= ' ';
						}
					}
				}
			}
		}


		if (fermetureCage){
			laby[12][13]='M';
			laby[12][14]='M';
		}
		return(laby);
	}


	private static int [] anciennePos;


	private static boolean [][] labybool;

	public static boolean [][] GeneBool(char laby [][]){
		labybool = new boolean [31][28];
		for (int k =0; k<31; k ++){
			for (int j=0; j <28; j++){

				if ((laby [k][j] == '#' || laby[k][j] == 'N'|| laby[k][j] == 'M')){
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
		for (int k=0; k<31; k++){
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
		for (int k=0; k<31; k++){
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
	public static boolean [][] getLabybool(){
		return labybool;
	}


}
