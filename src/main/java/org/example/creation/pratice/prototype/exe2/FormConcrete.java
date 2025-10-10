package org.example.creation.pratice.prototype.exe2;

public class FormConcrete implements FormPrototype {
    private String fields;
    private String styles;
    private String rules;

    public FormConcrete(String fields, String styles, String rules) {
        this.fields = fields;
        this.styles = styles;
        this.rules = rules;
    }

    @Override
    public FormPrototype clonar() {
        return new FormConcrete(this.fields, this.styles, this.rules);
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "Form {" +
                "  fields = " + fields + '\'' +
                ", styles = " + styles + '\'' +
                ", rules = "  + rules  + '}';
    }
}
