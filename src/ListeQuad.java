import java.util.LinkedList;

public class ListeQuad {
    public LinkedList<Quad> quads = new LinkedList<>();
    int q;

    public int addQuad (String operateur, String operendeG, String operendeD, String res){
        Quad nvqd = new Quad(operateur,operendeG,operendeD,res);
        q++;
        quads.add(nvqd);
        return quads.size()-1;
    }
    // pour recuperer le quad
    public Quad getQuad(int index) {
        return quads.get(index);
    }

    //afficher

    public void affQ(){
        for (int i=0;i<quads.size();i++){
            System.out.println(getQuad(i).toString());
        }
    }
    public int position(){
        return q;
    }
}
