import java.util.*;

public class DirectoryEntry extends FileEntry{
    private final DirectoryEntry parent;

    private Map<String, FileEntry> files = new HashMap<>();

    public DirectoryEntry(DirectoryEntry parent, String name) {
        super(name, 0);
        this.parent = parent;
    }

    public Collection<FileEntry> getFiles(){
        return files.values();
    }
    
    public void addFile(FileEntry rs){
        files.put(rs.getName(), rs);
    }
    
    
    public long size(){
        long count = 0;
        for(FileEntry rs: files.values()){
            count += rs.size();
        }
        return count;
    }

    public DirectoryEntry getParent(){
        return parent;
    }


    public DirectoryEntry getDir(String s) {
            return (DirectoryEntry) files.get(s);
    }
}
