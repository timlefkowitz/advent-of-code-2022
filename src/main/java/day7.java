import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("inputs/input-day7.txt"));
        //        String[] compartmentOne;
//        String[] compartmentTwo;




        DirectoryEntry rootDir = new DirectoryEntry(null, "/");
        DirectoryEntry currentDir = rootDir;
        List<DirectoryEntry> allDirs = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] linearr = line.split(" ");
            if("$".equals(linearr[0])){
                if("cd".equals(linearr[1])){
                    if("/".equals(linearr[2])){
                        currentDir = rootDir;
                    } else if("..".equals(linearr[2])){
                        currentDir = currentDir.getParent();
                    } else {
                        currentDir = currentDir.getDir(linearr[2]);
                    }
                }
            } else if("dir".equals(linearr[0])){
                DirectoryEntry de = new DirectoryEntry(currentDir, linearr[1]);
                currentDir.addFile(de);
                allDirs.add(de);
            }else{
                currentDir.addFile(new FileEntry(linearr[1], Long.parseLong(linearr[0])));
            }
        }

        long sizeOfRoot = rootDir.size();
        long spaceLeft = 70000000 - sizeOfRoot;
        long spaceToRemove = 30000000 - spaceLeft;

        List<DirectoryEntry> candidates = new ArrayList<>();


        long count =0;
        for(DirectoryEntry de: allDirs){
            if(de.size() > spaceToRemove){
//                count+= de.size();
                candidates.add(de);
            }
        }
        candidates.add(rootDir);
        candidates.sort((a,b) -> (int)(a.size() - b.size()));
        System.out.println(candidates.get(0).size());

    }

}
