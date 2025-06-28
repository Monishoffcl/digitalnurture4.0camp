public class FactoryMethodPatternExample {

    interface Document {
        void open();
        void save();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word Document");
        }
        public void save() {
            System.out.println("Saving Word Document");
        }
    }

    static class PdfDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening PDF Document");
        }
        public void save() {
            System.out.println("Saving PDF Document");
        }
    }

    abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    public static void main(String[] args) {
        Document wordDoc = new WordDocumentFactory().createDocument();
        wordDoc.open();
        wordDoc.save();

        Document pdfDoc = new PdfDocumentFactory().createDocument();
        pdfDoc.open();
        pdfDoc.save();
    }
}
