package oneDimensionalArray.TCLFUNCTIONALITY;

import java.util.Arrays;

public class Demo {
    String[] db ={"mahesh","pratik","Swaraj","nikhil","ujjwal"};
    String[][] savePoint = new String[10][];
    int index=0;
    public void addName(String name){
        String[] temp = new String[db.length+1];
        for(int i=0;i<db.length;i++){
            temp[i]=db[i];
        }
        temp[db.length]=name;
        savePoint[index] = db;
        index++;
        db = temp;
    }

    public void removeName(String name){
        String[] temp = new String[db.length-1];
        int i;
        for ( i = 0; i < db.length; i++)
            if(db[i].toLowerCase().equals(name.toLowerCase()))
                break;


        if(i<db.length){
            for(int j=0;j<db.length;j++) {
                if (j < i) {
                    temp[j] = db[j];
                } else if (j > i) {
                    temp[j - 1] = db[j];
                }
            }
            savePoint[index++] = db;
            db = temp;
        }
        else
            System.out.println("no record found of"+name+"!!");
    }
    public void updateName(String oldName,String newName){
        String[] temp = new String[db.length];
        int i;
        for ( i = 0; i < db.length; i++)
            if(db[i].toLowerCase().equals(oldName.toLowerCase()))
                break;

        if(i<db.length){
            for(int j=0;j<db.length;j++) {
                if (j < i) {
                    temp[j] = db[j];
                } else if (i==j) {
                    temp[j]=newName;
                } else if (j>i) {
                    temp[j]=db[j];
                }
            }
            savePoint[index++] = db;
            db = temp;
        }
        else{
            System.out.println("no record found of"+oldName+"!!");
        }
    }

    public void rollback(int steps)
    {
        if(steps<index){
            db = savePoint[index-steps];

            index=index-steps;
        }else{
            System.out.println("Sorry rollback steps are invalid!!");
        }
    }

    public void commit(){
        Arrays.fill(savePoint, null);
        index=0;
    }

    public void showSavePoint(){
        for (int i = 0; i < index; i++) {
            System.out.print("Save point "+i+" :" );
            System.out.println(Arrays.toString(savePoint[i]));
        }
    }
    public void showDB(){
        System.out.println(Arrays.toString(db));
    }
}
