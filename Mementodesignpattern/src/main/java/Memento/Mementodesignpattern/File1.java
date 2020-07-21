package Memento.Mementodesignpattern;

public class File1 {
private Object obj;
	
	public void save(File2 fileWriter){
		this.obj=fileWriter.save();
	}
	
	public void undo(File2 fileWriter){
		fileWriter.undoToLastSave(obj);
	}

}