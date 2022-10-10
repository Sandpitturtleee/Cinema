package com.company.test;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

class IntDocumentFilter extends DocumentFilter {
    private final int limit;

    IntDocumentFilter(int limit) {
        this.limit = limit;

    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string,
                             AttributeSet attr) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);

        if (test(sb.toString()) && (doc.getLength() + string.length() <= limit)) {
            super.insertString(fb, offset, string, attr);
            System.out.println(doc.getLength());
        }
    }

    private boolean test(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text,
                        AttributeSet attrs) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (test(sb.toString()) && (doc.getLength() + text.length() <= limit)) {
            super.replace(fb, offset, length, text, attrs);
        } else {
        }

    }

    @Override
    public void remove(FilterBypass fb, int offset, int length)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset + length);



        if(sb.toString().length() == 0) {
            super.replace(fb, offset, length, "", null);
        } else if (test(sb.toString())) {
            super.remove(fb, offset, length);
        }

    }


}
