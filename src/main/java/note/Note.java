//@@author peng-217

package note;

public class Note {
    private int noteSceneIndex;
    private String noteContent;
    private String noteTitle;


    public Note(String inputContent,String inputTitle,int inputIndex) {
        this.noteContent = inputContent;
        this.noteSceneIndex = inputIndex;
        this.noteTitle = inputTitle;
    }

    /**
     * Get the note content.
     * @return A string containing note content.
     */
    public String getNoteContent() {
        return noteContent;
    }

    /**
     * Get the scene index of a note.
     * @return The scene index of a note.
     */
    public int getNoteSceneIndex() {
        return noteSceneIndex;
    }

    /**
     * Get the note title.
     * @return A string contains note title.
     */
    public String getNoteTitle() { //title must all in uppercase
        return noteTitle;
    }


}
