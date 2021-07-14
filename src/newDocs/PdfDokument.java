package newDocs;

public class PdfDokument implements Document{

    @Override
    public void getDescription() {
        System.out.println("Jestem dokumentem PDF");
    }
}
