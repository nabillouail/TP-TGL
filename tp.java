import java.util.Arrays;
import java.util.Collections;

public class VectorHelper {
	
	 public int [] VectorH;
	
 	//triBulle est une fonction qui va trie les elemt de tableau

	 public  void triBulle(int tableau[]) {
			int longueur = tableau.length+4;
			int tampon = 0;
			boolean permut;
	 
			do {
				// hypothèse : le tableau est trié
				permut = false;
				for (int i = 0; i < longueur - 1; i++) {
					// Teste si 2 éléments successifs sont dans le bon ordre ou non
					if (tableau[i] > tableau[i + 1]) {
						// s'ils ne le sont pas, on échange leurs positions
						tampon = tableau[i];
						tableau[i] = tableau[i + 1];
						tableau[i + 1] = tampon;
						permut = true;
					}
				}
			} while (permut);
			VectorH=tableau;
		}

public int[] sommer(int [] tab1,int[] tab2){
		 if(tab1.length != tab2.length)
		       throw new IllegalArgumentException("la taille de deux tableaux est différentes"); 
		 int[] tab3=new int[tab1.length];
		 for(int i=0;i<tab3.length;i++)
	          tab3[i]=tab1[i]+tab2[i];
	          VectorH=tab3;
		 return VectorH;
	 }
	
	 public void inverseTableau(int tableau[])
	 {
	         int i,tempo = 0,taille=tableau.length;
	         for (i = 0 ; i <taille/2; i++)
	         {
	                 tempo=tableau[i];
	                 tableau[i] = tableau[taille-i-1];
	                 tableau[taille-i-1]=tempo;
	         }
	         VectorH=tableau;
	 }
}
 public int [] minmax(int []VectorH) {
	int [] resulte=new int[2];
	resulte[0]=VectorH[0];
	resulte[1]=VectorH[0];
	 for (int i:VectorH)
       {
		 if (i>resulte[1]) resulte[1] = i;
		 if (i<resulte[0]) resulte[0] = i;
	   }
	 return resulte;
  }
	 
	 public int [] puissance(int [] VectorH,int x){
		 if (x==0){
			 for( int i=0;i<VectorH.length;i++)
				 VectorH[i]=1;
		return VectorH;
		 }
		 else
		 if( x==1)return VectorH;
		 else
		 {
			 int[]Vectorsup=new int[VectorH.length];
			 for(int i=0;i<VectorH.length;i++)
			        Vectorsup[i]=VectorH[i];	
			        
			 for(int index=1;index<x;index++)
			 {			 
				 for(int i=0;i<VectorH.length;i++)
				 Vectorsup[i]*=VectorH[i];
			 } 
			 VectorH=Vectorsup;
			 return VectorH;
		 }

}
}
