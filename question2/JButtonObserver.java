package question2;

import java.awt.event.ActionListener; // � compl�ter
import java.awt.TextArea;
import java.awt.event.ActionEvent;

/**
 * D�crivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class JButtonObserver implements ActionListener { // � compl�ter

	private String nom;
	private TextArea contenu;

	/**
	 * Constructeur d'objets de classe JButtonObserver
	 * 
	 * @param nom
	 *            le nom du bouton, jbo1, jbo2, jbo3, jmo1, jmo2, jmo3
	 * @param contenu
	 *            la zone de texte de l'applette
	 */
	public JButtonObserver(String nom, TextArea contenu) {
		this.nom = nom;
		this.contenu = contenu;
	}

	/**
	 * affichage d'un message dans la zone de texte ce message est de la forme
	 * observateur this.nom : clic du bouton nom_du_bouton exemple : observateur
	 * jbo1 : clic du bouton A, voir la m�thode getActionCommand()
	 * 
	 * @param �
	 *            compl�ter
	 */
	public void actionPerformed(ActionEvent e /* � compl�ter */) {
		String message = "observeur "+this.nom+" : clic du bouton "+e.getActionCommand(); // � compl�ter, inspirez-vous de l'applette de l'�nonc�
		contenu.append(message + "\n");
		//String message = "Le B"
	}

}

