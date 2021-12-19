package codewarstester;
public class CodeWarsTester {

    public static void main(String[] args) {
        Boolean sheepArray[]={true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true};

        System.out.println(countSheeps(sheepArray));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps){
        int j=0;
        for (int i=0;i<arrayOfSheeps.length;i++){
            Boolean temp=arrayOfSheeps[i];
            if(Boolean.compare(arrayOfSheeps[i], true)==0){
                j+=1;
            }
        }
        return j;
    }
    
}
