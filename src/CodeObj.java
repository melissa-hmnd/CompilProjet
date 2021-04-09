import java.util.LinkedList;

public class CodeObj {

    ListeQuad q;
    LinkedList<String> Code = new LinkedList<>();

    public CodeObj(ListeQuad q){
        this.q = q;
    }
    public void CO (){ // parcourir la liste des quads

        for(int i=0;i<q.quads.size();i++){
            // add
            if(q.getQuad(i).getOperateur().equals("+")){
                Code.add("Mov AX ,"+q.getQuad(i).getOperendeG());
                Code.add("Add Ax ,"+q.getQuad(i).getOperendeD());
                Code.add("Mov "+q.getQuad(i).getRes()+", Ax");
            }

            if(q.getQuad(i).getOperateur().equals("x")){
                Code.add("Mov AX ,"+q.getQuad(i).getOperendeG());
                Code.add("Mul Ax ,"+q.getQuad(i).getOperendeD());
                Code.add("Mov "+q.getQuad(i).getRes()+", Ax");
            }

            if(q.getQuad(i).getOperateur().equals("-")){
                Code.add("Mov AX ,"+q.getQuad(i).getOperendeG());
                Code.add("Sub Ax ,"+q.getQuad(i).getOperendeD());
                Code.add("Mov "+q.getQuad(i).getRes()+", Ax");
            }

            if(q.getQuad(i).getOperateur().equals("/")){
                Code.add("Mov AX ,"+q.getQuad(i).getOperendeG());
                Code.add("Div Ax ,"+q.getQuad(i).getOperendeD());
                Code.add("Mov "+q.getQuad(i).getRes()+", Ax");
            }

            //affectation

            if(q.getQuad(i).getOperateur().equals("=")){
                Code.add("Mov "+q.getQuad(i).getRes()+" , "+q.getQuad(i).getOperendeD());
            }


        }
    }


}
