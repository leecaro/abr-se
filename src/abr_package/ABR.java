package abr_package;

import java.util.ArrayList;

public class ABR {
	
	ArrayList<Noeud> arbre = new ArrayList<Noeud>();
	
	public ABR() { // construit un arbre vide
		
		ArrayList<Noeud> arbre = new ArrayList<Noeud>();
		
	}
	
	public void insert(int value) {
		
		boolean b = false;
		int i = 0;
		
		while (i < arbre.size() || b == false) { //vérifier que la valeur à ajouter n'est pas déjà dans l'arbre
			if (value == arbre.get(i).getValue()) { //on compare avec les valeurs des différents noeuds
				b = true;
			}
			i = i + 1;
		}
		
		if (b) { //si elle n'est pas dans l'arbre, on l'ajoute

			Noeud n = new Noeud(value);
			arbre.add(n);
			
		}
		
	}
	
	public boolean isEmpty() {
		return arbre.isEmpty(); //on utilise la méthode isEmpty() de ArrayList
	}
	
	public int nbElements() {
		return arbre.size();
	}
	
}
