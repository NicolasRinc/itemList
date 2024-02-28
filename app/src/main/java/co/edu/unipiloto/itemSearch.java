package co.edu.unipiloto;

import android.content.Context;

public class itemSearch {
    String solidM[];
    String farmingP[];
    String liquids[];
    String electronic[];

    public itemSearch(Context context){
        this.solidM = context.getResources().getStringArray(R.array.SolidM);
        this.farmingP = context.getResources().getStringArray(R.array.FarmingP);
        this.liquids = context.getResources().getStringArray(R.array.Liquids);
        this.electronic = context.getResources().getStringArray(R.array.Electronic);
    }

    public String getType(String types){
        if(types.equals("Solid Merchandise")){
            return solidM[0] + "\n" + solidM[1] + "\n" + solidM[2] + "\n" + solidM[3];
        }
        if(types.equals("Farming Products")){
            return farmingP[0] + "\n" + farmingP[1] + "\n" + farmingP[2] + "\n" + farmingP[3];
        }
        if(types.equals("Liquids")){
            return liquids[0] + "\n" + liquids[1] + "\n" + liquids[2] ;
        }
        if(types.equals("Electronic")){
            return electronic[0] + "\n" + electronic[1] + "\n" + electronic[2];
        }
        return "no selected item type";
    }
}
