import java.util.ArrayList;

public class ListeQuad {
    public ArrayList<Quad> quads = new ArrayList<>();

    public void addQuad (String operateur, String operendeG, String operendeD, String res){
        Quad q = new Quad(operateur,operendeG,operendeD,res);
        quads.add(q);
    }

    public Quad getQuad(int index) {
        return quads.get(index);
    }

}
