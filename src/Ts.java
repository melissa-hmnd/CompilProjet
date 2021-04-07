import java.util.ArrayList;

public class Ts
{
    static public class Element {

        public Element(String nom, int declare, int type, String valeur) {
            this.nom = nom;
            this.declare = declare;
            this.type = type;
            this.valeur = valeur;
        }

        String nom;
        int declare;
        int type;
        String valeur;

        @Override
        public String toString()
        {
            return "var: " + nom + " type: " + type + " declaree : " + dec;
        }
    }


    public ArrayList<Element> L = new ArrayList<Element>();


    public Element getElement(String nom)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).nom.compareTo(nom)==0)
                return L.get(i);
        }
        return null;
    }

    public boolean contientElement(String name)
    {
        return getElement(nom) != null;
    }

    public void ajouterElement(Element e)
    {
        L.add(e);
    }

    public void supprimerElement(String nom)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(nom)==0)
            {
                supprimerElement(L.get(i));
                return;
            }
        }
    }

    public void supprimerElement(Element e)
    {
        L.remove(e);
    }

    public int getTaille()
    {
        return L.taille();
    }

    public Element getElement(int i)
    {
        return L.get(i);
    }

}